package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.Child;
import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.constants.DaycareStatus;
import com.skyhigh.daycareapi.model.constants.Role;
import com.skyhigh.daycareapi.model.dto.ChildRequestDto;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.ModelApiResponse;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import com.skyhigh.daycareapi.repository.*;
import com.skyhigh.daycareapi.service.DaycareService;
import com.skyhigh.daycareapi.service.KeycloakUserService;
import com.skyhigh.daycareapi.util.convertor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DaycareServiceImpl implements DaycareService {
    @Autowired
    DaycareRepository daycareRepository;

    @Autowired
    DaycareConvertor daycareConvertor;

    @Autowired
    AddressRepository  addressRepository;

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    ChildRepository childRepository;

    @Autowired
    DayCareApplicationRepository dayCareApplicationRepository;

    @Autowired
    AddressToAddressDto  addressToAddressDto;

    @Autowired
    OwnerConvertor ownerConvertor;

    @Autowired
    KeycloakUserService keycloakUserService;

    @Autowired
    private DayCareApplicationConvertor dayCareApplicationConvertor;

    @Override
    public DayCareDto createDayCare(DayCareDto dayCareDto) {
        Address address = addressToAddressDto.toEntity(dayCareDto.getAddress());
        address = addressRepository.save(address);

        Owner owner = ownerConvertor.toEntity(dayCareDto.getOwners().getFirst());
        String keycloakUserId = keycloakUserService.createUser(owner, Role.PROVIDER);
        owner.setKeycloakUserId(keycloakUserId);
        owner = ownerRepository.save(owner);

        DayCare dayCare = daycareConvertor.toEntity(dayCareDto, address,  owner);
        dayCare = daycareRepository.save(dayCare);

        return daycareConvertor.convert(dayCare);
    }

    @Override
    public List<DayCareDto> listDayCares(DaycareStatus status) {
        List<DayCare> dayCares;
        if (status != null) {
            dayCares = daycareRepository.findByStatus(status);
        } else {
            dayCares = daycareRepository.findAll();
        }
        return dayCares.stream().map(dayCare -> daycareConvertor.convert(dayCare)).collect(Collectors.toList());
    }

    @Override
    public DayCareDto getDayCareById(Integer id) {
        DayCare dayCare = daycareRepository.findById(Long.valueOf(id))
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Daycare not found with id: " + id)
                );
        return daycareConvertor.convert(dayCare);
    }

    @Override
    public DayCareDto getDayCareByEmail(String email) {
        Owner owner = ownerRepository.findByEmail(email);
        if (owner == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found with email: " + email);
        }
        DayCare dayCare = daycareRepository.findDayCareByOwner(owner);
        if (dayCare == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Daycare not found with email: " + email);
        }
        return daycareConvertor.convert(dayCare);
    }

    @Override
    public DayCareDto updateDayCare(DayCareDto dayCareDto) {
        if (dayCareDto.getId() == null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Daycare ID is required"
            );
        }
        DayCare existingDayCare = daycareRepository.findById(dayCareDto.getId())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Daycare not found with id: " + dayCareDto.getId()
                ));
        Address existingAddress = existingDayCare.getAddress();

        Address updatedAddress = addressToAddressDto.toEntity(
                dayCareDto.getAddress()
        );

        if (existingAddress != null) {
            updatedAddress.setId(existingAddress.getId());
        }

        updatedAddress = addressRepository.save(updatedAddress);
        existingDayCare.setAddress(updatedAddress);

        existingDayCare.setName(dayCareDto.getName());
        existingDayCare.setTelephone(dayCareDto.getTelephone());
        if( existingDayCare.getStatus() != dayCareDto.getStatus()) {
            existingDayCare.setStatus(changeDaycareStatus(existingDayCare.getOwner(), dayCareDto.getStatus()));
        }

        DayCare dayCare = daycareRepository.save(existingDayCare);

        return daycareConvertor.convert(dayCare);
    }

    private DaycareStatus changeDaycareStatus(User user, @Valid DaycareStatus status) {
        if  (status == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Daycare status is required");
        } else if (status == DaycareStatus.APPROVED) {
            keycloakUserService.updateUserStatus(user.getKeycloakUserId(), true);
            // Valid status, do nothing
        } else {
            keycloakUserService.updateUserStatus(user.getKeycloakUserId(), false);
        }
        return status;
    }

    @Override
    public DayCareApplicationDto daycareRequestByParent(String parentEmail, Long daycareId, ChildRequestDto childRequestDto) {
        Child child = childRepository.findById(childRequestDto.getChild().getId())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Child not found with id: " + childRequestDto.getChild().getId()
                ));
        DayCare dayCare = daycareRepository.findById(daycareId).orElseThrow(() ->
                    new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Daycare not found with id: " + daycareId
                ));

        DayCareApplication application = DayCareApplication.builder()
                .child(child)
                .dayCare(dayCare)
                .appliedAt(LocalDateTime.now())
                .status(ApplicationStatus.PENDING)
                .build();
        DayCareApplication res = dayCareApplicationRepository.save(application);
        return dayCareApplicationConvertor.convert(res);
    }
}

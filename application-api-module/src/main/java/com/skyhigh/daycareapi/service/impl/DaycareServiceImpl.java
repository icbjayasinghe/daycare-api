package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.dto.AddressDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.OwnerDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import com.skyhigh.daycareapi.repository.AddressRepository;
import com.skyhigh.daycareapi.repository.DaycareRepository;
import com.skyhigh.daycareapi.repository.OwnerRepository;
import com.skyhigh.daycareapi.service.DaycareService;
import com.skyhigh.daycareapi.util.convertor.DaycareConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public DayCareDto createDayCare(DayCareDto dayCareDto) {
        AddressDto addressDto = dayCareDto.getAddress();
        Address address = Address.builder()
                .streetNumber(addressDto.getStreet())
                .city(addressDto.getCity())
                .province(addressDto.getState())
                .postalCode(addressDto.getPostalCode())
                .build();
        address = addressRepository.save(address);

        OwnerDto ownerDto = dayCareDto.getOwners().getFirst();
        Owner owner = Owner.builder()
                .firstName(ownerDto.getFirstName())
                .lastName(ownerDto.getLastName())
                .email(ownerDto.getEmail())
                .phoneNumber(ownerDto.getPhoneNumber())
                .build();
        owner = ownerRepository.save(owner);

        DayCare dayCare = DayCare.builder()
                .name(dayCareDto.getName())
                .address(address)
                .telephone(dayCareDto.getTelephone())
                .owner(owner)
                .build();
        dayCare = daycareRepository.save(dayCare);

        return daycareConvertor.convert(dayCare);
    }

    @Override
    public List<DayCareDto> listDayCares() {
        List<DayCare> dayCares = daycareRepository.findAll();
        return dayCares.stream().map(dayCare -> daycareConvertor.convert(dayCare)).collect(Collectors.toList());
    }
}

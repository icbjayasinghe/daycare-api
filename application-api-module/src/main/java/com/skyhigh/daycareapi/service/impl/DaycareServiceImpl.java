package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import com.skyhigh.daycareapi.repository.AddressRepository;
import com.skyhigh.daycareapi.repository.DaycareRepository;
import com.skyhigh.daycareapi.repository.OwnerRepository;
import com.skyhigh.daycareapi.service.DaycareService;
import com.skyhigh.daycareapi.util.convertor.AddressToAddressDto;
import com.skyhigh.daycareapi.util.convertor.DaycareConvertor;
import com.skyhigh.daycareapi.util.convertor.OwnerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    AddressToAddressDto  addressToAddressDto;

    @Autowired
    OwnerConvertor ownerConvertor;

    @Override
    public DayCareDto createDayCare(DayCareDto dayCareDto) {
        Address address = addressToAddressDto.toEntity(dayCareDto.getAddress());
        address = addressRepository.save(address);

        Owner owner = ownerConvertor.toEntity(dayCareDto.getOwners().getFirst());
        owner = ownerRepository.save(owner);

        DayCare dayCare = daycareConvertor.toEntity(dayCareDto, address,  owner);
        dayCare = daycareRepository.save(dayCare);

        return daycareConvertor.convert(dayCare);
    }

    @Override
    public List<DayCareDto> listDayCares() {
        List<DayCare> dayCares = daycareRepository.findAll();
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
}

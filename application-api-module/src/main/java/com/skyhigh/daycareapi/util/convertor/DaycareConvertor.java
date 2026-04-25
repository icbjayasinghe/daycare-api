package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class DaycareConvertor implements Converter<DayCare, DayCareDto> {
    @Autowired
    AddressToAddressDto addressToAddressDto;

    @Autowired
    OwnerConvertor ownerConvertor;

    @Override
    public DayCareDto convert(DayCare dayCare) {
       return DayCareDto.builder()
               .name(dayCare.getName())
               .telephone(dayCare.getTelephone())
               .address(addressToAddressDto.convert(dayCare.getAddress()))
               .owners(Collections.singletonList(ownerConvertor.convert(dayCare.getOwner())))
               .build();
    }

    public DayCare toEntity(DayCareDto dayCareDto, Address address, Owner owner) {
        return DayCare.builder()
                .name(dayCareDto.getName())
                .address(address)
                .telephone(dayCareDto.getTelephone())
                .owner(owner)
                .build();
    }
}

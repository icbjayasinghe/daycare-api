package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class DaycareConvertor implements Converter<DayCare, DayCareDto> {
    @Autowired
    AddressToAddressDto addressToAddressDto;

    @Override
    public DayCareDto convert(DayCare dayCare) {
       return DayCareDto.builder()
               .name(dayCare.getName())
               .telephone(dayCare.getTelephone())
//               .owners(Collections.emptyList())
               .address(addressToAddressDto.convert(dayCare.getAddress()))
               .build();
    }
}

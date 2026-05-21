package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.dto.OwnerDto;
import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class OwnerConvertor implements Converter<Owner, OwnerDto> {
    @Override
    public OwnerDto convert(Owner owner) {
        return OwnerDto.builder()
                .email(owner.getEmail())
                .firstName(owner.getFirstName())
                .lastName(owner.getLastName())
                .phoneNumber(owner.getPhoneNumber())
                .build();
    }

    public Owner toEntity(OwnerDto owner) {
        return Owner.builder()
                .email(owner.getEmail())
                .firstName(owner.getFirstName())
                .lastName(owner.getLastName())
                .phoneNumber(owner.getPhoneNumber())
                .build();
    }
}

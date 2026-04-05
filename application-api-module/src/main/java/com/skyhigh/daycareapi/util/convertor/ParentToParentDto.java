package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Parent;
import com.skyhigh.daycareapi.model.constants.ParentStatus;
import com.skyhigh.daycareapi.model.dto.AddressDto;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import com.skyhigh.daycareapi.model.dto.ParentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParentToParentDto implements Converter<Parent, ParentDto> {

    @Autowired
    AddressToAddressDto addressToAddressDto;

    @Override
    public ParentDto convert(Parent parent) {

        AddressDto addressDto = addressToAddressDto.convert(parent.getAddress());

        List<ChildDto> childDtoList = new ArrayList<>();

        ParentDto parentDto = ParentDto.builder()
                .id(parent.getId())
                .parentStatus(1)
                .address(addressDto)
                .children(childDtoList)
                .email(parent.getEmail())
                .firstName(parent.getFirstName())
                .lastName(parent.getLastName())
                .password("")
                .phone(parent.getPhoneNumber())
                .build();

        return parentDto;
    }
}

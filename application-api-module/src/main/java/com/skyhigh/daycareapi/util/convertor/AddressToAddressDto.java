package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.dto.AddressDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class AddressToAddressDto implements Converter<Address, AddressDto> {

    @Override
    public AddressDto convert(Address address) {

        AddressDto addressDto = AddressDto.builder()
                .city(address.getCity())
                .country("")
                .postalCode(address.getPostalCode())
                .state(address.getPostalCode())
                .street(address.getStreetNumber())
                .state("")
                .build();
        return addressDto;
    }
}

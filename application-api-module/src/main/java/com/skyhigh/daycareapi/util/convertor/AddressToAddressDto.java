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
                .country(address.getCountry())
                .postalCode(address.getPostalCode())
                .state(address.getState())
                .apartment(address.getApartment())
                .address(address.getAddress())
                .build();
        return addressDto;
    }

    public Address toEntity(AddressDto addressDto) {
        return Address.builder()
                .address(addressDto.getAddress())
                .city(addressDto.getCity())
                .state(addressDto.getState())
                .postalCode(addressDto.getPostalCode())
                .country(addressDto.getCountry())
                .apartment(addressDto.getApartment())
                .build();
    }
}

package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.Parent;
import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.dto.AddressDto;
import com.skyhigh.daycareapi.model.dto.ParentDto;
import com.skyhigh.daycareapi.repository.ParentRepository;
import com.skyhigh.daycareapi.repository.UserRepository;
import com.skyhigh.daycareapi.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ParentRepository parentRepository;

    @Override
    public ParentDto createParent(ParentDto parentDto) {

        if (userRepository.existsUserByEmail(parentDto.getEmail())) {
            // return existing error
        }

        AddressDto addressDto = parentDto.getAddress();
        Address address = Address.builder()
                .streetNumber(addressDto.getStreet())
                .city(addressDto.getCity())
                .province(addressDto.getState())
                .postalCode(addressDto.getPostalCode())
                .build();

        User user = User.builder()
                .email(parentDto.getEmail())
                .firstName(parentDto.getFirstName())
                .lastName(parentDto.getLastName())
                .phoneNumber(parentDto.getPhone())
                .passwordHash(parentDto.getPassword())
                .address(address)
                .build();

        user = userRepository.save(user);

        Parent parent = Parent.builder()
                .address(address)
                .build();

        ParentDto parentDtoRes = new ParentDto();
        return parentDtoRes;
    }
}

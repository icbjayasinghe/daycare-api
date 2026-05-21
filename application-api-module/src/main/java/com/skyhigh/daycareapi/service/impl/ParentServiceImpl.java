package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.Parent;
import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.ParentStatus;
import com.skyhigh.daycareapi.model.dto.AddressDto;
import com.skyhigh.daycareapi.model.dto.ParentDto;
import com.skyhigh.daycareapi.repository.AddressRepository;
import com.skyhigh.daycareapi.repository.ParentRepository;
import com.skyhigh.daycareapi.repository.UserRepository;
import com.skyhigh.daycareapi.service.ParentService;
import com.skyhigh.daycareapi.util.convertor.ParentToParentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ParentRepository parentRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ParentToParentDto parentToParentDto;

    @Override
    public ParentDto createParent(ParentDto parentDto) {

        if (userRepository.existsUserByEmail(parentDto.getEmail())) {
            // return existing error
        }

        AddressDto addressDto = parentDto.getAddress();
        Address address = Address.builder()
                .apartment(addressDto.getApartment())
                .address(addressDto.getAddress())
                .city(addressDto.getCity())
                .state(addressDto.getState())
                .postalCode(addressDto.getPostalCode())
                .build();
        address = addressRepository.save(address);


        User user = User.builder()
                .email(parentDto.getEmail())
                .firstName(parentDto.getFirstName())
                .lastName(parentDto.getLastName())
                .phoneNumber(parentDto.getPhone())
                .passwordHash(parentDto.getPassword())
                .address(address)
                .build();

        Parent parent = new Parent(user, ParentStatus.ACTIVATED);


        parent = parentRepository.save(parent);

        ParentDto parentDtoRes = parentToParentDto.convert(parent);
        return parentDtoRes;
    }
}

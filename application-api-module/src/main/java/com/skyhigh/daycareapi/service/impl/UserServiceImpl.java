package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.dto.LoginRequestDto;
import com.skyhigh.daycareapi.model.dto.LoginResponseDto;
import com.skyhigh.daycareapi.service.KeycloakUserService;
import com.skyhigh.daycareapi.service.UserService;
import com.skyhigh.daycareapi.util.convertor.KeycloakResToLoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private KeycloakUserService keycloakUserService;

    @Autowired
    private KeycloakResToLoginResponseDto keycloakResToLoginResponseDto;

    @Override
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        Map<String, Object> keycloakResponse = keycloakUserService.login(loginRequestDto);
        // Convert the Keycloak response to LoginResponseDto
        return keycloakResToLoginResponseDto.convert(keycloakResponse);
    }
}

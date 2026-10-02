package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Parent;
import com.skyhigh.daycareapi.model.dto.LoginResponseDto;
import com.skyhigh.daycareapi.model.dto.ParentDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KeycloakResToLoginResponseDto implements Converter<Map<String, Object>, LoginResponseDto> {

    @Override
    public LoginResponseDto convert(Map<String, Object> keycloakResponse) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.setAccessToken((String) keycloakResponse.get("access_token"));
        loginResponseDto.setRefreshToken((String) keycloakResponse.get("refresh_token"));
        loginResponseDto.setExpiresIn((Integer) keycloakResponse.get("expires_in"));
//        loginResponseDto.setRefreshExpiresIn((Integer) keycloakResponse.get("refresh_expires_in"));
        loginResponseDto.setTokenType((String) keycloakResponse.get("token_type"));
//        loginResponseDto.setNotBeforePolicy((Integer) keycloakResponse.get("not-before-policy"));
//        loginResponseDto.setSessionState((String) keycloakResponse.get("session_state"));
//        loginResponseDto.setScope((String) keycloakResponse.get("scope"));

        return loginResponseDto;
    }
}

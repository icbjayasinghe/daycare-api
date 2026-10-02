package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.Role;
import com.skyhigh.daycareapi.model.dto.LoginRequestDto;

import java.util.Map;

public interface KeycloakUserService {
    String createUser(User user, Role  role);
    Map<String, Object> login(LoginRequestDto request);
}

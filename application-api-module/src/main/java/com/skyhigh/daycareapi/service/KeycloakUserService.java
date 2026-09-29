package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.Role;

public interface KeycloakUserService {
    String createUser(User user, Role  role);
}

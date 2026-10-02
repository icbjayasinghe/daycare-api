package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.LoginRequestDto;
import com.skyhigh.daycareapi.model.dto.LoginResponseDto;

import java.util.Map;

public interface UserService {
    LoginResponseDto login(LoginRequestDto loginRequestDto);
}

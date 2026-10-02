package com.skyhigh.daycareapi.controller.impl;


import com.skyhigh.daycareapi.controller.UserApi;
import com.skyhigh.daycareapi.model.dto.LoginRequestDto;
import com.skyhigh.daycareapi.model.dto.LoginResponseDto;
import com.skyhigh.daycareapi.service.KeycloakUserService;
import com.skyhigh.daycareapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-29T12:53:35.729441-03:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;

    @Autowired
    UserService userService;

    @Autowired
    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<LoginResponseDto> loginUser(LoginRequestDto loginRequestDto) {
        LoginResponseDto loginResponseDto = userService.login(loginRequestDto);
        return new ResponseEntity<>(loginResponseDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return UserApi.super.logoutUser();
    }
}

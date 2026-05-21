package com.skyhigh.daycareapi.controller.impl;

import com.skyhigh.daycareapi.controller.ParentApi;


import com.skyhigh.daycareapi.model.dto.ParentDto;
import com.skyhigh.daycareapi.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-24T05:54:00.346356-04:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
@CrossOrigin(origins = "http://localhost:4200")
public class ParentApiController implements ParentApi {

    private final NativeWebRequest request;

    @Autowired
    ParentService parentService;

    @Autowired
    public ParentApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ParentDto> createParent(ParentDto parentDto) {
        ParentDto parentDtoRes = parentService.createParent(parentDto);
        return ResponseEntity.ok(parentDtoRes);
    }
}

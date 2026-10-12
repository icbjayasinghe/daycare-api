package com.skyhigh.daycareapi.controller.impl;


import com.skyhigh.daycareapi.controller.ChildApi;
import com.skyhigh.daycareapi.model.dto.*;
import com.skyhigh.daycareapi.service.ChildService;
import com.skyhigh.daycareapi.service.DaycareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-11T15:29:28.395043-03:00[America/Halifax]")
@Controller
@RequestMapping({"${openapi.swaggerDaycare.base-path:/api}"})
public class ChildApiController implements ChildApi {

    private final NativeWebRequest request;

    @Autowired
    private ChildService childService;

    @Autowired
    private DaycareService daycareService;

    @Autowired
    public ChildApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ChildDto> createChildByParent(String parentEmail, ChildDto childDto) {
        ChildDto child = childService.createChildByParent(parentEmail, childDto);
        return new ResponseEntity<>(child, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<ChildDto>> listChildrenByParent(String parentEmail) {
        List<ChildDto> children = childService.getChildrenByParent(parentEmail);
        return new ResponseEntity<>(children, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DayCareApplicationDto> daycareRequestByParent(String parentEmail, Long daycareId, ChildRequestDto childRequestDto) {
        DayCareApplicationDto response = daycareService.daycareRequestByParent(parentEmail, daycareId, childRequestDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

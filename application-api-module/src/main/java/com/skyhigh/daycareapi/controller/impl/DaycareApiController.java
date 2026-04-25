package com.skyhigh.daycareapi.controller.impl;

import com.skyhigh.daycareapi.controller.DaycareApi;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.service.DaycareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"${openapi.swaggerDaycare.base-path:/api}"})
public class DaycareApiController implements DaycareApi {
    private final NativeWebRequest request;

    @Autowired
    DaycareService daycareService;

    @Autowired
    public DaycareApiController(NativeWebRequest request) {
        this.request = request;
    }

    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(this.request);
    }

    @Override
    public ResponseEntity<DayCareDto> createDayCare(DayCareDto dayCareDto) {
        return new ResponseEntity<>(daycareService.createDayCare(dayCareDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<DayCareDto>> listDayCares(String keyword, Float latitude, Float longitude, Float radius) {
        return new ResponseEntity<>(daycareService.listDayCares(),HttpStatus.OK);
    }
}

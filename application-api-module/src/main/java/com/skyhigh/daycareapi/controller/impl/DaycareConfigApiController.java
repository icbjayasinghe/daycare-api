package com.skyhigh.daycareapi.controller.impl;

import com.skyhigh.daycareapi.controller.DaycareConfigApi;


import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.daycareapi.service.DaycareConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T15:45:18.493986-04:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class DaycareConfigApiController implements DaycareConfigApi {

    @Autowired
    private DaycareConfigService daycareConfigService;

    private final NativeWebRequest request;

    @Autowired
    public DaycareConfigApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<DaycareConfigDto> createDaycareConfig(DaycareConfigDto daycareConfigDto) {
        DaycareConfigDto res = daycareConfigService.createDaycareConfiguration(daycareConfigDto);
        return ResponseEntity.ok(res);
    }

    @Override
    public ResponseEntity<DaycareConfigDto> getDaycareConfigById(Long configId) {
        DaycareConfigDto daycareConfigDto = daycareConfigService.getDaycareConfiguration(configId);
        return ResponseEntity.ok(daycareConfigDto);
    }

    @Override
    public ResponseEntity<DaycareConfigDto> updateDaycareConfig(Long configId, DaycareConfigDto daycareConfigDto) {
        return DaycareConfigApi.super.updateDaycareConfig(configId, daycareConfigDto);
    }
}

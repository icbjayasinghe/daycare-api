package com.skyhigh.daycareapi.controller.impl;


import com.skyhigh.daycareapi.controller.ApplicationApi;
import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-12T19:07:16.217535-03:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class ApplicationApiController implements ApplicationApi {

    private final NativeWebRequest request;

    @Autowired
    public ApplicationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Autowired
    private ApplicationService applicationService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<DayCareApplicationDto>> getApplicationList(String loggedInParentEmail, String loggedInDayCareEmail, ApplicationStatus status) {
        List<DayCareApplicationDto> response = applicationService.getApplications(loggedInParentEmail, loggedInDayCareEmail, status);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<DayCareApplicationDto> editApplication(DayCareApplicationDto dayCareApplicationDto) {
        DayCareApplicationDto response = applicationService.updateApplication(dayCareApplicationDto);
        return ResponseEntity.ok(response);
    }
}

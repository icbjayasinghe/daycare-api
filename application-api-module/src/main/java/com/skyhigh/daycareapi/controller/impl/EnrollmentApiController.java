package com.skyhigh.daycareapi.controller.impl;


import com.skyhigh.daycareapi.controller.EnrollmentApi;
import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import com.skyhigh.daycareapi.model.dto.DayCareEnrollmentDto;
import com.skyhigh.daycareapi.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-23T18:39:30.912736-03:00[America/Halifax]")
@Controller
@RequestMapping({"${openapi.swaggerDaycare.base-path:/api}"})
public class EnrollmentApiController implements EnrollmentApi {

    private final NativeWebRequest request;

    @Autowired
    public EnrollmentApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Autowired
    EnrollmentService enrollmentService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<DayCareEnrollmentDto>> getEnrollmentList(String loggedInParentEmail, String loggedInDayCareEmail, EnrollmentStatus status) {
        List<DayCareEnrollmentDto> response = enrollmentService.getEnrollmentList(loggedInParentEmail, loggedInDayCareEmail, status);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<DayCareEnrollmentDto> editEnrollment(DayCareEnrollmentDto dayCareEnrollmentDto) {
        DayCareEnrollmentDto updatedEnrollment = enrollmentService.updateEnrollment(dayCareEnrollmentDto);
        return ResponseEntity.ok(updatedEnrollment);
    }
}

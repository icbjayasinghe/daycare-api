package com.skyhigh.daycareapi.billing.billingapimodule.controller.impl;


import com.skyhigh.daycareapi.billing.billingapimodule.controller.FeePlansApi;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import com.skyhigh.daycareapi.billing.billingapimodule.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-08T08:06:05.738988-04:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class FeePlansApiController implements FeePlansApi {

    private final NativeWebRequest request;

    @Autowired
    FeeService feeService;

    @Autowired
    public FeePlansApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<FeePlanDto>> getFeePlans(Long daycareId, Boolean active) {
        List<FeePlanDto> feePlans = feeService.getFeePlans(daycareId, active);
        return ResponseEntity.ok(feePlans);
    }


        @Override
    public ResponseEntity<FeePlanDto> createFeePlan(FeePlanDto feePlanDto) {
        FeePlanDto feePlan = feeService.createFeePlan(feePlanDto);
        return ResponseEntity.ok(feePlan);
    }
}

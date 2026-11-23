package com.skyhigh.daycareapi.billing.billingapimodule.controller.impl;


import com.skyhigh.daycareapi.billing.billingapimodule.controller.FundingProgramsApi;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FundingProgramDto;
import com.skyhigh.daycareapi.billing.billingapimodule.service.FundingProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-23T10:19:20.455321-04:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class FundingProgramsApiController implements FundingProgramsApi {

    private final NativeWebRequest request;

    @Autowired
    public FundingProgramsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Autowired
    FundingProgramService fundingProgramService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<FundingProgramDto> createFundingProgram(FundingProgramDto fundingProgramDto) {
        FundingProgramDto fundingProgramDtoRes = fundingProgramService.createFundingProgram(fundingProgramDto);
        return ResponseEntity.ok(fundingProgramDtoRes);
    }

    @Override
    public ResponseEntity<List<FundingProgramDto>> getAllFundingPrograms(Boolean active, FundingType fundingType) {
        List<FundingProgramDto> fundingProgramDtoRes = fundingProgramService.getAllFundingProgram(active, fundingType);
        return ResponseEntity.ok(fundingProgramDtoRes);
    }
}

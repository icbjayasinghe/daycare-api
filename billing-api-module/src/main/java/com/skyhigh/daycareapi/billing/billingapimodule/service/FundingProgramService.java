package com.skyhigh.daycareapi.billing.billingapimodule.service;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FundingProgramDto;

import java.util.List;

public interface FundingProgramService {

    FundingProgramDto createFundingProgram(FundingProgramDto fundingProgramDto);

    List<FundingProgramDto> getAllFundingProgram(Boolean active, FundingType fundingType);
}

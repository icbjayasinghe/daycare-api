package com.skyhigh.daycareapi.billing.billingapimodule.service;

import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;

import java.util.List;

public interface FeeService {

    FeePlanDto createFeePlan(FeePlanDto feePlanDto);

    List<FeePlanDto> getFeePlans(Long daycareId, Boolean active);
}

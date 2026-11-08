package com.skyhigh.daycareapi.billing.billingapimodule.service.impl;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import com.skyhigh.daycareapi.billing.billingapimodule.repository.FeePlanRepository;
import com.skyhigh.daycareapi.billing.billingapimodule.service.FeeService;
import com.skyhigh.daycareapi.billing.billingapimodule.util.convertor.FeePlanConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServiceImpl implements FeeService {
    @Autowired
    private FeePlanRepository feePlanRepository;
    @Autowired
    private FeePlanConvertor feePlanConvertor;

    @Override
    public FeePlanDto createFeePlan(FeePlanDto feePlanDto) {

        return null;
    }

    @Override
    public List<FeePlanDto> getFeePlans(Long daycareId, Boolean active) {
        List<FeePlan> feePlans = feePlanRepository.findByDaycareIdAndActive(daycareId, active);
        List<FeePlanDto> feePlanDtoList = feePlans.stream().map(feePlan -> feePlanConvertor.convert(feePlan)).toList(); // Use
        return feePlanDtoList;
    }
}

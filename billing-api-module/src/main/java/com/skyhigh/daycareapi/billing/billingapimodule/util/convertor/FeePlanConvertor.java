package com.skyhigh.daycareapi.billing.billingapimodule.util.convertor;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class FeePlanConvertor implements Converter<FeePlan, FeePlanDto>{
    @Override
    public FeePlanDto convert(FeePlan source) {
        FeePlanDto feePlanDto = new FeePlanDto();
        feePlanDto.setId(source.getId());
        feePlanDto.setName(source.getName());
        feePlanDto.setDescription(source.getDescription());
        feePlanDto.setMonthlyFee(source.getMonthlyFee());
        feePlanDto.setActive(source.getActive());
        return feePlanDto;
    }

    public FeePlan toEntity(FeePlanDto dto) {
        FeePlan feePlan = new FeePlan();
        feePlan.setId(dto.getId());
        feePlan.setName(dto.getName());
        feePlan.setDescription(dto.getDescription());
        feePlan.setMonthlyFee(dto.getMonthlyFee());
        feePlan.setActive(dto.getActive());
        return feePlan;
    }

}
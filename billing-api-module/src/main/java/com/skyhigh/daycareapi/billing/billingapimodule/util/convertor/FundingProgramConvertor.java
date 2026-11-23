package com.skyhigh.daycareapi.billing.billingapimodule.util.convertor;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.FundingProgram;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FundingProgramDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class FundingProgramConvertor implements Converter<FundingProgram, FundingProgramDto> {

    @Override
    public FundingProgramDto convert(FundingProgram source) {
        FundingProgramDto dto = FundingProgramDto.builder()
                .id(source.getId())
                .code(source.getCode())
                .name(source.getName())
                .description(source.getDescription())
                .fundingType(source.getFundingType())
                .active(source.getActive())
                .build();
        return dto;
    }

    public FundingProgram toEntity(FundingProgramDto dto) {
        FundingProgram fundingProgram = new FundingProgram();
        fundingProgram.setCode(dto.getCode());
        fundingProgram.setName(dto.getName());
        fundingProgram.setDescription(dto.getDescription());
        fundingProgram.setFundingType(dto.getFundingType());
        fundingProgram.setActive(dto.getActive());
        return fundingProgram;
    }
}

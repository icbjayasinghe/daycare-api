package com.skyhigh.daycareapi.billing.billingapimodule.service.impl;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FundingProgram;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FundingProgramDto;
import com.skyhigh.daycareapi.billing.billingapimodule.repository.FundingProgramRepository;
import com.skyhigh.daycareapi.billing.billingapimodule.service.FundingProgramService;
import com.skyhigh.daycareapi.billing.billingapimodule.util.convertor.FundingProgramConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundingProgramServiceImpl implements FundingProgramService {

    @Autowired
    private FundingProgramRepository fundingProgramRepository;

    @Autowired
    private FundingProgramConvertor fundingProgramConvertor;

    @Override
    public FundingProgramDto createFundingProgram(FundingProgramDto fundingProgramDto) {
        FundingProgram fundingProgram = fundingProgramRepository.save(fundingProgramConvertor.toEntity(fundingProgramDto));
        return fundingProgramConvertor.convert(fundingProgram);
    }

    @Override
    public List<FundingProgramDto> getAllFundingProgram(Boolean active, FundingType fundingType) {
        if (active != null && fundingType != null) {
            return fundingProgramRepository.findByActiveAndFundingType(active, fundingType)
                    .stream()
                    .map(fundingProgramConvertor::convert)
                    .toList();
        } else if (active != null) {
            return fundingProgramRepository.findByActive(active)
                    .stream()
                    .map(fundingProgramConvertor::convert)
                    .toList();
        } else if (fundingType != null) {
            return fundingProgramRepository.findByFundingType(fundingType)
                    .stream()
                    .map(fundingProgramConvertor::convert)
                    .toList();
        }
        return fundingProgramRepository.findAll()
                .stream()
                .map(fundingProgramConvertor::convert)
                .toList();
    }
}

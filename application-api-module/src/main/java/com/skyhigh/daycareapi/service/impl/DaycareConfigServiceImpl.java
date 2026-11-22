package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.daycareapi.repository.DaycareConfigRepository;
import com.skyhigh.daycareapi.repository.DaycareRepository;
import com.skyhigh.daycareapi.service.DaycareConfigService;
import com.skyhigh.daycareapi.util.convertor.DaycareConfigConvertor;
import com.skyhigh.domainmodule.model.DaycareConfig;
import com.skyhigh.domainmodule.model.facility.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DaycareConfigServiceImpl implements DaycareConfigService {

    @Autowired
    DaycareConfigRepository daycareConfigRepository;

    @Autowired
    DaycareRepository daycareRepository;

    @Autowired
    DaycareConfigConvertor daycareConfigConvertor;

    @Override
    public DaycareConfigDto getDaycareConfiguration(Long daycareId) {
        DaycareConfig daycareConfig = daycareConfigRepository.findDaycareConfigByDayCareId(daycareId);
        if(daycareConfig == null){
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DaycareConfig not found for id: " + daycareConfig);
        }
        return daycareConfigConvertor.convert(daycareConfig);
    }

    @Override
    public DaycareConfigDto createDaycareConfiguration(DaycareConfigDto daycareConfigDto) {
        DayCare daycare = daycareRepository.findById(daycareConfigDto.getDaycareId())
                .orElseThrow(() -> new IllegalArgumentException("DayCare not found for id: " + daycareConfigDto.getDaycareId()));
        DaycareConfig daycareConfig = daycareConfigConvertor.toEntity(daycareConfigDto);
        daycareConfig.setDayCare(daycare);
        DaycareConfig res =  daycareConfigRepository.save(daycareConfig);
        return daycareConfigConvertor.convert(res);
    }

    @Override
    public DaycareConfigDto updateDaycareConfiguration(Long daycareId, DaycareConfigDto daycareConfigDto) {
        DaycareConfig daycareConfig = daycareConfigRepository.findDaycareConfigByDayCareId(daycareId);
        if(daycareConfig == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DaycareConfig not found for id: " + daycareConfig);
        }
        daycareConfig.setTotalCapacity(daycareConfigDto.getTotalCapacity());
        daycareConfig.setHourlyCharge(daycareConfigDto.getHourlyCharge());
        daycareConfig.setPaymentsEnabled(daycareConfigDto.getPaymentsEnabled());
        DaycareConfig res = daycareConfigRepository.save(daycareConfig);
        return daycareConfigConvertor.convert(res);
    }
}

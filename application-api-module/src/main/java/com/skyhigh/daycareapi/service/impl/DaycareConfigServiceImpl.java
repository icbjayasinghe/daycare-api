package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.daycareapi.repository.DaycareConfigRepository;
import com.skyhigh.daycareapi.repository.DaycareRepository;
import com.skyhigh.daycareapi.service.DaycareConfigService;
import com.skyhigh.daycareapi.util.convertor.DaycareConfigConvertor;
import com.skyhigh.domainmodule.model.DaycareConfig;
import com.skyhigh.domainmodule.model.facility.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaycareConfigServiceImpl implements DaycareConfigService {

    @Autowired
    DaycareConfigRepository daycareConfigRepository;

    @Autowired
    DaycareRepository daycareRepository;

    @Autowired
    DaycareConfigConvertor daycareConfigConvertor;

    @Override
    public DaycareConfigDto getDaycareConfiguration(Long configId) {
        DaycareConfig daycareConfig = daycareConfigRepository.findById(configId)
                .orElseThrow(() -> new IllegalArgumentException("DaycareConfig not found for id: " + configId));
        return daycareConfigConvertor.convert(daycareConfig);
    }

    @Override
    public DaycareConfigDto createDaycareConfiguration(DaycareConfigDto daycareConfigDto) {
        DayCare daycare = daycareRepository.findById(daycareConfigDto.getDayCareId())
                .orElseThrow(() -> new IllegalArgumentException("DayCare not found for id: " + daycareConfigDto.getDayCareId()));
        DaycareConfig daycareConfig = daycareConfigConvertor.toEntity(daycareConfigDto);
        daycareConfig.setDayCare(daycare);
        DaycareConfig res =  daycareConfigRepository.save(daycareConfig);
        return daycareConfigConvertor.convert(res);
    }
}

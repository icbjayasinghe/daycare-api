package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.daycareapi.repository.DaycareConfigRepository;
import com.skyhigh.daycareapi.service.DaycareConfigService;
import com.skyhigh.daycareapi.util.convertor.DaycareConfigConvertor;
import com.skyhigh.domainmodule.model.DaycareConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaycareConfigServiceImpl implements DaycareConfigService {

    @Autowired
    DaycareConfigRepository daycareConfigRepository;

    @Autowired
    DaycareConfigConvertor daycareConfigConvertor;

    @Override
    public DaycareConfigDto getDaycareConfiguration(Long configId) {
        DaycareConfig daycareConfig = daycareConfigRepository.findById(configId)
                .orElseThrow(() -> new IllegalArgumentException("DaycareConfig not found for id: " + configId));
        return daycareConfigConvertor.convert(daycareConfig);
    }
}

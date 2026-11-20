package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;

public interface DaycareConfigService {
    DaycareConfigDto getDaycareConfiguration(Long configId);

    DaycareConfigDto createDaycareConfiguration(DaycareConfigDto daycareConfigDto);

    DaycareConfigDto updateDaycareConfiguration(Long configId, DaycareConfigDto daycareConfigDto);
}

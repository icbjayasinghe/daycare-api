package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;

public interface DaycareConfigService {
    DaycareConfigDto getDaycareConfiguration(Long configId);
}

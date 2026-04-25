package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.DayCareDto;

import java.util.List;

public interface DaycareService {
    DayCareDto createDayCare(DayCareDto dayCareDto);

    List<DayCareDto> listDayCares();
}

package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.ChildRequestDto;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.ModelApiResponse;

import java.util.List;

public interface DaycareService {
    DayCareDto createDayCare(DayCareDto dayCareDto);

    List<DayCareDto> listDayCares();

    DayCareDto getDayCareById(Integer id);

    DayCareDto getDayCareByEmail(String email);

    DayCareDto updateDayCare(DayCareDto dayCareDto);

    DayCareApplicationDto daycareRequestByParent(String parentEmail, Long daycareId, ChildRequestDto childRequestDto);
}

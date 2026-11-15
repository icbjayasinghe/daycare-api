package com.skyhigh.daycareapi.service;

import com.skyhigh.domainmodule.model.constants.DaycareStatus;
import com.skyhigh.daycareapi.model.dto.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DaycareService {
    DayCareDto createDayCare(DayCareDto dayCareDto);

    List<DayCareDto> listDayCares(DaycareStatus status);

    DayCareDto getDayCareById(Integer id);

    DayCareDto getDayCareByEmail(String email);

    DayCareDto updateDayCare(DayCareDto dayCareDto);

    DayCareApplicationDto daycareRequestByParent(String parentEmail, Long daycareId, ChildRequestDto childRequestDto);

    DaycareDashboardDto getDaycareDashboard(String email);

    DaycareLogoDto uploadDaycareLogo(Long daycareId, MultipartFile file);

    DaycareLogoDto getDaycareLogo(Long daycareId);
}

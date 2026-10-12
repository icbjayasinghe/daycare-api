package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;

import java.util.List;

public interface ApplicationService {
    List<DayCareApplicationDto> getApplications(String parentEmail, String dayCareEmail);
}

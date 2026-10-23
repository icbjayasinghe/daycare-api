package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import com.skyhigh.daycareapi.model.dto.DayCareEnrollmentDto;

import java.util.List;

public interface EnrollmentService {
    List<DayCareEnrollmentDto> getEnrollmentList(String loggedInParentEmail, String loggedInDayCareEmail, EnrollmentStatus status);
}

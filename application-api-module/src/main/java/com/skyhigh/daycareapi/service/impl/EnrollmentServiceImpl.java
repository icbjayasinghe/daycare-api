package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.DayCareEnrollment;
import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import com.skyhigh.daycareapi.model.dto.DayCareEnrollmentDto;
import com.skyhigh.daycareapi.repository.DayCareEnrollmentRepository;
import com.skyhigh.daycareapi.service.EnrollmentService;
import com.skyhigh.daycareapi.util.convertor.EnrollmentConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private DayCareEnrollmentRepository enrollmentRepository;

    @Autowired
    EnrollmentConvertor enrollmentConvertor;

    @Override
    public List<DayCareEnrollmentDto> getEnrollmentList(String loggedInParentEmail, String loggedInDayCareEmail, EnrollmentStatus status) {
        List<DayCareEnrollment> enrollments = enrollmentRepository.findDayCareEnrollmentByParentEmail(loggedInParentEmail);
        List<DayCareEnrollmentDto> response = enrollments.stream().map(enrollment -> {

            return enrollmentConvertor.convert(enrollment); // Replace with actual conversion logic
        }).toList();

        return response;
    }
}

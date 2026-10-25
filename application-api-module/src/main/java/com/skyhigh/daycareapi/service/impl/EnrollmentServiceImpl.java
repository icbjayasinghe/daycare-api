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
    public List<DayCareEnrollmentDto> getEnrollmentList(String parentEmail, String dayCareEmail, EnrollmentStatus status) {

        List<DayCareEnrollment> enrollments = List.of();

        if (parentEmail != null && !parentEmail.isEmpty()) {
            if (status == null) {
                enrollments = enrollmentRepository.findDayCareEnrollmentByParentEmail(parentEmail);
            } else {
                enrollments = enrollmentRepository.findDayCareEnrollmentByParentEmailAndStatus(parentEmail, status);
            }
        }
        if (dayCareEmail != null && !dayCareEmail.isEmpty()) {
            if (status == null) {
                enrollments = enrollmentRepository.findDayCareEnrollmentByDaycareEmail(dayCareEmail);

            } else {
                enrollments = enrollmentRepository.findDayCareEnrollmentByDaycareEmailAndStatus(dayCareEmail, status);
            }
        }
        List<DayCareEnrollmentDto> response = enrollments.stream().map(enrollment -> {

            return enrollmentConvertor.convert(enrollment); // Replace with actual conversion logic
        }).toList();

        return response;
    }

    @Override
    public DayCareEnrollmentDto updateEnrollment(DayCareEnrollmentDto dayCareEnrollmentDto) {
        DayCareEnrollment enrollment = enrollmentRepository.findById(dayCareEnrollmentDto.getId())
                .orElseThrow(() -> new RuntimeException("Enrollment not found with id: " + dayCareEnrollmentDto.getId()));
        if (dayCareEnrollmentDto.getStatus() != null) {
            enrollment.setStatus(dayCareEnrollmentDto.getStatus());
        }
        return enrollmentConvertor.convert(enrollmentRepository.save(enrollment));
    }}

package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Child;
import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.DayCareEnrollment;
import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.repository.ChildRepository;
import com.skyhigh.daycareapi.repository.DayCareApplicationRepository;
import com.skyhigh.daycareapi.repository.DayCareEnrollmentRepository;
import com.skyhigh.daycareapi.service.ApplicationService;
import com.skyhigh.daycareapi.util.convertor.DayCareApplicationConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    DayCareApplicationRepository applicationRepository;

    @Autowired
    DayCareEnrollmentRepository enrollmentRepository;

    @Autowired
    ChildRepository childRepository;

    @Autowired
    DayCareApplicationConvertor applicationConvertor;

    @Override
    public List<DayCareApplicationDto> getApplications(String parentEmail, String dayCareEmail, ApplicationStatus status) {
        if (parentEmail != null && !parentEmail.isEmpty()) {
            if (status != null) {
                List<DayCareApplicationDto> applications = applicationRepository.findAllByParentEmailAndStatus(parentEmail, status)
                        .stream()
                        .map(application -> {
                            DayCareApplicationDto dto = applicationConvertor.convert(application);
                            return dto;
                        })
                        .toList();
                return applications;
            }
            List<DayCareApplicationDto> applications = applicationRepository.findAllByParentEmail(parentEmail)
                    .stream()
                    .map(application -> {
                        DayCareApplicationDto dto = applicationConvertor.convert(application);
                        return dto;
                    })
                    .toList();
            return applications;
        } else if (dayCareEmail != null && !dayCareEmail.isEmpty()) {
            if(status != null) {
                List<DayCareApplicationDto> applications = applicationRepository.findAllByDaycareEmailAndStatus(dayCareEmail, status)
                        .stream()
                        .map(application -> {
                            DayCareApplicationDto dto = applicationConvertor.convert(application);
                            return dto;
                        })
                        .toList();
                return applications;
            }
            List<DayCareApplicationDto> applications = applicationRepository.findAllByDayCareEmail(dayCareEmail)
                    .stream()
                    .map(application -> {
                        DayCareApplicationDto dto = applicationConvertor.convert(application);
                        return dto;
                    })
                    .toList();
            return applications;
        }
        return List.of();
    }

    @Override
    public DayCareApplicationDto updateApplication(DayCareApplicationDto newApplicationDto) {
        DayCareApplication application = applicationRepository.findById(newApplicationDto.getId())
                .orElseThrow(()-> new RuntimeException("Application not found with id: " + newApplicationDto.getId()));


        if (newApplicationDto.getStatus() == ApplicationStatus.ACCEPTED) {
            DayCareEnrollment enrollment = DayCareEnrollment.builder()
                    .child(application.getChild())
                    .dayCare(application.getDayCare())
//                    .endDate()
//                    .enrollmentDate(java.time.LocalDate.now())
//                    .schedule()
                    .status(EnrollmentStatus.ACTIVE)
                    .build();
            enrollmentRepository.save(enrollment);
        }
        application.setStatus(newApplicationDto.getStatus());
        DayCareApplication   res = applicationRepository.save(application);

        return applicationConvertor.convert(res);
    }
}

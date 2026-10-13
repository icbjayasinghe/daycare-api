package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.repository.DayCareApplicationRepository;
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
                List<DayCareApplicationDto> applications = applicationRepository.findAllByDaycareEmailAndStatus(parentEmail, status)
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
}

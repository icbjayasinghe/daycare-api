package com.skyhigh.daycareapi.service.impl;

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
    public List<DayCareApplicationDto> getApplications(String parentEmail, String dayCareEmail) {
        if (parentEmail != null && !parentEmail.isEmpty()) {
            List<DayCareApplicationDto> applications = applicationRepository.findAllByParentEmail(parentEmail)
                    .stream()
                    .map(application -> {
                        DayCareApplicationDto dto = applicationConvertor.convert(application);
                        return dto;
                    })
                    .toList();
            return applications;
        } else if (dayCareEmail != null && !dayCareEmail.isEmpty()) {
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

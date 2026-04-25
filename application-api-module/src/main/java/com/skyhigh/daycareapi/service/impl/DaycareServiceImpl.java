package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.repository.DaycareRepository;
import com.skyhigh.daycareapi.service.DaycareService;
import com.skyhigh.daycareapi.util.convertor.DaycareConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DaycareServiceImpl implements DaycareService {
    @Autowired
    DaycareRepository daycareRepository;

    @Autowired
    DaycareConvertor daycareConvertor;

    @Override
    public DayCareDto createDayCare(DayCareDto dayCareDto) {
        return null;
    }

    @Override
    public List<DayCareDto> listDayCares() {
        List<DayCare> dayCares = daycareRepository.findAll();
        return dayCares.stream().map(dayCare -> daycareConvertor.convert(dayCare)).collect(Collectors.toList());
    }
}

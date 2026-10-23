package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.DayCareEnrollment;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.DayCareEnrollmentDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import com.skyhigh.daycareapi.service.DaycareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentConvertor implements Converter<DayCareEnrollment, DayCareEnrollmentDto> {

    @Autowired
    DaycareConvertor daycareConvertor;

    @Autowired
    ChildConvertor childConvertor;

    @Autowired
    AddressToAddressDto addressToAddressDto;

    @Autowired
    OwnerConvertor ownerConvertor;

    @Override
    public DayCareEnrollmentDto convert(DayCareEnrollment enrollment) {
        DayCareDto daycareDto = daycareConvertor.convert(enrollment.getDayCare());
        ChildDto childDto = childConvertor.convert(enrollment.getChild());
        return DayCareEnrollmentDto.builder()
                .id(enrollment.getId())
                .daycare(daycareDto)
                .status(enrollment.getStatus())
                .child(childDto)
                .enrollmentDate(enrollment.getEnrollmentDate())
                .schedule(enrollment.getSchedule())
//                .endDate(enrollment.getEndDate())
                .build();
    }

    public DayCareEnrollment toEntity(DayCareEnrollmentDto daycareEnrollmentDto) {
        Address address = addressToAddressDto.toEntity(daycareEnrollmentDto.getDaycare().getAddress());
        Owner owner = ownerConvertor.toEntity(daycareEnrollmentDto.getDaycare().getOwners().get(0));
        return DayCareEnrollment.builder()
                .id(daycareEnrollmentDto.getId())
                .child(childConvertor.toEntity(daycareEnrollmentDto.getChild()))
                .dayCare(daycareConvertor.toEntity(daycareEnrollmentDto.getDaycare(),address,owner))
                .status(daycareEnrollmentDto.getStatus())
                .enrollmentDate(daycareEnrollmentDto.getEnrollmentDate())
                .schedule(daycareEnrollmentDto.getSchedule())
//                .endDate(daycareEnrollmentDto.getEndDate())
                .build();
    }
}

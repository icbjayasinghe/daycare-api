package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import com.skyhigh.daycareapi.model.dto.DayCareApplicationDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.time.ZoneId;

@Service
public class DayCareApplicationConvertor implements Converter<DayCareApplication, DayCareApplicationDto> {

    @Autowired
    DaycareConvertor daycareConvertor;

    @Autowired
    ChildConvertor childConvertor;

    @Override
    public DayCareApplicationDto convert(DayCareApplication dayCareApplication) {
        DayCare dayCare = dayCareApplication.getDayCare();
        DayCareDto dayCareDto = daycareConvertor.convert(dayCare);
        ChildDto childDto = childConvertor.convert(dayCareApplication.getChild());


        return DayCareApplicationDto.builder()
                .id(dayCareApplication.getId())
                .dayCare(dayCareDto)
                .child(childDto)
                .appliedAt(dayCareApplication.getAppliedAt().atZone(ZoneId.of("America/Halifax"))
                        .toOffsetDateTime())
                .status(dayCareApplication.getStatus())
                .build();
    }
}

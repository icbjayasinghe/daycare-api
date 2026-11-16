package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.domainmodule.model.DaycareConfig;
import com.skyhigh.domainmodule.model.facility.DayCare;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class DaycareConfigConvertor  implements Converter<DaycareConfig, DaycareConfigDto> {

    @Override
    public DaycareConfigDto convert(DaycareConfig source) {
        DaycareConfigDto dto = DaycareConfigDto.builder()
                .configId(source.getConfigId())
                .totalCapacity(source.getTotalCapacity())
                .hourlyCharge(source.getHourlyCharge())
                .build();
        return dto;
    }


}

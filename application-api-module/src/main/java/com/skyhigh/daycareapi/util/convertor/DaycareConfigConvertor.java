package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.dto.DaycareConfigDto;
import com.skyhigh.domainmodule.model.DaycareConfig;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class DaycareConfigConvertor  implements Converter<DaycareConfig, DaycareConfigDto> {

    @Override
    public DaycareConfigDto convert(DaycareConfig source) {
        DaycareConfigDto dto = DaycareConfigDto.builder()
                .configId(source.getConfigId())
                .dayCareId(source.getDayCare().getId())
                .totalCapacity(source.getTotalCapacity())
                .hourlyCharge(source.getHourlyCharge())
                .build();
        return dto;
    }

    public DaycareConfig toEntity(DaycareConfigDto dto) {
        DaycareConfig entity = new DaycareConfig();
        entity.setConfigId(dto.getConfigId());
        entity.setTotalCapacity(dto.getTotalCapacity());
        entity.setHourlyCharge(dto.getHourlyCharge());
        return entity;
    }

}

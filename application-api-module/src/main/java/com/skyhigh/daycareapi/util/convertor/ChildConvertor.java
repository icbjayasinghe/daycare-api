package com.skyhigh.daycareapi.util.convertor;

import com.skyhigh.daycareapi.model.Child;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.Date;

@Service
public class ChildConvertor implements Converter<Child, ChildDto> {
    @Override
    public ChildDto convert(Child source) {
        ChildDto child = ChildDto.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .dob(source.getBirthday() != null ? source.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null)
                .sex(source.getGender())
                .build();
        return child;
    }

    public Child toEntity(ChildDto source) {
        Date dob = source.getDob() != null
                ? Date.from(source.getDob()
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant())
                : null;
        return Child.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .birthday(dob)
                .gender(source.getSex())
                .isDifferentlyAble(false)
                .build();
//        return null;
    }
}

package com.skyhigh.daycareapi.service;

import com.skyhigh.daycareapi.model.dto.ChildDto;

import java.util.List;

public interface ChildService {
    ChildDto createChildByParent(String parentEmail, ChildDto childDto);

    List<ChildDto> getChildrenByParent(String parentEmail);
}

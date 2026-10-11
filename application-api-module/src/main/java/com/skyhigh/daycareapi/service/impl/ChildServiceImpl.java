package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.Child;
import com.skyhigh.daycareapi.model.Parent;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import com.skyhigh.daycareapi.repository.ChildRepository;
import com.skyhigh.daycareapi.repository.ParentRepository;
import com.skyhigh.daycareapi.service.ChildService;
import com.skyhigh.daycareapi.service.ParentService;
import com.skyhigh.daycareapi.util.convertor.ChildConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    ParentRepository parentRepository;
    @Autowired
    ChildRepository childRepository;
    @Autowired
    ChildConvertor childConvertor;

    @Override
    public ChildDto createChildByParent(String parentEmail, ChildDto childDto) {
        Parent parent = parentRepository.findParentByEmail(parentEmail)
                .orElseThrow(() -> new RuntimeException("Parent not found with email: " + parentEmail));
        Child child = childConvertor.toEntity(childDto);
        child.setParent(parent);

        Child childRes = childRepository.save(child);

        return childConvertor.convert(childRes);
    }

    @Override
    public List<ChildDto> getChildrenByParent(String parentEmail) {
        Parent parent = parentRepository.findParentByEmail(parentEmail)
                .orElseThrow(() -> new RuntimeException("Parent not found with email: " + parentEmail));
        List<Child> childList = childRepository.findByParentId(parent.getId());
        List<ChildDto> childDtoList = childList.stream().map(child -> childConvertor.convert(child)).toList();

        return childDtoList;
    }
}

package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.Child;
import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChildRepository extends JpaRepository<Child,Long> {
    List<Child> findByParentId(Long parentId);
}

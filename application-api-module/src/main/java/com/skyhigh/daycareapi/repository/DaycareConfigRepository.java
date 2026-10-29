package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.DayCareEnrollment;
import com.skyhigh.daycareapi.model.DaycareConfig;
import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaycareConfigRepository extends JpaRepository<DaycareConfig, Long> {
    DaycareConfig findDaycareConfigByDayCare(DayCare daycare);
}

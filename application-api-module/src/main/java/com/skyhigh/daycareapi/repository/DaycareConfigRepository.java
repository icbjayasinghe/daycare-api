package com.skyhigh.daycareapi.repository;

import com.skyhigh.domainmodule.model.DaycareConfig;
import com.skyhigh.domainmodule.model.facility.DayCare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaycareConfigRepository extends JpaRepository<DaycareConfig, Long> {
    DaycareConfig findDaycareConfigByDayCare(DayCare daycare);

    DaycareConfig findDaycareConfigByDayCareId(Long daycareId);
}

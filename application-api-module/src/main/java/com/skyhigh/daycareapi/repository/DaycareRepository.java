package com.skyhigh.daycareapi.repository;

import com.skyhigh.domainmodule.model.constants.DaycareStatus;
import com.skyhigh.domainmodule.model.facility.DayCare;
import com.skyhigh.domainmodule.model.facility.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaycareRepository extends JpaRepository<DayCare, Long> {
    DayCare findDayCareByOwner(Owner owner);

    List<DayCare> findByStatus(DaycareStatus status);
}

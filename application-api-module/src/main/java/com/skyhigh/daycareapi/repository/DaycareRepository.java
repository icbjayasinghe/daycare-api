package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.constants.DaycareStatus;
import com.skyhigh.daycareapi.model.facility.DayCare;
import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaycareRepository extends JpaRepository<DayCare, Long> {
    DayCare findDayCareByOwner(Owner owner);

    List<DayCare> findByStatus(DaycareStatus status);
}

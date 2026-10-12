package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayCareApplicationRepository extends JpaRepository<DayCareApplication, Long> {
}

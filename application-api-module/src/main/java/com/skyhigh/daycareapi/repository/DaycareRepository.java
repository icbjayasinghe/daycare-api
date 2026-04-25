package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaycareRepository extends JpaRepository<DayCare, Long> {
}

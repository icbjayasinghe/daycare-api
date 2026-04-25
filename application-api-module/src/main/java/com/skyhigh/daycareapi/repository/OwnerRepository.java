package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}

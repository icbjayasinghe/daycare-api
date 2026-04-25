package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.facility.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}

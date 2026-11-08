package com.skyhigh.daycareapi.billing.billingapimodule.repository;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeePlanRepository  extends JpaRepository<FeePlan, Long> {
    @Query("SELECT f FROM FeePlan f WHERE f.daycareId = :daycareId AND f.active = :active")
    List<FeePlan> findByDaycareIdAndActive(Long daycareId, Boolean active);
}

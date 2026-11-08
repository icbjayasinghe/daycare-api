package com.skyhigh.daycareapi.billing.billingapimodule.repository;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.dto.FeePlanDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeePlanRepository  extends JpaRepository<FeePlan, Long> {
    List<FeePlan> findByDaycareIdAndActive(Long daycareId, Boolean active);
}

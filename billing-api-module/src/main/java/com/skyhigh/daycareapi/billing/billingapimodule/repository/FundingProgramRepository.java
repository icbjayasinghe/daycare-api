package com.skyhigh.daycareapi.billing.billingapimodule.repository;

import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.daycareapi.billing.billingapimodule.model.FundingProgram;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface FundingProgramRepository extends JpaRepository<FundingProgram, Long> {

    @Query("SELECT f FROM FundingProgram f WHERE f.active = :active AND f.fundingType = :fundingType")
    Collection<FundingProgram> findByActiveAndFundingType(Boolean active, FundingType fundingType);

    @Query("SELECT f FROM FundingProgram f WHERE f.active = :active")
    Collection<FundingProgram> findByActive(Boolean active);

    @Query("SELECT f FROM FundingProgram f WHERE f.fundingType = :fundingType")
    Collection<FundingProgram> findByFundingType(FundingType fundingType);


}

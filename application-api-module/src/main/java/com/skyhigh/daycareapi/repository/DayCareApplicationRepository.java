package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.dto.ApplicationSummaryDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

    @Repository
    public interface DayCareApplicationRepository extends JpaRepository<DayCareApplication, Long> {
        @Query("""
        SELECT a
        FROM DayCareApplication a
        WHERE a.child.parent.email = :email
        """)
        List<DayCareApplication> findAllByParentEmail(String email);

        @Query("""
        SELECT a
        FROM DayCareApplication a
        WHERE a.dayCare.owner.email = :email
        """)
        List<DayCareApplication> findAllByDayCareEmail(String email);

        @Query("""
        SELECT a
        FROM DayCareApplication a
        WHERE a.child.parent.email = :email and a.status = :status
        """)
        List<DayCareApplication>  findAllByParentEmailAndStatus(String email, ApplicationStatus status);

        @Query("""
        SELECT a
        FROM DayCareApplication a
        WHERE a.dayCare.owner.email = :email and a.status = :status
        """)
        List<DayCareApplication>  findAllByDaycareEmailAndStatus(String email, ApplicationStatus status);

        @Query("""
    SELECT new com.skyhigh.daycareapi.model.dto.ApplicationSummaryDto(
        SUM(CASE WHEN a.status = com.skyhigh.daycareapi.model.constants.ApplicationStatus.PENDING THEN 1 ELSE 0 END),
        SUM(CASE WHEN a.status = com.skyhigh.daycareapi.model.constants.ApplicationStatus.ACCEPTED THEN 1 ELSE 0 END),
        SUM(CASE WHEN a.status = com.skyhigh.daycareapi.model.constants.ApplicationStatus.REJECTED THEN 1 ELSE 0 END)
    )
    FROM DayCareApplication a
    WHERE a.dayCare.owner.email = :email
    """)
        ApplicationSummaryDto getApplicationCounts(String email);
    }

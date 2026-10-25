package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.DayCareEnrollment;
import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayCareEnrollmentRepository extends JpaRepository<DayCareEnrollment, Long> {
    @Query("""
    SELECT e
    FROM DayCareEnrollment e
    WHERE e.child.parent.email = :parentEmail
    """)
    List<DayCareEnrollment> findDayCareEnrollmentByParentEmail(String parentEmail);

    @Query("""
    SELECT e
    FROM DayCareEnrollment e
    WHERE e.child.parent.email = :parentEmail AND e.status = :status
    """)
    List<DayCareEnrollment> findDayCareEnrollmentByParentEmailAndStatus(String parentEmail, EnrollmentStatus status);

    @Query("""
    SELECT e
    FROM DayCareEnrollment e
    WHERE e.dayCare.owner.email = :daycareEmail
    """)
    List<DayCareEnrollment> findDayCareEnrollmentByDaycareEmail(String daycareEmail);

    @Query("""
    SELECT e
    FROM DayCareEnrollment e
    WHERE e.dayCare.owner.email = :dayCareEmail AND e.status = :status
    """)
    List<DayCareEnrollment> findDayCareEnrollmentByDaycareEmailAndStatus(String dayCareEmail, EnrollmentStatus status);
}

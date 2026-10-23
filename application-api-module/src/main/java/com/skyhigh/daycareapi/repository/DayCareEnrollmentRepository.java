package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.DayCareApplication;
import com.skyhigh.daycareapi.model.DayCareEnrollment;
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
}

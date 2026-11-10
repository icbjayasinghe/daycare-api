package com.skyhigh.daycareapi.model;

import com.skyhigh.domainmodule.model.constants.EnrollmentStatus;
import com.skyhigh.domainmodule.model.facility.DayCare;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "daycare_enrollment")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class DayCareEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "child_id", nullable = false)
    private com.skyhigh.domainmodule.model.Child child;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "daycare_id", nullable = false)
    private DayCare dayCare;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EnrollmentStatus status = EnrollmentStatus.ACTIVE;

    private LocalDate enrollmentDate;

    private LocalDate endDate;

    private String schedule;


}

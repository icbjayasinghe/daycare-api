package com.skyhigh.daycareapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import com.skyhigh.daycareapi.model.dto.ChildDto;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.DayCareEnrollmentDto;
import com.skyhigh.daycareapi.model.facility.DayCare;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

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
    private Child child;

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

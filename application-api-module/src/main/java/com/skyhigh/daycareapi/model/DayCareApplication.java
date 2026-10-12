package com.skyhigh.daycareapi.model;

import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import com.skyhigh.daycareapi.model.facility.DayCare;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "daycare_application",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_child_daycare",
                        columnNames = {"child_id", "daycare_id"}
                )
        }
)
@Getter
@Setter
@SuperBuilder
public class DayCareApplication {
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
    private ApplicationStatus status = ApplicationStatus.PENDING;

    @Column(nullable = false, updatable = false)
    private LocalDateTime appliedAt = LocalDateTime.now();

    public DayCareApplication() {
    }

    public DayCareApplication(Long id, Child child, DayCare dayCare, ApplicationStatus status, LocalDateTime appliedAt) {
        this.id = id;
        this.child = child;
        this.dayCare = dayCare;
        this.status = status;
        this.appliedAt = appliedAt;
    }
}

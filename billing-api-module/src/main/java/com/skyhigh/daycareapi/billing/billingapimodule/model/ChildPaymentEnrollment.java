package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.domainmodule.model.Child;
import com.skyhigh.domainmodule.model.facility.DayCare;
import com.skyhigh.domainmodule.model.constants.EnrollmentStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "child_payment_enrollment",
        indexes = {
                @Index(name = "idx_payment_enrollment_child", columnList = "child_id"),
                @Index(name = "idx_payment_enrollment_daycare", columnList = "daycare_id"),
                @Index(name = "idx_payment_enrollment_fee_plan", columnList = "fee_plan_id")
        }
)
@Getter
@Setter
@SuperBuilder
public class ChildPaymentEnrollment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "child_id", nullable = false)
        private Child child;

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "daycare_id", nullable = false)
        private DayCare dayCare;

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "fee_plan_id", nullable = false)
        private FeePlan feePlan;

        @Column(name = "enrollment_date", nullable = false)
        private LocalDate enrollmentDate;

        @Column(name = "withdrawal_date")
        private LocalDate withdrawalDate;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false, length = 20)
        @Builder.Default
        private EnrollmentStatus status = EnrollmentStatus.ACTIVE;

        @Column(length = 500)
        private String notes;

        @Column(name = "created_at", nullable = false, updatable = false)
        private LocalDateTime createdAt;

        @Column(name = "updated_at")
        private LocalDateTime updatedAt;

        @PrePersist
        protected void onCreate() {
                LocalDateTime now = LocalDateTime.now();
                createdAt = now;
                updatedAt = now;
        }

        @PreUpdate
        protected void onUpdate() {
                updatedAt = LocalDateTime.now();
        }

        public ChildPaymentEnrollment() {
        }

        public ChildPaymentEnrollment(Long id, Child child, DayCare dayCare, FeePlan feePlan, LocalDate enrollmentDate, LocalDate withdrawalDate, EnrollmentStatus status, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
                this.id = id;
                this.child = child;
                this.dayCare = dayCare;
                this.feePlan = feePlan;
                this.enrollmentDate = enrollmentDate;
                this.withdrawalDate = withdrawalDate;
                this.status = status;
                this.notes = notes;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
        }
}

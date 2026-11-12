package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.ChildFundingStatus;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingFrequency;
import com.skyhigh.domainmodule.model.Child;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "child_funding_assignment",
        indexes = {
                @Index(
                        name = "idx_funding_assignment_child",
                        columnList = "child_id"
                ),
                @Index(
                        name = "idx_funding_assignment_program",
                        columnList = "funding_program_id"
                )
        }
)
@Getter
@Setter
@SuperBuilder
public class ChildFundingAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "child_id", nullable = false)
    private Child child;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "funding_program_id", nullable = false)
    private FundingProgram fundingProgram;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal approvedAmount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FundingFrequency fundingFrequency;

    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ChildFundingStatus status = ChildFundingStatus.PENDING;

    private String referenceNumber;

    @Column(length = 1000)
    private String notes;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public ChildFundingAssignment() {
    }

    public ChildFundingAssignment(Long id, Child child, FundingProgram fundingProgram, BigDecimal approvedAmount, FundingFrequency fundingFrequency, LocalDate startDate, LocalDate endDate, ChildFundingStatus status, String referenceNumber, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.child = child;
        this.fundingProgram = fundingProgram;
        this.approvedAmount = approvedAmount;
        this.fundingFrequency = fundingFrequency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.referenceNumber = referenceNumber;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

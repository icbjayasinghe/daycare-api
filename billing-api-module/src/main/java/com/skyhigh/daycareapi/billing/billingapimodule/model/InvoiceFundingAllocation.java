package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingAllocationStatus;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingAllocationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "invoice_funding_allocation",
        indexes = {
                @Index(
                        name = "idx_invoice_funding_invoice",
                        columnList = "invoice_id"
                ),
                @Index(
                        name = "idx_invoice_funding_program",
                        columnList = "funding_program_id"
                ),
                @Index(
                        name = "idx_invoice_funding_assignment",
                        columnList = "child_funding_assignment_id"
                )
        }
)
@Getter
@Setter
@SuperBuilder
public class InvoiceFundingAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "invoice_id", nullable = false)
    private MonthlyInvoice invoice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "funding_program_id", nullable = false)
    private FundingProgram fundingProgram;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_funding_assignment_id")
    private ChildFundingAssignment childFundingAssignment;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FundingAllocationType allocationType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FundingAllocationStatus status =
            FundingAllocationStatus.PENDING;

    private String referenceNumber;

    @Column(length = 1000)
    private String notes;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    public InvoiceFundingAllocation() {
    }

    public InvoiceFundingAllocation(Long id, MonthlyInvoice invoice, FundingProgram fundingProgram, ChildFundingAssignment childFundingAssignment, FundingAllocationType allocationType, BigDecimal amount, FundingAllocationStatus status, String referenceNumber, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.invoice = invoice;
        this.fundingProgram = fundingProgram;
        this.childFundingAssignment = childFundingAssignment;
        this.allocationType = allocationType;
        this.amount = amount;
        this.status = status;
        this.referenceNumber = referenceNumber;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}

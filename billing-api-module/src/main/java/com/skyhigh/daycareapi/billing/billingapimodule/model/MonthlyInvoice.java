package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.InvoiceStatus;
import com.skyhigh.daycareapi.billing.billingapimodule.util.convertor.YearMonthAttributeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Objects;

@Entity
@Table(
        name = "monthly_invoice",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_monthly_invoice_number", columnNames = "invoice_number"),
                @UniqueConstraint(name = "uk_monthly_invoice_enrollment_month",
                        columnNames = {"child_payment_enrollment_id", "billing_month"})
        },
        indexes = {
                @Index(name = "idx_monthly_invoice_enrollment", columnList = "child_payment_enrollment_id"),
                @Index(name = "idx_monthly_invoice_status_due", columnList = "status, due_date")
        }
)
@Getter
@Setter
public class MonthlyInvoice {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "invoice_number", nullable = false, length = 50)
        private String invoiceNumber;

        @NotNull
        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "child_payment_enrollment_id", nullable = false)
        private ChildPaymentEnrollment enrollmentId;

        /** Month covered by this invoice, stored as YYYY-MM (e.g. "2026-11"). */
        @NotNull
        @Convert(converter = YearMonthAttributeConverter.class)
        @Column(name = "billing_month", nullable = false, length = 7)
        private YearMonth billingMonth;

        @NotNull
        @Column(name = "issue_date", nullable = false)
        private LocalDate issueDate;

        @NotNull
        @Column(name = "due_date", nullable = false)
        private LocalDate dueDate;

        /** Original daycare fee before funding and adjustments. */
        @NotNull
        @Column(name = "gross_amount", nullable = false, precision = 12, scale = 2)
        private BigDecimal grossAmount;

        /** Total funding applied to this invoice. */
        @Column(name = "total_funding_amount", nullable = false, precision = 12, scale = 2)
        private BigDecimal totalFundingAmount = BigDecimal.ZERO;

        /** Other credits or additional charges. Positive values increase the amount due. */
        @Column(name = "other_adjustment_amount", nullable = false, precision = 12, scale = 2)
        private BigDecimal otherAdjustmentAmount = BigDecimal.ZERO;

        /** Final amount payable by the parent after funding and adjustments. */
        @Column(name = "parent_amount_due", nullable = false, precision = 12, scale = 2)
        private BigDecimal parentAmountDue = BigDecimal.ZERO;

        /** Total payments received from the parent. */
        @Column(name = "total_paid", nullable = false, precision = 12, scale = 2)
        private BigDecimal totalPaid = BigDecimal.ZERO;

        /** Remaining amount payable by the parent. */
        @Column(name = "balance_due", nullable = false, precision = 12, scale = 2)
        private BigDecimal balanceDue = BigDecimal.ZERO;

        @NotNull
        @Enumerated(EnumType.STRING)
        @Column(name = "status", nullable = false, length = 20)
        private InvoiceStatus status;

        @Column(name = "notes", length = 1000)
        private String notes;

        @CreationTimestamp
        @Column(name = "created_at", nullable = false, updatable = false)
        private LocalDateTime createdAt;

        @UpdateTimestamp
        @Column(name = "updated_at", nullable = false)
        private LocalDateTime updatedAt;

        protected MonthlyInvoice() {
        }

        public MonthlyInvoice(Long id, String invoiceNumber, ChildPaymentEnrollment enrollmentId, YearMonth billingMonth, LocalDate issueDate, LocalDate dueDate, BigDecimal grossAmount, BigDecimal totalFundingAmount, BigDecimal otherAdjustmentAmount, BigDecimal parentAmountDue, BigDecimal totalPaid, BigDecimal balanceDue, InvoiceStatus status, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
                this.id = id;
                this.invoiceNumber = invoiceNumber;
                this.enrollmentId = enrollmentId;
                this.billingMonth = billingMonth;
                this.issueDate = issueDate;
                this.dueDate = dueDate;
                this.grossAmount = grossAmount;
                this.totalFundingAmount = totalFundingAmount;
                this.otherAdjustmentAmount = otherAdjustmentAmount;
                this.parentAmountDue = parentAmountDue;
                this.totalPaid = totalPaid;
                this.balanceDue = balanceDue;
                this.status = status;
                this.notes = notes;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
        }

        /** Recomputes derived amounts: parentAmountDue = gross - funding + adjustment; balanceDue = parentAmountDue - totalPaid. */
        public void recalculateAmounts() {
                this.parentAmountDue = grossAmount
                        .subtract(totalFundingAmount)
                        .add(otherAdjustmentAmount);
                this.balanceDue = parentAmountDue.subtract(totalPaid);
        }

        @PrePersist
        @PreUpdate
        private void onSave() {
                if (grossAmount != null) {
                        recalculateAmounts();
                }
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof MonthlyInvoice other)) return false;
                return id != null && id.equals(other.id);
        }

        @Override
        public int hashCode() {
                return Objects.hash(getClass());
        }
}

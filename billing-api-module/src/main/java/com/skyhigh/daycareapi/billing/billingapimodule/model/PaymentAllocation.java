package com.skyhigh.daycareapi.billing.billingapimodule.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(
        name = "payment_allocation",
        indexes = {
                @Index(name = "idx_allocation_payment", columnList = "payment_id"),
                @Index(name = "idx_allocation_invoice", columnList = "invoice_id")
        }
)
@Getter
@Setter
public class PaymentAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    private PaymentTransaction payment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "invoice_id", nullable = false)
    private MonthlyInvoice invoice;

    @Column(
            name = "allocated_amount",
            nullable = false,
            precision = 10,
            scale = 2
    )
    private BigDecimal allocatedAmount;
}

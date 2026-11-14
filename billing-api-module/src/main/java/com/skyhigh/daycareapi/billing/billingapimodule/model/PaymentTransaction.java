package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PayerType;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PaymentMethod;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(
        name = "payment_transaction",
        indexes = {
                @Index(name = "idx_payment_enrollment", columnList = "child_payment_enrollment_id"),
                @Index(name = "idx_payment_date", columnList = "payment_date"),
                @Index(name = "idx_payment_reference", columnList = "reference_number")
        }
)
@Getter
@Setter
public class PaymentTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "child_payment_enrollment_id", nullable = false)
    private ChildPaymentEnrollment enrollment;

    @Enumerated(EnumType.STRING)
    @Column(name = "payer_type", nullable = false, length = 30)
    private PayerType payerType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "payment_date", nullable = false)
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method", nullable = false, length = 30)
    private PaymentMethod paymentMethod;

    @Column(name = "reference_number", length = 100)
    private String referenceNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private PaymentStatus status = PaymentStatus.PENDING;

    @PrePersist
    protected void onCreate() {
        if (status == null) {
            status = PaymentStatus.PENDING;
        }
    }
}

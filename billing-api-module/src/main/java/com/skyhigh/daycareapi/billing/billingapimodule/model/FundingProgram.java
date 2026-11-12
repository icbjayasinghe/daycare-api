package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Entity
@Table(
        name = "funding_program",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_funding_program_code",
                        columnNames = "code"
                )
        }
)
@Getter
@Setter
@SuperBuilder
public class FundingProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(length = 500)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FundingType fundingType;

    @Column(nullable = false)
    private Boolean active = true;

    public FundingProgram() {
    }

    public FundingProgram(Long id, String name, String code, String description, FundingType fundingType, Boolean active) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.fundingType = fundingType;
        this.active = active;
    }
}

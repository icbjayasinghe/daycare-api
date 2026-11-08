package com.skyhigh.daycareapi.billing.billingapimodule.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.experimental.SuperBuilder;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@SuperBuilder
public class FeePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("daycareId")
    private Long daycareId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("monthlyFee")
    private Double monthlyFee;

    @JsonProperty("effectiveFrom")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate effectiveFrom;

    @JsonProperty("effectiveTo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private JsonNullable<LocalDate> effectiveTo = JsonNullable.undefined();

    @JsonProperty("active")
    private Boolean active = true;

    @JsonProperty("createdAt")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @JsonProperty("updatedAt")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public FeePlan() {
    }

    public FeePlan(Long id, Long daycareId, String name, String description, Double monthlyFee, LocalDate effectiveFrom, JsonNullable<LocalDate> effectiveTo, Boolean active, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.daycareId = daycareId;
        this.name = name;
        this.description = description;
        this.monthlyFee = monthlyFee;
        this.effectiveFrom = effectiveFrom;
        this.effectiveTo = effectiveTo;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDaycareId() {
        return daycareId;
    }

    public void setDaycareId(Long daycareId) {
        this.daycareId = daycareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public LocalDate getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(LocalDate effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public JsonNullable<LocalDate> getEffectiveTo() {
        return effectiveTo;
    }

    public void setEffectiveTo(JsonNullable<LocalDate> effectiveTo) {
        this.effectiveTo = effectiveTo;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

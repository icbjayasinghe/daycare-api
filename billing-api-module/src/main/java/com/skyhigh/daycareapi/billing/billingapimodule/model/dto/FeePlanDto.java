package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * FeePlanDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-01T07:22:24.607646-04:00[America/Halifax]")
public class FeePlanDto {

  @JsonProperty("id")
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
  private LocalDate effectiveTo;

  @JsonProperty("active")
  private Boolean active = true;

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate updatedAt;

  public FeePlanDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */

  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "1", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeePlanDto daycareId(Long daycareId) {
    this.daycareId = daycareId;
    return this;
  }

  /**
   * Get daycareId
   * @return daycareId
   */

  @Schema(name = "daycareId", example = "10", required = false)
  public Long getDaycareId() {
    return daycareId;
  }

  public void setDaycareId(Long daycareId) {
    this.daycareId = daycareId;
  }

  public FeePlanDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */

  @Schema(name = "name", example = "Full-time care", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeePlanDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */

  @Schema(name = "description", example = "Full-day childcare from Monday to Friday", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeePlanDto monthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

  /**
   * Get monthlyFee
   * @return monthlyFee
   */

  @Schema(name = "monthlyFee", example = "900.0", required = false)
  public Double getMonthlyFee() {
    return monthlyFee;
  }

  public void setMonthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
  }

  public FeePlanDto effectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * Get effectiveFrom
   * @return effectiveFrom
   */
  @Valid
  @Schema(name = "effectiveFrom", required = false)
  public LocalDate getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public FeePlanDto effectiveTo(LocalDate effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

  /**
   * Get effectiveTo
   * @return effectiveTo
   */
  @Valid
  @Schema(name = "effectiveTo", required = false)
  public LocalDate getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(LocalDate effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public FeePlanDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */

  @Schema(name = "active", example = "true", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public FeePlanDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid
  @Schema(name = "createdAt", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FeePlanDto updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid
  @Schema(name = "updatedAt", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanDto feePlanDto = (FeePlanDto) o;
    return Objects.equals(this.id, feePlanDto.id) &&
            Objects.equals(this.daycareId, feePlanDto.daycareId) &&
            Objects.equals(this.name, feePlanDto.name) &&
            Objects.equals(this.description, feePlanDto.description) &&
            Objects.equals(this.monthlyFee, feePlanDto.monthlyFee) &&
            Objects.equals(this.effectiveFrom, feePlanDto.effectiveFrom) &&
            Objects.equals(this.effectiveTo, feePlanDto.effectiveTo) &&
            Objects.equals(this.active, feePlanDto.active) &&
            Objects.equals(this.createdAt, feePlanDto.createdAt) &&
            Objects.equals(this.updatedAt, feePlanDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, daycareId, name, description, monthlyFee, effectiveFrom, effectiveTo, active, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    daycareId: ").append(toIndentedString(daycareId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


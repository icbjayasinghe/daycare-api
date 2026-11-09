package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.Arrays;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.EnrollmentStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * ChildPaymentEnrollmentsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T07:39:38.187072-04:00[America/Halifax]")
public class ChildPaymentEnrollmentsDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("childId")
  private Long childId;

  @JsonProperty("daycareId")
  private Long daycareId;

  @JsonProperty("feePlanId")
  private Long feePlanId;

  @JsonProperty("enrollmentDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate enrollmentDate;

  @JsonProperty("withdrawalDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate withdrawalDate;

  @JsonProperty("status")
  private EnrollmentStatus status;

  @JsonProperty("notes")
  private JsonNullable<String> notes = JsonNullable.undefined();

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate updatedAt;

  public ChildPaymentEnrollmentsDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "101", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ChildPaymentEnrollmentsDto childId(Long childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Get childId
   * @return childId
  */
  
  @Schema(name = "childId", example = "25", required = false)
  public Long getChildId() {
    return childId;
  }

  public void setChildId(Long childId) {
    this.childId = childId;
  }

  public ChildPaymentEnrollmentsDto daycareId(Long daycareId) {
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

  public ChildPaymentEnrollmentsDto feePlanId(Long feePlanId) {
    this.feePlanId = feePlanId;
    return this;
  }

  /**
   * Get feePlanId
   * @return feePlanId
  */
  
  @Schema(name = "feePlanId", example = "1", required = false)
  public Long getFeePlanId() {
    return feePlanId;
  }

  public void setFeePlanId(Long feePlanId) {
    this.feePlanId = feePlanId;
  }

  public ChildPaymentEnrollmentsDto enrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }

  /**
   * Get enrollmentDate
   * @return enrollmentDate
  */
  @Valid 
  @Schema(name = "enrollmentDate", required = false)
  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public ChildPaymentEnrollmentsDto withdrawalDate(LocalDate withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
    return this;
  }

  /**
   * Get withdrawalDate
   * @return withdrawalDate
  */
  @Valid 
  @Schema(name = "withdrawalDate", required = false)
  public LocalDate getWithdrawalDate() {
    return withdrawalDate;
  }

  public void setWithdrawalDate(LocalDate withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
  }

  public ChildPaymentEnrollmentsDto status(EnrollmentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public EnrollmentStatus getStatus() {
    return status;
  }

  public void setStatus(EnrollmentStatus status) {
    this.status = status;
  }

  public ChildPaymentEnrollmentsDto notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", required = false)
  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public ChildPaymentEnrollmentsDto createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public ChildPaymentEnrollmentsDto updatedAt(LocalDate updatedAt) {
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
    ChildPaymentEnrollmentsDto childPaymentEnrollmentsDto = (ChildPaymentEnrollmentsDto) o;
    return Objects.equals(this.id, childPaymentEnrollmentsDto.id) &&
        Objects.equals(this.childId, childPaymentEnrollmentsDto.childId) &&
        Objects.equals(this.daycareId, childPaymentEnrollmentsDto.daycareId) &&
        Objects.equals(this.feePlanId, childPaymentEnrollmentsDto.feePlanId) &&
        Objects.equals(this.enrollmentDate, childPaymentEnrollmentsDto.enrollmentDate) &&
        Objects.equals(this.withdrawalDate, childPaymentEnrollmentsDto.withdrawalDate) &&
        Objects.equals(this.status, childPaymentEnrollmentsDto.status) &&
        equalsNullable(this.notes, childPaymentEnrollmentsDto.notes) &&
        Objects.equals(this.createdAt, childPaymentEnrollmentsDto.createdAt) &&
        Objects.equals(this.updatedAt, childPaymentEnrollmentsDto.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, childId, daycareId, feePlanId, enrollmentDate, withdrawalDate, status, hashCodeNullable(notes), createdAt, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildPaymentEnrollmentsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    daycareId: ").append(toIndentedString(daycareId)).append("\n");
    sb.append("    feePlanId: ").append(toIndentedString(feePlanId)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
    sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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


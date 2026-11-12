package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.ChildFundingStatus;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingFrequency;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * ChildFundingAssignmentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T09:40:00.161949-04:00[America/Halifax]")
public class ChildFundingAssignmentDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("childId")
  private Long childId;

  @JsonProperty("fundingProgramId")
  private Long fundingProgramId;

  @JsonProperty("approvedAmount")
  private Double approvedAmount;

  @JsonProperty("fundingFrequency")
  private FundingFrequency fundingFrequency;

  @JsonProperty("startDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> endDate = JsonNullable.undefined();

  @JsonProperty("status")
  private ChildFundingStatus status;

  @JsonProperty("referenceNumber")
  private JsonNullable<String> referenceNumber = JsonNullable.undefined();

  @JsonProperty("notes")
  private JsonNullable<String> notes = JsonNullable.undefined();

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public ChildFundingAssignmentDto id(Long id) {
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

  public ChildFundingAssignmentDto childId(Long childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Get childId
   * @return childId
  */
  @NotNull 
  @Schema(name = "childId", example = "25", required = true)
  public Long getChildId() {
    return childId;
  }

  public void setChildId(Long childId) {
    this.childId = childId;
  }

  public ChildFundingAssignmentDto fundingProgramId(Long fundingProgramId) {
    this.fundingProgramId = fundingProgramId;
    return this;
  }

  /**
   * Get fundingProgramId
   * @return fundingProgramId
  */
  @NotNull 
  @Schema(name = "fundingProgramId", example = "1", required = true)
  public Long getFundingProgramId() {
    return fundingProgramId;
  }

  public void setFundingProgramId(Long fundingProgramId) {
    this.fundingProgramId = fundingProgramId;
  }

  public ChildFundingAssignmentDto approvedAmount(Double approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

  /**
   * Approved funding amount per billing period.
   * @return approvedAmount
  */
  @NotNull 
  @Schema(name = "approvedAmount", example = "250.0", description = "Approved funding amount per billing period.", required = true)
  public Double getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(Double approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public ChildFundingAssignmentDto fundingFrequency(FundingFrequency fundingFrequency) {
    this.fundingFrequency = fundingFrequency;
    return this;
  }

  /**
   * Get fundingFrequency
   * @return fundingFrequency
  */
  @NotNull @Valid 
  @Schema(name = "fundingFrequency", required = true)
  public FundingFrequency getFundingFrequency() {
    return fundingFrequency;
  }

  public void setFundingFrequency(FundingFrequency fundingFrequency) {
    this.fundingFrequency = fundingFrequency;
  }

  public ChildFundingAssignmentDto startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @NotNull @Valid 
  @Schema(name = "startDate", example = "Sat Oct 31 21:00:00 ADT 2026", required = true)
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ChildFundingAssignmentDto endDate(LocalDate endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", example = "Tue Mar 30 21:00:00 ADT 2027", required = false)
  public JsonNullable<LocalDate> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<LocalDate> endDate) {
    this.endDate = endDate;
  }

  public ChildFundingAssignmentDto status(ChildFundingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public ChildFundingStatus getStatus() {
    return status;
  }

  public void setStatus(ChildFundingStatus status) {
    this.status = status;
  }

  public ChildFundingAssignmentDto referenceNumber(String referenceNumber) {
    this.referenceNumber = JsonNullable.of(referenceNumber);
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
  */
  
  @Schema(name = "referenceNumber", example = "NS-SUB-2026-00125", required = false)
  public JsonNullable<String> getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(JsonNullable<String> referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ChildFundingAssignmentDto notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", example = "Approved monthly childcare subsidy.", required = false)
  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public ChildFundingAssignmentDto createdAt(OffsetDateTime createdAt) {
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

  public ChildFundingAssignmentDto updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    ChildFundingAssignmentDto childFundingAssignmentDto = (ChildFundingAssignmentDto) o;
    return Objects.equals(this.id, childFundingAssignmentDto.id) &&
        Objects.equals(this.childId, childFundingAssignmentDto.childId) &&
        Objects.equals(this.fundingProgramId, childFundingAssignmentDto.fundingProgramId) &&
        Objects.equals(this.approvedAmount, childFundingAssignmentDto.approvedAmount) &&
        Objects.equals(this.fundingFrequency, childFundingAssignmentDto.fundingFrequency) &&
        Objects.equals(this.startDate, childFundingAssignmentDto.startDate) &&
        equalsNullable(this.endDate, childFundingAssignmentDto.endDate) &&
        Objects.equals(this.status, childFundingAssignmentDto.status) &&
        equalsNullable(this.referenceNumber, childFundingAssignmentDto.referenceNumber) &&
        equalsNullable(this.notes, childFundingAssignmentDto.notes) &&
        Objects.equals(this.createdAt, childFundingAssignmentDto.createdAt) &&
        Objects.equals(this.updatedAt, childFundingAssignmentDto.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, childId, fundingProgramId, approvedAmount, fundingFrequency, startDate, hashCodeNullable(endDate), status, hashCodeNullable(referenceNumber), hashCodeNullable(notes), createdAt, updatedAt);
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
    sb.append("class ChildFundingAssignmentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    fundingProgramId: ").append(toIndentedString(fundingProgramId)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    fundingFrequency: ").append(toIndentedString(fundingFrequency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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


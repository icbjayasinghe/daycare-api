package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.InvoiceStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * MonthlyInvoiceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T11:25:01.179228-04:00[America/Halifax]")
public class MonthlyInvoiceDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("invoiceNumber")
  private String invoiceNumber;

  @JsonProperty("enrollmentId")
  private Long enrollmentId;

  @JsonProperty("billingMonth")
  private String billingMonth;

  @JsonProperty("issueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issueDate;

  @JsonProperty("dueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  @JsonProperty("grossAmount")
  private Double grossAmount;

  @JsonProperty("totalFundingAmount")
  private Double totalFundingAmount;

  @JsonProperty("otherAdjustmentAmount")
  private Double otherAdjustmentAmount;

  @JsonProperty("parentAmountDue")
  private Double parentAmountDue;

  @JsonProperty("totalPaid")
  private Double totalPaid;

  @JsonProperty("balanceDue")
  private Double balanceDue;

  @JsonProperty("status")
  private InvoiceStatus status;

  @JsonProperty("notes")
  private JsonNullable<String> notes = JsonNullable.undefined();

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public MonthlyInvoiceDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "501", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MonthlyInvoiceDto invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Get invoiceNumber
   * @return invoiceNumber
  */
  
  @Schema(name = "invoiceNumber", example = "INV-2026-11-001", required = false)
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public MonthlyInvoiceDto enrollmentId(Long enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * ID of the child's daycare enrollment.
   * @return enrollmentId
  */
  @NotNull 
  @Schema(name = "enrollmentId", example = "101", description = "ID of the child's daycare enrollment.", required = true)
  public Long getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(Long enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public MonthlyInvoiceDto billingMonth(String billingMonth) {
    this.billingMonth = billingMonth;
    return this;
  }

  /**
   * Month covered by this invoice, in YYYY-MM format.
   * @return billingMonth
  */
  @NotNull @Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])$") 
  @Schema(name = "billingMonth", example = "2026-11", description = "Month covered by this invoice, in YYYY-MM format.", required = true)
  public String getBillingMonth() {
    return billingMonth;
  }

  public void setBillingMonth(String billingMonth) {
    this.billingMonth = billingMonth;
  }

  public MonthlyInvoiceDto issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
  */
  @NotNull @Valid 
  @Schema(name = "issueDate", example = "Sat Oct 31 21:00:00 ADT 2026", required = true)
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public MonthlyInvoiceDto dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  */
  @NotNull @Valid 
  @Schema(name = "dueDate", example = "Mon Nov 09 20:00:00 AST 2026", required = true)
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public MonthlyInvoiceDto grossAmount(Double grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

  /**
   * Original daycare fee before funding and adjustments.
   * @return grossAmount
  */
  @NotNull 
  @Schema(name = "grossAmount", example = "1000.0", description = "Original daycare fee before funding and adjustments.", required = true)
  public Double getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(Double grossAmount) {
    this.grossAmount = grossAmount;
  }

  public MonthlyInvoiceDto totalFundingAmount(Double totalFundingAmount) {
    this.totalFundingAmount = totalFundingAmount;
    return this;
  }

  /**
   * Total funding applied to this invoice.
   * @return totalFundingAmount
  */
  
  @Schema(name = "totalFundingAmount", accessMode = Schema.AccessMode.READ_ONLY, example = "450.0", description = "Total funding applied to this invoice.", required = false)
  public Double getTotalFundingAmount() {
    return totalFundingAmount;
  }

  public void setTotalFundingAmount(Double totalFundingAmount) {
    this.totalFundingAmount = totalFundingAmount;
  }

  public MonthlyInvoiceDto otherAdjustmentAmount(Double otherAdjustmentAmount) {
    this.otherAdjustmentAmount = otherAdjustmentAmount;
    return this;
  }

  /**
   * Other credits or additional charges applied to the invoice. Positive values increase the amount due.
   * @return otherAdjustmentAmount
  */
  
  @Schema(name = "otherAdjustmentAmount", example = "0.0", description = "Other credits or additional charges applied to the invoice. Positive values increase the amount due.", required = false)
  public Double getOtherAdjustmentAmount() {
    return otherAdjustmentAmount;
  }

  public void setOtherAdjustmentAmount(Double otherAdjustmentAmount) {
    this.otherAdjustmentAmount = otherAdjustmentAmount;
  }

  public MonthlyInvoiceDto parentAmountDue(Double parentAmountDue) {
    this.parentAmountDue = parentAmountDue;
    return this;
  }

  /**
   * Final amount payable by the parent after funding and adjustments.
   * @return parentAmountDue
  */
  
  @Schema(name = "parentAmountDue", accessMode = Schema.AccessMode.READ_ONLY, example = "550.0", description = "Final amount payable by the parent after funding and adjustments.", required = false)
  public Double getParentAmountDue() {
    return parentAmountDue;
  }

  public void setParentAmountDue(Double parentAmountDue) {
    this.parentAmountDue = parentAmountDue;
  }

  public MonthlyInvoiceDto totalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

  /**
   * Total payments received from the parent.
   * @return totalPaid
  */
  
  @Schema(name = "totalPaid", accessMode = Schema.AccessMode.READ_ONLY, example = "300.0", description = "Total payments received from the parent.", required = false)
  public Double getTotalPaid() {
    return totalPaid;
  }

  public void setTotalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
  }

  public MonthlyInvoiceDto balanceDue(Double balanceDue) {
    this.balanceDue = balanceDue;
    return this;
  }

  /**
   * Remaining amount payable by the parent.
   * @return balanceDue
  */
  
  @Schema(name = "balanceDue", accessMode = Schema.AccessMode.READ_ONLY, example = "250.0", description = "Remaining amount payable by the parent.", required = false)
  public Double getBalanceDue() {
    return balanceDue;
  }

  public void setBalanceDue(Double balanceDue) {
    this.balanceDue = balanceDue;
  }

  public MonthlyInvoiceDto status(InvoiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public InvoiceStatus getStatus() {
    return status;
  }

  public void setStatus(InvoiceStatus status) {
    this.status = status;
  }

  public MonthlyInvoiceDto notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", example = "November 2026 daycare invoice.", required = false)
  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public MonthlyInvoiceDto createdAt(OffsetDateTime createdAt) {
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

  public MonthlyInvoiceDto updatedAt(OffsetDateTime updatedAt) {
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
    MonthlyInvoiceDto monthlyInvoiceDto = (MonthlyInvoiceDto) o;
    return Objects.equals(this.id, monthlyInvoiceDto.id) &&
        Objects.equals(this.invoiceNumber, monthlyInvoiceDto.invoiceNumber) &&
        Objects.equals(this.enrollmentId, monthlyInvoiceDto.enrollmentId) &&
        Objects.equals(this.billingMonth, monthlyInvoiceDto.billingMonth) &&
        Objects.equals(this.issueDate, monthlyInvoiceDto.issueDate) &&
        Objects.equals(this.dueDate, monthlyInvoiceDto.dueDate) &&
        Objects.equals(this.grossAmount, monthlyInvoiceDto.grossAmount) &&
        Objects.equals(this.totalFundingAmount, monthlyInvoiceDto.totalFundingAmount) &&
        Objects.equals(this.otherAdjustmentAmount, monthlyInvoiceDto.otherAdjustmentAmount) &&
        Objects.equals(this.parentAmountDue, monthlyInvoiceDto.parentAmountDue) &&
        Objects.equals(this.totalPaid, monthlyInvoiceDto.totalPaid) &&
        Objects.equals(this.balanceDue, monthlyInvoiceDto.balanceDue) &&
        Objects.equals(this.status, monthlyInvoiceDto.status) &&
        equalsNullable(this.notes, monthlyInvoiceDto.notes) &&
        Objects.equals(this.createdAt, monthlyInvoiceDto.createdAt) &&
        Objects.equals(this.updatedAt, monthlyInvoiceDto.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceNumber, enrollmentId, billingMonth, issueDate, dueDate, grossAmount, totalFundingAmount, otherAdjustmentAmount, parentAmountDue, totalPaid, balanceDue, status, hashCodeNullable(notes), createdAt, updatedAt);
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
    sb.append("class MonthlyInvoiceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    billingMonth: ").append(toIndentedString(billingMonth)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    totalFundingAmount: ").append(toIndentedString(totalFundingAmount)).append("\n");
    sb.append("    otherAdjustmentAmount: ").append(toIndentedString(otherAdjustmentAmount)).append("\n");
    sb.append("    parentAmountDue: ").append(toIndentedString(parentAmountDue)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    balanceDue: ").append(toIndentedString(balanceDue)).append("\n");
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


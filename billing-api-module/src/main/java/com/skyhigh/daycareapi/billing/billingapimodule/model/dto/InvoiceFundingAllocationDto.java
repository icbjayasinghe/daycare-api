package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingAllocationStatus;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingAllocationType;



import javax.annotation.Generated;

/**
 * InvoiceFundingAllocationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T18:06:33.160283-04:00[America/Halifax]")
public class InvoiceFundingAllocationDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("invoiceId")
  private Long invoiceId;

  @JsonProperty("fundingProgramId")
  private Long fundingProgramId;

  @JsonProperty("allocationType")
  private FundingAllocationType allocationType;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("status")
  private FundingAllocationStatus status;

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

  public InvoiceFundingAllocationDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "1001", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InvoiceFundingAllocationDto invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Reference to the monthly invoice.
   * @return invoiceId
  */
  @NotNull 
  @Schema(name = "invoiceId", example = "501", description = "Reference to the monthly invoice.", required = true)
  public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceFundingAllocationDto fundingProgramId(Long fundingProgramId) {
    this.fundingProgramId = fundingProgramId;
    return this;
  }

  /**
   * Reference to the funding program.
   * @return fundingProgramId
  */
  @NotNull 
  @Schema(name = "fundingProgramId", example = "2", description = "Reference to the funding program.", required = true)
  public Long getFundingProgramId() {
    return fundingProgramId;
  }

  public void setFundingProgramId(Long fundingProgramId) {
    this.fundingProgramId = fundingProgramId;
  }

  public InvoiceFundingAllocationDto allocationType(FundingAllocationType allocationType) {
    this.allocationType = allocationType;
    return this;
  }

  /**
   * Get allocationType
   * @return allocationType
  */
  @NotNull @Valid 
  @Schema(name = "allocationType", required = true)
  public FundingAllocationType getAllocationType() {
    return allocationType;
  }

  public void setAllocationType(FundingAllocationType allocationType) {
    this.allocationType = allocationType;
  }

  public InvoiceFundingAllocationDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Funding amount allocated to the invoice.
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", example = "200.0", description = "Funding amount allocated to the invoice.", required = true)
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InvoiceFundingAllocationDto status(FundingAllocationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public FundingAllocationStatus getStatus() {
    return status;
  }

  public void setStatus(FundingAllocationStatus status) {
    this.status = status;
  }

  public InvoiceFundingAllocationDto referenceNumber(String referenceNumber) {
    this.referenceNumber = JsonNullable.of(referenceNumber);
    return this;
  }

  /**
   * External funding reference number, if applicable.
   * @return referenceNumber
  */
  
  @Schema(name = "referenceNumber", example = "CWELCC-2026-001", description = "External funding reference number, if applicable.", required = false)
  public JsonNullable<String> getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(JsonNullable<String> referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public InvoiceFundingAllocationDto notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", example = "Government fee reduction for November 2026.", required = false)
  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public InvoiceFundingAllocationDto createdAt(OffsetDateTime createdAt) {
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

  public InvoiceFundingAllocationDto updatedAt(OffsetDateTime updatedAt) {
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
    InvoiceFundingAllocationDto invoiceFundingAllocationDto = (InvoiceFundingAllocationDto) o;
    return Objects.equals(this.id, invoiceFundingAllocationDto.id) &&
        Objects.equals(this.invoiceId, invoiceFundingAllocationDto.invoiceId) &&
        Objects.equals(this.fundingProgramId, invoiceFundingAllocationDto.fundingProgramId) &&
        Objects.equals(this.allocationType, invoiceFundingAllocationDto.allocationType) &&
        Objects.equals(this.amount, invoiceFundingAllocationDto.amount) &&
        Objects.equals(this.status, invoiceFundingAllocationDto.status) &&
        equalsNullable(this.referenceNumber, invoiceFundingAllocationDto.referenceNumber) &&
        equalsNullable(this.notes, invoiceFundingAllocationDto.notes) &&
        Objects.equals(this.createdAt, invoiceFundingAllocationDto.createdAt) &&
        Objects.equals(this.updatedAt, invoiceFundingAllocationDto.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceId, fundingProgramId, allocationType, amount, status, hashCodeNullable(referenceNumber), hashCodeNullable(notes), createdAt, updatedAt);
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
    sb.append("class InvoiceFundingAllocationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    fundingProgramId: ").append(toIndentedString(fundingProgramId)).append("\n");
    sb.append("    allocationType: ").append(toIndentedString(allocationType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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


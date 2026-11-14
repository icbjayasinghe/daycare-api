package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * PaymentAllocationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T20:06:12.366411-04:00[America/Halifax]")
public class PaymentAllocationDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("paymentId")
  private Long paymentId;

  @JsonProperty("invoiceId")
  private Long invoiceId;

  @JsonProperty("allocatedAmount")
  private Double allocatedAmount;

  public PaymentAllocationDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique payment allocation ID
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Unique payment allocation ID", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PaymentAllocationDto paymentId(Long paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * ID of the payment transaction
   * @return paymentId
  */
  @NotNull 
  @Schema(name = "paymentId", description = "ID of the payment transaction", required = true)
  public Long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Long paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentAllocationDto invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * ID of the monthly invoice
   * @return invoiceId
  */
  @NotNull 
  @Schema(name = "invoiceId", description = "ID of the monthly invoice", required = true)
  public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public PaymentAllocationDto allocatedAmount(Double allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
    return this;
  }

  /**
   * Amount of the payment allocated to this invoice
   * @return allocatedAmount
  */
  @NotNull 
  @Schema(name = "allocatedAmount", example = "300.0", description = "Amount of the payment allocated to this invoice", required = true)
  public Double getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(Double allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAllocationDto paymentAllocationDto = (PaymentAllocationDto) o;
    return Objects.equals(this.id, paymentAllocationDto.id) &&
        Objects.equals(this.paymentId, paymentAllocationDto.paymentId) &&
        Objects.equals(this.invoiceId, paymentAllocationDto.invoiceId) &&
        Objects.equals(this.allocatedAmount, paymentAllocationDto.allocatedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentId, invoiceId, allocatedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAllocationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    allocatedAmount: ").append(toIndentedString(allocatedAmount)).append("\n");
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


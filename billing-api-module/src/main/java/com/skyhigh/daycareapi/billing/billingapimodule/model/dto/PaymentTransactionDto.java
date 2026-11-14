package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.Arrays;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PayerType;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PaymentMethod;
import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.PaymentStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * PaymentTransactionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T19:43:13.655330-04:00[America/Halifax]")
public class PaymentTransactionDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("enrollmentId")
  private Long enrollmentId;

  @JsonProperty("payerType")
  private PayerType payerType;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("paymentDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate paymentDate;

  @JsonProperty("paymentMethod")
  private PaymentMethod paymentMethod;

  @JsonProperty("referenceNumber")
  private JsonNullable<String> referenceNumber = JsonNullable.undefined();

  @JsonProperty("status")
  private PaymentStatus status;

  public PaymentTransactionDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PaymentTransactionDto enrollmentId(Long enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * ID of the child enrollment associated with this payment
   * @return enrollmentId
  */
  @NotNull 
  @Schema(name = "enrollmentId", description = "ID of the child enrollment associated with this payment", required = true)
  public Long getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(Long enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public PaymentTransactionDto payerType(PayerType payerType) {
    this.payerType = payerType;
    return this;
  }

  /**
   * Get payerType
   * @return payerType
  */
  @NotNull @Valid 
  @Schema(name = "payerType", required = true)
  public PayerType getPayerType() {
    return payerType;
  }

  public void setPayerType(PayerType payerType) {
    this.payerType = payerType;
  }

  public PaymentTransactionDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Actual amount received
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", example = "500.0", description = "Actual amount received", required = true)
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentTransactionDto paymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Date the payment was received
   * @return paymentDate
  */
  @NotNull @Valid 
  @Schema(name = "paymentDate", example = "Wed Nov 04 20:00:00 AST 2026", description = "Date the payment was received", required = true)
  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentTransactionDto paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  */
  @NotNull @Valid 
  @Schema(name = "paymentMethod", required = true)
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentTransactionDto referenceNumber(String referenceNumber) {
    this.referenceNumber = JsonNullable.of(referenceNumber);
    return this;
  }

  /**
   * Bank transaction ID, cheque number, or payment reference
   * @return referenceNumber
  */
  
  @Schema(name = "referenceNumber", example = "BANK-2026-00125", description = "Bank transaction ID, cheque number, or payment reference", required = false)
  public JsonNullable<String> getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(JsonNullable<String> referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public PaymentTransactionDto status(PaymentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public PaymentStatus getStatus() {
    return status;
  }

  public void setStatus(PaymentStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionDto paymentTransactionDto = (PaymentTransactionDto) o;
    return Objects.equals(this.id, paymentTransactionDto.id) &&
        Objects.equals(this.enrollmentId, paymentTransactionDto.enrollmentId) &&
        Objects.equals(this.payerType, paymentTransactionDto.payerType) &&
        Objects.equals(this.amount, paymentTransactionDto.amount) &&
        Objects.equals(this.paymentDate, paymentTransactionDto.paymentDate) &&
        Objects.equals(this.paymentMethod, paymentTransactionDto.paymentMethod) &&
        equalsNullable(this.referenceNumber, paymentTransactionDto.referenceNumber) &&
        Objects.equals(this.status, paymentTransactionDto.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enrollmentId, payerType, amount, paymentDate, paymentMethod, hashCodeNullable(referenceNumber), status);
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
    sb.append("class PaymentTransactionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    payerType: ").append(toIndentedString(payerType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


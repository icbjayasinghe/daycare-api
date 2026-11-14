package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T19:43:13.655330-04:00[America/Halifax]")
public enum PaymentStatus {
  
  PENDING("PENDING"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  REVERSED("REVERSED");

  private String value;

  PaymentStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentStatus fromValue(String value) {
    for (PaymentStatus b : PaymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


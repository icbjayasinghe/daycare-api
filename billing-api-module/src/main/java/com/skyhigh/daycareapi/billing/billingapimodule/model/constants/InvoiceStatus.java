package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets InvoiceStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T11:25:01.179228-04:00[America/Halifax]")
public enum InvoiceStatus {
  
  DRAFT("DRAFT"),
  
  ISSUED("ISSUED"),
  
  PARTIALLY_PAID("PARTIALLY_PAID"),
  
  PAID("PAID"),
  
  OVERDUE("OVERDUE"),
  
  VOID("VOID");

  private String value;

  InvoiceStatus(String value) {
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
  public static InvoiceStatus fromValue(String value) {
    for (InvoiceStatus b : InvoiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


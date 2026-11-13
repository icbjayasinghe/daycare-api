package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentMethod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T19:43:13.655330-04:00[America/Halifax]")
public enum PaymentMethod {
  
  CASH("CASH"),
  
  BANK_TRANSFER("BANK_TRANSFER"),
  
  CREDIT_CARD("CREDIT_CARD"),
  
  DEBIT_CARD("DEBIT_CARD"),
  
  CHEQUE("CHEQUE"),
  
  ONLINE("ONLINE"),
  
  OTHER("OTHER");

  private String value;

  PaymentMethod(String value) {
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
  public static PaymentMethod fromValue(String value) {
    for (PaymentMethod b : PaymentMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


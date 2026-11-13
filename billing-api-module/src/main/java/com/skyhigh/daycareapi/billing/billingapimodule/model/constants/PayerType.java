package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PayerType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T19:43:13.655330-04:00[America/Halifax]")
public enum PayerType {
  
  PARENT("PARENT"),
  
  GOVERNMENT("GOVERNMENT"),
  
  OTHER("OTHER");

  private String value;

  PayerType(String value) {
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
  public static PayerType fromValue(String value) {
    for (PayerType b : PayerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FundingFrequency
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T09:40:00.161949-04:00[America/Halifax]")
public enum FundingFrequency {
  
  MONTHLY("MONTHLY"),
  
  WEEKLY("WEEKLY"),
  
  ONE_TIME("ONE_TIME");

  private String value;

  FundingFrequency(String value) {
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
  public static FundingFrequency fromValue(String value) {
    for (FundingFrequency b : FundingFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


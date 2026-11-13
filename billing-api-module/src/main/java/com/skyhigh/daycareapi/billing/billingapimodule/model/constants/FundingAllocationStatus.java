package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FundingAllocationStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-13T18:06:33.160283-04:00[America/Halifax]")
public enum FundingAllocationStatus {
  
  PENDING("PENDING"),
  
  APPROVED("APPROVED"),
  
  APPLIED("APPLIED"),
  
  REVERSED("REVERSED");

  private String value;

  FundingAllocationStatus(String value) {
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
  public static FundingAllocationStatus fromValue(String value) {
    for (FundingAllocationStatus b : FundingAllocationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


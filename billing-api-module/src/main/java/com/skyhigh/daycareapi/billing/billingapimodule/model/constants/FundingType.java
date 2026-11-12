package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Funding type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-11T19:17:18.880535-04:00[America/Halifax]")
public enum FundingType {
  
  GOVERNMENT_REDUCTION("GOVERNMENT_REDUCTION"),
  
  FAMILY_SUBSIDY("FAMILY_SUBSIDY"),
  
  PROVIDER_GRANT("PROVIDER_GRANT");

  private String value;

  FundingType(String value) {
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
  public static FundingType fromValue(String value) {
    for (FundingType b : FundingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


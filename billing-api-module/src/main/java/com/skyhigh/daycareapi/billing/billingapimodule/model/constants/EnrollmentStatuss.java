package com.skyhigh.daycareapi.billing.billingapimodule.model.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Enrollment type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-21T19:01:31.348847-03:00[America/Halifax]")
public enum EnrollmentStatuss {
  
  ACTIVE("ACTIVE"),
  
  ON_HOLD("ON_HOLD"),
  
  WITHDRAWN("WITHDRAWN"),
  
  COMPLETED("COMPLETED");

  private String value;

  EnrollmentStatuss(String value) {
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
  public static EnrollmentStatuss fromValue(String value) {
    for (EnrollmentStatuss b : EnrollmentStatuss.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


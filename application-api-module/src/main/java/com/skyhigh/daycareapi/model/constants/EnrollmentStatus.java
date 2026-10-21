package com.skyhigh.daycareapi.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Enrollment type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-21T19:01:31.348847-03:00[America/Halifax]")
public enum EnrollmentStatus {
  
  ACTIVE("ACTIVE"),
  
  ON_HOLD("ON_HOLD"),
  
  WITHDRAWN("WITHDRAWN"),
  
  COMPLETED("COMPLETED");

  private String value;

  EnrollmentStatus(String value) {
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
  public static EnrollmentStatus fromValue(String value) {
    for (EnrollmentStatus b : EnrollmentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


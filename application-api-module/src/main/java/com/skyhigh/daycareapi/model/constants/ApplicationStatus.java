package com.skyhigh.daycareapi.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Request type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-12T14:38:03.748306-03:00[America/Halifax]")
public enum ApplicationStatus {

  PENDING("PENDING"),

  WAITLISTED("WAITLISTED"),

  ACCEPTED("ACCEPTED"),

  REJECTED("REJECTED"),

  WITHDRAWN("WITHDRAWN"),

  ENROLLED("ENROLLED");

  private String value;

  ApplicationStatus(String value) {
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
  public static ApplicationStatus fromValue(String value) {
    for (ApplicationStatus b : ApplicationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

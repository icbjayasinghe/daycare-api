package com.skyhigh.daycareapi.model.constants;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Request type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-18T20:55:09.726984-03:00[America/Halifax]")
public enum DaycareStatus {
  
  PENDING("PENDING"),
  
  APPROVED("APPROVED"),
  
  REJECTED("REJECTED"),
  
  DEACTIVATED("DEACTIVATED");

  private String value;

  DaycareStatus(String value) {
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
  public static DaycareStatus fromValue(String value) {
    for (DaycareStatus b : DaycareStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


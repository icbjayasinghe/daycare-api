package com.skyhigh.daycareapi.model.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-11T16:42:00.584641-03:00[America/Halifax]")
public enum Gender {

    MALE("MALE"),

    FEMALE("FEMALE"),

    NOT_SPECIFIED("NOT_SPECIFIED");

    private String value;

    Gender(String value) {
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
    public static Gender fromValue(String value) {
        for (Gender b : Gender.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

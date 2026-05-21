package com.skyhigh.daycareapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.validation.Valid;

@Builder
public class OwnerDto {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    // TODO: use mapstruct for enums
    @JsonProperty("userType")
    private int userType;

    public OwnerDto firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Schema(
            name = "firstName",
            required = false
    )
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public OwnerDto lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Schema(
            name = "lastName",
            required = false
    )
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public OwnerDto email(String email) {
        this.email = email;
        return this;
    }

    @Schema(
            name = "email",
            required = false
    )
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OwnerDto phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Schema(
            name = "phoneNumber",
            required = false
    )
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public OwnerDto userType(int userType) {
        this.userType = userType;
        return this;
    }

    @Schema(
            name = "userType",
            required = false
    )
    public @Valid int getUserType() {
        return this.userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}

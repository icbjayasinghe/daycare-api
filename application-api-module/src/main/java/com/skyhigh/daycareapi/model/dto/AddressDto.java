package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Address model
 */

@Schema(name = "AddressDto", description = "Address model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-24T05:34:36.063118-04:00[America/Halifax]")
@Builder
public class AddressDto {

  @JsonProperty("apartment")
  private String apartment;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  public AddressDto apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

  /**
   * Get apartment
   * @return apartment
   */

  @Schema(name = "apartment", required = false)
  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public AddressDto address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */

  @Schema(name = "address", required = false)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AddressDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */

  @Schema(name = "city", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressDto state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */

  @Schema(name = "state", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressDto postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */

  @Schema(name = "postalCode", required = false)
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */

  @Schema(name = "country", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDto addressDto = (AddressDto) o;
    return Objects.equals(this.apartment, addressDto.apartment) &&
            Objects.equals(this.address, addressDto.address) &&
            Objects.equals(this.city, addressDto.city) &&
            Objects.equals(this.state, addressDto.state) &&
            Objects.equals(this.postalCode, addressDto.postalCode) &&
            Objects.equals(this.country, addressDto.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apartment, address, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDto {\n");
    sb.append("    apartment: ").append(toIndentedString(apartment)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


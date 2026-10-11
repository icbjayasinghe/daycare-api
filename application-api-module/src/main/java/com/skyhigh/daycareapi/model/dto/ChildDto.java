package com.skyhigh.daycareapi.model.dto;

import java.time.LocalDate;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.daycareapi.model.constants.Gender;
import lombok.Builder;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;


import javax.annotation.Generated;

/**
 * 
 */

@Schema(name = "ChildDto", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-24T05:34:36.063118-04:00[America/Halifax]")
@Builder
public class ChildDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("dob")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dob;

  @JsonProperty("sex")
  private Gender sex;

  public ChildDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */

  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ChildDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */

  @Schema(name = "firstName", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ChildDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */

  @Schema(name = "lastName", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ChildDto dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @Valid
  @Schema(name = "dob", required = false)
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public ChildDto sex(Gender sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
   */
  @Valid
  @Schema(name = "sex", required = false)
  public Gender getSex() {
    return sex;
  }

  public void setSex(Gender sex) {
    this.sex = sex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildDto childDto = (ChildDto) o;
    return Objects.equals(this.id, childDto.id) &&
            Objects.equals(this.firstName, childDto.firstName) &&
            Objects.equals(this.lastName, childDto.lastName) &&
            Objects.equals(this.dob, childDto.dob) &&
            Objects.equals(this.sex, childDto.sex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, dob, sex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
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


package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * 
 */

@Schema(name = "ChildRequestDto", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-12T13:37:07.215130-03:00[America/Halifax]")
public class ChildRequestDto {

  @JsonProperty("requestType")
  private ApplicationStatus applicationStatus;

  @JsonProperty("child")
  private ChildDto child;

  public ChildRequestDto requestType(ApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
    return this;
  }

  /**
   * Get requestType
   * @return requestType
  */
  @Valid 
  @Schema(name = "requestType", required = false)
  public ApplicationStatus getRequestType() {
    return applicationStatus;
  }

  public void setRequestType(ApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  public ChildRequestDto child(ChildDto child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @Valid 
  @Schema(name = "child", required = false)
  public ChildDto getChild() {
    return child;
  }

  public void setChild(ChildDto child) {
    this.child = child;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildRequestDto childRequestDto = (ChildRequestDto) o;
    return Objects.equals(this.applicationStatus, childRequestDto.applicationStatus) &&
        Objects.equals(this.child, childRequestDto.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationStatus, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildRequestDto {\n");
    sb.append("    requestType: ").append(toIndentedString(applicationStatus)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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


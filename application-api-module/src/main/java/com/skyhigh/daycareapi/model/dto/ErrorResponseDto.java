package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * API error response model
 */

@Schema(name = "ErrorResponseDto", description = "API error response model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T19:01:23.670155-03:00[America/Halifax]")
public class ErrorResponseDto {

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("message")
  private String message;

  public ErrorResponseDto(Integer status, String message) {
    this.status = status;
    this.message = message;
  }

  public ErrorResponseDto status(Integer status) {
      this.status = status;
      return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "403", required = true)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorResponseDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "Account disabled", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseDto errorResponseDto = (ErrorResponseDto) o;
    return Objects.equals(this.status, errorResponseDto.status) &&
        Objects.equals(this.message, errorResponseDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseDto {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


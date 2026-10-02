package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * User login model
 */

@Schema(name = "LoginRequestDto", description = "User login model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-01T17:53:30.464277-03:00[America/Halifax]")
public class LoginRequestDto {

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  public LoginRequestDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginRequestDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", required = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequestDto loginRequestDto = (LoginRequestDto) o;
    return Objects.equals(this.email, loginRequestDto.email) &&
        Objects.equals(this.password, loginRequestDto.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequestDto {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


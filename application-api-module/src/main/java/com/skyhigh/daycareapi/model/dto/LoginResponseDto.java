package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * User login model
 */

@Schema(name = "LoginResponseDto", description = "User login model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-01T17:53:30.464277-03:00[America/Halifax]")
public class LoginResponseDto {

  private String accessToken;

  private String refreshToken;

  private String tokenType;

  private Integer expiresIn;

  public LoginResponseDto accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  
  @Schema(name = "access_token", example = "eyJhbGciOiJSUzI1NiIs...", required = false)
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public LoginResponseDto refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
  */
  
  @Schema(name = "refresh_token", example = "eyJhbGciOiJSUzI1NiIs...", required = false)
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public LoginResponseDto tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
  */
  
  @Schema(name = "token_type", example = "Bearer", required = false)
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public LoginResponseDto expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
  */
  
  @Schema(name = "expires_in", example = "300", required = false)
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponseDto loginResponseDto = (LoginResponseDto) o;
    return Objects.equals(this.accessToken, loginResponseDto.accessToken) &&
        Objects.equals(this.refreshToken, loginResponseDto.refreshToken) &&
        Objects.equals(this.tokenType, loginResponseDto.tokenType) &&
        Objects.equals(this.expiresIn, loginResponseDto.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, tokenType, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponseDto {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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


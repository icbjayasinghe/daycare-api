package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * DaycareLogoDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-14T20:07:47.127004-04:00[America/Halifax]")
public class DaycareLogoDto {

  @JsonProperty("daycareId")
  private Long daycareId;

  @JsonProperty("logoUrl")
  private String logoUrl;

  public DaycareLogoDto daycareId(Long daycareId) {
    this.daycareId = daycareId;
    return this;
  }

  /**
   * Get daycareId
   * @return daycareId
  */
  
  @Schema(name = "daycareId", required = false)
  public Long getDaycareId() {
    return daycareId;
  }

  public void setDaycareId(Long daycareId) {
    this.daycareId = daycareId;
  }

  public DaycareLogoDto logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Get logoUrl
   * @return logoUrl
  */
  
  @Schema(name = "logoUrl", example = "https://cdn.example.com/daycares/101/logo.png", required = false)
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DaycareLogoDto daycareLogoDto = (DaycareLogoDto) o;
    return Objects.equals(this.daycareId, daycareLogoDto.daycareId) &&
        Objects.equals(this.logoUrl, daycareLogoDto.logoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daycareId, logoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaycareLogoDto {\n");
    sb.append("    daycareId: ").append(toIndentedString(daycareId)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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


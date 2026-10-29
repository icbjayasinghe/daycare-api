package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * DaycareConfigDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-29T18:53:28.207953-03:00[America/Halifax]")
public class DaycareConfigDto {
  @JsonProperty("configId")
  private Long configId;
  @JsonProperty("totalCapacity")
  private Long totalCapacity;
  @JsonProperty("hourlyCharge")
  private Long hourlyCharge;

  public DaycareConfigDto() {
  }

  public DaycareConfigDto configId(Long configId) {
    this.configId = configId;
    return this;
  }

  @Schema(
          name = "configId",
          example = "101",
          required = false
  )
  public Long getConfigId() {
    return this.configId;
  }

  public void setConfigId(Long configId) {
    this.configId = configId;
  }

  public DaycareConfigDto totalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

  @Schema(
          name = "totalCapacity",
          example = "5",
          required = false
  )
  public Long getTotalCapacity() {
    return this.totalCapacity;
  }

  public void setTotalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public DaycareConfigDto hourlyCharge(Long hourlyCharge) {
    this.hourlyCharge = hourlyCharge;
    return this;
  }

  @Schema(
          name = "hourlyCharge",
          example = "18",
          required = false
  )
  public Long getHourlyCharge() {
    return this.hourlyCharge;
  }

  public void setHourlyCharge(Long hourlyCharge) {
    this.hourlyCharge = hourlyCharge;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o != null && this.getClass() == o.getClass()) {
      DaycareConfigDto daycareConfigDto = (DaycareConfigDto)o;
      return Objects.equals(this.configId, daycareConfigDto.configId) && Objects.equals(this.totalCapacity, daycareConfigDto.totalCapacity) && Objects.equals(this.hourlyCharge, daycareConfigDto.hourlyCharge);
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects.hash(new Object[]{this.configId, this.totalCapacity, this.hourlyCharge});
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaycareConfigDto {\n");
    sb.append("    configId: ").append(this.toIndentedString(this.configId)).append("\n");
    sb.append("    totalCapacity: ").append(this.toIndentedString(this.totalCapacity)).append("\n");
    sb.append("    hourlyCharge: ").append(this.toIndentedString(this.hourlyCharge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


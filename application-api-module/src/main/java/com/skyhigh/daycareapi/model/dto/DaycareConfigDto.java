package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.domainmodule.model.facility.DayCare;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.experimental.SuperBuilder;


import javax.annotation.Generated;

/**
 * DaycareConfigDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-29T18:53:28.207953-03:00[America/Halifax]")
@SuperBuilder
public class DaycareConfigDto {
  @JsonProperty("configId")
  private Long configId;

  @JsonProperty("daycareId")
  private Long daycareId;

  @JsonProperty("totalCapacity")
  private Long totalCapacity;

  @JsonProperty("hourlyCharge")
  private Long hourlyCharge;

  @JsonProperty("paymentsEnabled")
  private Boolean paymentsEnabled = false;

  public DaycareConfigDto configId(Long configId) {
    this.configId = configId;
    return this;
  }

  /**
   * Get configId
   * @return configId
   */

  @Schema(name = "configId", example = "101", required = false)
  public Long getConfigId() {
    return configId;
  }

  public void setConfigId(Long configId) {
    this.configId = configId;
  }

  public DaycareConfigDto daycareId(Long daycareId) {
    this.daycareId = daycareId;
    return this;
  }

  /**
   * Get daycareId
   * @return daycareId
   */

  @Schema(name = "daycareId", example = "101", required = false)
  public Long getDaycareId() {
    return daycareId;
  }

  public void setDaycareId(Long daycareId) {
    this.daycareId = daycareId;
  }

  public DaycareConfigDto totalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

  /**
   * Get totalCapacity
   * @return totalCapacity
   */

  @Schema(name = "totalCapacity", example = "5", required = false)
  public Long getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public DaycareConfigDto hourlyCharge(Long hourlyCharge) {
    this.hourlyCharge = hourlyCharge;
    return this;
  }

  /**
   * Get hourlyCharge
   * @return hourlyCharge
   */

  @Schema(name = "hourlyCharge", example = "18", required = false)
  public Long getHourlyCharge() {
    return hourlyCharge;
  }

  public void setHourlyCharge(Long hourlyCharge) {
    this.hourlyCharge = hourlyCharge;
  }

  public DaycareConfigDto paymentsEnabled(Boolean paymentsEnabled) {
    this.paymentsEnabled = paymentsEnabled;
    return this;
  }

  /**
   * Get paymentsEnabled
   * @return paymentsEnabled
   */

  @Schema(name = "paymentsEnabled", example = "true", required = false)
  public Boolean getPaymentsEnabled() {
    return paymentsEnabled;
  }

  public void setPaymentsEnabled(Boolean paymentsEnabled) {
    this.paymentsEnabled = paymentsEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DaycareConfigDto daycareConfigDto = (DaycareConfigDto) o;
    return Objects.equals(this.configId, daycareConfigDto.configId) &&
            Objects.equals(this.daycareId, daycareConfigDto.daycareId) &&
            Objects.equals(this.totalCapacity, daycareConfigDto.totalCapacity) &&
            Objects.equals(this.hourlyCharge, daycareConfigDto.hourlyCharge) &&
            Objects.equals(this.paymentsEnabled, daycareConfigDto.paymentsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, daycareId, totalCapacity, hourlyCharge, paymentsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaycareConfigDto {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    daycareId: ").append(toIndentedString(daycareId)).append("\n");
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    hourlyCharge: ").append(toIndentedString(hourlyCharge)).append("\n");
    sb.append("    paymentsEnabled: ").append(toIndentedString(paymentsEnabled)).append("\n");
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

  public DaycareConfigDto() {
  }

  public DaycareConfigDto(Long configId, Long daycareId, Long totalCapacity, Long hourlyCharge, Boolean paymentsEnabled) {
    this.configId = configId;
    this.daycareId = daycareId;
    this.totalCapacity = totalCapacity;
    this.hourlyCharge = hourlyCharge;
    this.paymentsEnabled = paymentsEnabled;
  }
}


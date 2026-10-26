package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * DaycareDashboardDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-26T18:20:29.957994-03:00[America/Halifax]")
public class DaycareDashboardDto {

  @JsonProperty("daycareId")
  private Long daycareId;

  @JsonProperty("totalCapacity")
  private Integer totalCapacity;

  @JsonProperty("enrolledChildren")
  private Integer enrolledChildren;

  @JsonProperty("availableSpaces")
  private Integer availableSpaces;

  @JsonProperty("occupancyRate")
  private Double occupancyRate;

  @JsonProperty("applications")
  private ApplicationSummaryDto applications;

  @JsonProperty("recentApplications")
  @Valid
  private List<DayCareApplicationDto> recentApplications = null;

  public DaycareDashboardDto daycareId(Long daycareId) {
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

  public DaycareDashboardDto totalCapacity(Integer totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

  /**
   * Get totalCapacity
   * @return totalCapacity
  */
  
  @Schema(name = "totalCapacity", example = "25", required = false)
  public Integer getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(Integer totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public DaycareDashboardDto enrolledChildren(Integer enrolledChildren) {
    this.enrolledChildren = enrolledChildren;
    return this;
  }

  /**
   * Get enrolledChildren
   * @return enrolledChildren
  */
  
  @Schema(name = "enrolledChildren", example = "18", required = false)
  public Integer getEnrolledChildren() {
    return enrolledChildren;
  }

  public void setEnrolledChildren(Integer enrolledChildren) {
    this.enrolledChildren = enrolledChildren;
  }

  public DaycareDashboardDto availableSpaces(Integer availableSpaces) {
    this.availableSpaces = availableSpaces;
    return this;
  }

  /**
   * Get availableSpaces
   * @return availableSpaces
  */
  
  @Schema(name = "availableSpaces", example = "7", required = false)
  public Integer getAvailableSpaces() {
    return availableSpaces;
  }

  public void setAvailableSpaces(Integer availableSpaces) {
    this.availableSpaces = availableSpaces;
  }

  public DaycareDashboardDto occupancyRate(Double occupancyRate) {
    this.occupancyRate = occupancyRate;
    return this;
  }

  /**
   * Get occupancyRate
   * @return occupancyRate
  */
  
  @Schema(name = "occupancyRate", example = "72.0", required = false)
  public Double getOccupancyRate() {
    return occupancyRate;
  }

  public void setOccupancyRate(Double occupancyRate) {
    this.occupancyRate = occupancyRate;
  }

  public DaycareDashboardDto applications(ApplicationSummaryDto applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * @return applications
  */
  @Valid 
  @Schema(name = "applications", required = false)
  public ApplicationSummaryDto getApplications() {
    return applications;
  }

  public void setApplications(ApplicationSummaryDto applications) {
    this.applications = applications;
  }

  public DaycareDashboardDto recentApplications(List<DayCareApplicationDto> recentApplications) {
    this.recentApplications = recentApplications;
    return this;
  }

  public DaycareDashboardDto addRecentApplicationsItem(DayCareApplicationDto recentApplicationsItem) {
    if (this.recentApplications == null) {
      this.recentApplications = new ArrayList<>();
    }
    this.recentApplications.add(recentApplicationsItem);
    return this;
  }

  /**
   * Get recentApplications
   * @return recentApplications
  */
  @Valid 
  @Schema(name = "recentApplications", required = false)
  public List<DayCareApplicationDto> getRecentApplications() {
    return recentApplications;
  }

  public void setRecentApplications(List<DayCareApplicationDto> recentApplications) {
    this.recentApplications = recentApplications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DaycareDashboardDto daycareDashboardDto = (DaycareDashboardDto) o;
    return Objects.equals(this.daycareId, daycareDashboardDto.daycareId) &&
        Objects.equals(this.totalCapacity, daycareDashboardDto.totalCapacity) &&
        Objects.equals(this.enrolledChildren, daycareDashboardDto.enrolledChildren) &&
        Objects.equals(this.availableSpaces, daycareDashboardDto.availableSpaces) &&
        Objects.equals(this.occupancyRate, daycareDashboardDto.occupancyRate) &&
        Objects.equals(this.applications, daycareDashboardDto.applications) &&
        Objects.equals(this.recentApplications, daycareDashboardDto.recentApplications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daycareId, totalCapacity, enrolledChildren, availableSpaces, occupancyRate, applications, recentApplications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaycareDashboardDto {\n");
    sb.append("    daycareId: ").append(toIndentedString(daycareId)).append("\n");
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    enrolledChildren: ").append(toIndentedString(enrolledChildren)).append("\n");
    sb.append("    availableSpaces: ").append(toIndentedString(availableSpaces)).append("\n");
    sb.append("    occupancyRate: ").append(toIndentedString(occupancyRate)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    recentApplications: ").append(toIndentedString(recentApplications)).append("\n");
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


package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

import com.skyhigh.daycareapi.model.constants.ApplicationStatus;
import lombok.Builder;import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Application submitted by a parent for a child to attend a daycare.
 */

@Schema(name = "DayCareApplicationDto", description = "Application submitted by a parent for a child to attend a daycare.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-12T15:41:26.195873-03:00[America/Halifax]")
@Builder
public class DayCareApplicationDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("child")
  private ChildDto child;

  @JsonProperty("dayCare")
  private DayCareDto dayCare;

  @JsonProperty("status")
  private ApplicationStatus status;

  @JsonProperty("appliedAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime appliedAt;

  public DayCareApplicationDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "1", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DayCareApplicationDto child(ChildDto child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @NotNull @Valid 
  @Schema(name = "child", required = true)
  public ChildDto getChild() {
    return child;
  }

  public void setChild(ChildDto child) {
    this.child = child;
  }

  public DayCareApplicationDto dayCare(DayCareDto dayCare) {
    this.dayCare = dayCare;
    return this;
  }

  /**
   * Get dayCare
   * @return dayCare
  */
  @NotNull @Valid 
  @Schema(name = "dayCare", required = true)
  public DayCareDto getDayCare() {
    return dayCare;
  }

  public void setDayCare(DayCareDto dayCare) {
    this.dayCare = dayCare;
  }

  public DayCareApplicationDto status(ApplicationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }

  public DayCareApplicationDto appliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
    return this;
  }

  /**
   * Get appliedAt
   * @return appliedAt
  */
  @Valid 
  @Schema(name = "appliedAt", accessMode = Schema.AccessMode.READ_ONLY, required = true)
  public OffsetDateTime getAppliedAt() {
    return appliedAt;
  }

  public void setAppliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayCareApplicationDto dayCareApplicationDto = (DayCareApplicationDto) o;
    return Objects.equals(this.id, dayCareApplicationDto.id) &&
        Objects.equals(this.child, dayCareApplicationDto.child) &&
        Objects.equals(this.dayCare, dayCareApplicationDto.dayCare) &&
        Objects.equals(this.status, dayCareApplicationDto.status) &&
        Objects.equals(this.appliedAt, dayCareApplicationDto.appliedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, child, dayCare, status, appliedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayCareApplicationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    dayCare: ").append(toIndentedString(dayCare)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
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


package com.skyhigh.daycareapi.billing.billingapimodule.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

import com.skyhigh.daycareapi.billing.billingapimodule.model.constants.FundingType;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * FundingProgramDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-11T19:17:18.880535-04:00[America/Halifax]")
public class FundingProgramDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  @JsonProperty("fundingType")
  private FundingType fundingType;

  @JsonProperty("active")
  private Boolean active;

  public FundingProgramDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FundingProgramDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Nova Scotia Child Care Subsidy", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FundingProgramDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "NS_CHILD_CARE_SUBSIDY", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public FundingProgramDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Financial assistance for eligible families to reduce daycare expenses.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FundingProgramDto fundingType(FundingType fundingType) {
    this.fundingType = fundingType;
    return this;
  }

  /**
   * Get fundingType
   * @return fundingType
  */
  @NotNull @Valid 
  @Schema(name = "fundingType", required = true)
  public FundingType getFundingType() {
    return fundingType;
  }

  public void setFundingType(FundingType fundingType) {
    this.fundingType = fundingType;
  }

  public FundingProgramDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @NotNull 
  @Schema(name = "active", example = "true", required = true)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingProgramDto fundingProgramDto = (FundingProgramDto) o;
    return Objects.equals(this.id, fundingProgramDto.id) &&
        Objects.equals(this.name, fundingProgramDto.name) &&
        Objects.equals(this.code, fundingProgramDto.code) &&
        Objects.equals(this.description, fundingProgramDto.description) &&
        Objects.equals(this.fundingType, fundingProgramDto.fundingType) &&
        Objects.equals(this.active, fundingProgramDto.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, description, fundingType, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingProgramDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fundingType: ").append(toIndentedString(fundingType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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


package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;


import javax.annotation.Generated;

/**
 * ApplicationSummaryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-26T18:20:29.957994-03:00[America/Halifax]")
@Builder
public class ApplicationSummaryDto {

  @JsonProperty("pending")
  private Long pending;

  @JsonProperty("approved")
  private Long approved;

  @JsonProperty("rejected")
  private Long rejected;

  public ApplicationSummaryDto(Long pending, Long approved, Long rejected) {
    this.pending = pending;
    this.approved = approved;
    this.rejected = rejected;
  }

  public ApplicationSummaryDto pending(Long pending) {
    this.pending = pending;
    return this;
  }

  /**
   * Get pending
   * @return pending
   */

  @Schema(name = "pending", example = "5", required = false)
  public Long getPending() {
    return pending;
  }

  public void setPending(Long pending) {
    this.pending = pending;
  }

  public ApplicationSummaryDto approved(Long approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
   */

  @Schema(name = "approved", example = "18", required = false)
  public Long getApproved() {
    return approved;
  }

  public void setApproved(Long approved) {
    this.approved = approved;
  }

  public ApplicationSummaryDto rejected(Long rejected) {
    this.rejected = rejected;
    return this;
  }

  /**
   * Get rejected
   * @return rejected
   */

  @Schema(name = "rejected", example = "2", required = false)
  public Long getRejected() {
    return rejected;
  }

  public void setRejected(Long rejected) {
    this.rejected = rejected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSummaryDto applicationSummaryDto = (ApplicationSummaryDto) o;
    return Objects.equals(this.pending, applicationSummaryDto.pending) &&
            Objects.equals(this.approved, applicationSummaryDto.approved) &&
            Objects.equals(this.rejected, applicationSummaryDto.rejected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, approved, rejected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSummaryDto {\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
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


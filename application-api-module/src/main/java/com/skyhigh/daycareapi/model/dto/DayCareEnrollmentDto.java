package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.Arrays;

import com.skyhigh.daycareapi.model.constants.EnrollmentStatus;
import lombok.Builder;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * DayCareEnrollmentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-21T19:10:00.949325-03:00[America/Halifax]")
@Builder
public class DayCareEnrollmentDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("child")
  private ChildDto child;

  @JsonProperty("daycare")
  private DayCareDto daycare;

  @JsonProperty("status")
  private EnrollmentStatus status;

  @JsonProperty("enrollmentDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate enrollmentDate;

  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> endDate = JsonNullable.undefined();

  @JsonProperty("schedule")
  private String schedule;

  public DayCareEnrollmentDto id(Long id) {
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

  public DayCareEnrollmentDto child(ChildDto child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @Valid 
  @Schema(name = "child", required = false)
  public ChildDto getChild() {
    return child;
  }

  public void setChild(ChildDto child) {
    this.child = child;
  }

  public DayCareEnrollmentDto daycare(DayCareDto daycare) {
    this.daycare = daycare;
    return this;
  }

  /**
   * Get daycare
   * @return daycare
  */
  @Valid 
  @Schema(name = "daycare", required = false)
  public DayCareDto getDaycare() {
    return daycare;
  }

  public void setDaycare(DayCareDto daycare) {
    this.daycare = daycare;
  }

  public DayCareEnrollmentDto status(EnrollmentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", required = true)
  public EnrollmentStatus getStatus() {
    return status;
  }

  public void setStatus(EnrollmentStatus status) {
    this.status = status;
  }

  public DayCareEnrollmentDto enrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }

  /**
   * Date the child enrolled in the daycare
   * @return enrollmentDate
  */
  @Valid 
  @Schema(name = "enrollmentDate", example = "Tue Oct 20 21:00:00 ADT 2026", description = "Date the child enrolled in the daycare", required = false)
  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public DayCareEnrollmentDto endDate(LocalDate endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Date the enrollment ended
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", example = "Wed Oct 20 21:00:00 ADT 2027", description = "Date the enrollment ended", required = false)
  public JsonNullable<LocalDate> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<LocalDate> endDate) {
    this.endDate = endDate;
  }

  public DayCareEnrollmentDto schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Child's daycare attendance schedule
   * @return schedule
  */
  
  @Schema(name = "schedule", example = "Monday-Friday, 8:00 AM - 5:00 PM", description = "Child's daycare attendance schedule", required = false)
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayCareEnrollmentDto dayCareEnrollmentDto = (DayCareEnrollmentDto) o;
    return Objects.equals(this.id, dayCareEnrollmentDto.id) &&
        Objects.equals(this.child, dayCareEnrollmentDto.child) &&
        Objects.equals(this.daycare, dayCareEnrollmentDto.daycare) &&
        Objects.equals(this.status, dayCareEnrollmentDto.status) &&
        Objects.equals(this.enrollmentDate, dayCareEnrollmentDto.enrollmentDate) &&
        equalsNullable(this.endDate, dayCareEnrollmentDto.endDate) &&
        Objects.equals(this.schedule, dayCareEnrollmentDto.schedule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, child, daycare, status, enrollmentDate, hashCodeNullable(endDate), schedule);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayCareEnrollmentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    daycare: ").append(toIndentedString(daycare)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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


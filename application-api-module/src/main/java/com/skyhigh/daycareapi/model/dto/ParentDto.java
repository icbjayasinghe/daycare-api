package com.skyhigh.daycareapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * ParentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-24T05:34:36.063118-04:00[America/Halifax]")
public class ParentDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("parentStatus")
  private Integer parentStatus;

  @JsonProperty("address")
  private AddressDto address;

  @JsonProperty("children")
  @Valid
  private List<ChildDto> children = null;

  public ParentDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParentDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", required = true)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ParentDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", required = true)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ParentDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ParentDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ParentDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ParentDto parentStatus(Integer parentStatus) {
    this.parentStatus = parentStatus;
    return this;
  }

  /**
   * Parent Status
   * @return parentStatus
  */
  
  @Schema(name = "parentStatus", description = "Parent Status", required = false)
  public Integer getParentStatus() {
    return parentStatus;
  }

  public void setParentStatus(Integer parentStatus) {
    this.parentStatus = parentStatus;
  }

  public ParentDto address(AddressDto address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) {
    this.address = address;
  }

  public ParentDto children(List<ChildDto> children) {
    this.children = children;
    return this;
  }

  public ParentDto addChildrenItem(ChildDto childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @Valid 
  @Schema(name = "children", required = false)
  public List<ChildDto> getChildren() {
    return children;
  }

  public void setChildren(List<ChildDto> children) {
    this.children = children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentDto parentDto = (ParentDto) o;
    return Objects.equals(this.id, parentDto.id) &&
        Objects.equals(this.firstName, parentDto.firstName) &&
        Objects.equals(this.lastName, parentDto.lastName) &&
        Objects.equals(this.email, parentDto.email) &&
        Objects.equals(this.password, parentDto.password) &&
        Objects.equals(this.phone, parentDto.phone) &&
        Objects.equals(this.parentStatus, parentDto.parentStatus) &&
        Objects.equals(this.address, parentDto.address) &&
        Objects.equals(this.children, parentDto.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, password, phone, parentStatus, address, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    parentStatus: ").append(toIndentedString(parentStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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


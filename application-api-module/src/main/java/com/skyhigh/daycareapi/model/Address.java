package com.skyhigh.daycareapi.model;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "Address")
public class Address {

  public Address() {
  }

  public Address(Long id, String streetNumber, String addressLine1, String addressLine2, String city, String province, String postalCode, String locationCoordinates) {
    this.id = id;
    this.streetNumber = streetNumber;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
    this.locationCoordinates = locationCoordinates;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String streetNumber;

  private String addressLine1;

  private String addressLine2;

  private String city;

  private String province;

  private String postalCode;

  @Column(columnDefinition = "json")
  private String locationCoordinates;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getLocationCoordinates() {
    return locationCoordinates;
  }

  public void setLocationCoordinates(String locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
  }
}
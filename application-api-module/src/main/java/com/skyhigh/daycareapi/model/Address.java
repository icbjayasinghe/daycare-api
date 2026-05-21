package com.skyhigh.daycareapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "Address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String apartment;

  private String address;

  private String city;

  private String state;

  private String postalCode;

  private String country;

  @Column(columnDefinition = "json")
  private String locationCoordinates;

  public Address() {
  }

  public Address(Long id, String apartment, String address, String city, String state, String postalCode, String country, String locationCoordinates) {
    this.id = id;
    this.apartment = apartment;
    this.address = address;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
    this.country = country;
    this.locationCoordinates = locationCoordinates;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLocationCoordinates() {
    return locationCoordinates;
  }

  public void setLocationCoordinates(String locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
  }
}
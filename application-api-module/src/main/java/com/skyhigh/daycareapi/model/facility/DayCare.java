package com.skyhigh.daycareapi.model.facility;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.daycareapi.model.Address;
import com.skyhigh.daycareapi.model.DayCareApplication;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@Table
@NoArgsConstructor
public class DayCare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private String telephone;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private String website;

    private Boolean withOwnPortal;

    @OneToMany(mappedBy = "dayCare")
    private List<DayCareApplication> applications =
            new ArrayList<>();

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getWithOwnPortal() {
        return withOwnPortal;
    }

    public void setWithOwnPortal(Boolean withOwnPortal) {
        this.withOwnPortal = withOwnPortal;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<DayCareApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<DayCareApplication> applications) {
        this.applications = applications;
    }
}

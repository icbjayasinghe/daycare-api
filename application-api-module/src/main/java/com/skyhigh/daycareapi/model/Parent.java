package com.skyhigh.daycareapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skyhigh.daycareapi.model.constants.ParentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
public class Parent extends User {
    private ParentStatus parentStatus;

    @OneToOne
    @JoinColumn(name = "address_id")
    @JsonIgnore
    private Address address;

    public Parent() {
    }

    public Parent(UserBuilder<?, ?> b, ParentStatus parentStatus) {
        super(b);
        this.parentStatus = parentStatus;
    }

    public ParentStatus getParentStatus() {
        return parentStatus;
    }

    public void setParentStatus(ParentStatus parentStatus) {
        this.parentStatus = parentStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
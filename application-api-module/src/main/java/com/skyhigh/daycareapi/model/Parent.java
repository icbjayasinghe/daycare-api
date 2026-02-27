package com.skyhigh.daycareapi.model;

import com.skyhigh.daycareapi.model.constants.ParentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Parent extends User {
    private ParentStatus parentStatus;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ParentStatus getParentStatus() {
        return parentStatus;
    }

    public void setParentStatus(ParentStatus parentStatus) {
        this.parentStatus = parentStatus;
    }
}
package com.skyhigh.daycareapi.model;

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
    private Address address;

    public Parent() {
    }

    public Parent(ParentStatus parentStatus, Address address) {
        this.parentStatus = parentStatus;
        this.address = address;
    }

    public Parent(Long id, String firstName, String lastName, String passwordHash, String email, String phoneNumber, Address address, ParentStatus parentStatus, Address address1) {
        super(id, firstName, lastName, passwordHash, email, phoneNumber, address);
        this.parentStatus = parentStatus;
        this.address = address1;
    }

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
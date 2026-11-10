package com.skyhigh.domainmodule.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skyhigh.domainmodule.model.constants.ParentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
public class Parent extends com.skyhigh.domainmodule.model.User {
    private ParentStatus parentStatus;

    @OneToOne
    @JoinColumn(name = "address_id")
    @JsonIgnore
    private com.skyhigh.domainmodule.model.Address address;

    public Parent() {
    }

    public Parent(UserBuilder<?, ?> b, ParentStatus parentStatus) {
        super(b);
        this.parentStatus = parentStatus;
    }

    public Parent(com.skyhigh.domainmodule.model.User user, ParentStatus parentStatus, com.skyhigh.domainmodule.model.Address address) {
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setEmail(user.getEmail());
        this.setPasswordHash(user.getPasswordHash());
        this.setPhoneNumber(user.getPhoneNumber());
        this.address = address;
        this.parentStatus = parentStatus;
    }

    public ParentStatus getParentStatus() {
        return parentStatus;
    }

    public void setParentStatus(ParentStatus parentStatus) {
        this.parentStatus = parentStatus;
    }

    public com.skyhigh.domainmodule.model.Address getAddress() {
        return address;
    }

    public void setAddress(com.skyhigh.domainmodule.model.Address address) {
        this.address = address;
    }
}
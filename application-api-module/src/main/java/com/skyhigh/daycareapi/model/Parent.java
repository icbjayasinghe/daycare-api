package com.skyhigh.daycareapi.model;

import com.skyhigh.daycareapi.model.constants.ParentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

    public Parent(UserBuilder<?, ?> b, ParentStatus parentStatus) {
        super(b);
        this.parentStatus = parentStatus;
    }

    public Parent(User user, ParentStatus parentStatus) {
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setEmail(user.getEmail());
        this.setPasswordHash(user.getPasswordHash());
        this.setPhoneNumber(user.getPhoneNumber());
        this.setAddress(user.getAddress());
        this.parentStatus = parentStatus;
    }

    public ParentStatus getParentStatus() {
        return parentStatus;
    }

    public void setParentStatus(ParentStatus parentStatus) {
        this.parentStatus = parentStatus;
    }
}
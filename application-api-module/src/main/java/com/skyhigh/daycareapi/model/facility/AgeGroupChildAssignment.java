package com.skyhigh.daycareapi.model.facility;

import com.skyhigh.daycareapi.model.Child;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AgeGroupChildAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AgeGroup ageGroup;

    @ManyToOne
    private Child child;

    private Date assignedDate;

    private Date assignmentExpiryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getAssignmentExpiryDate() {
        return assignmentExpiryDate;
    }

    public void setAssignmentExpiryDate(Date assignmentExpiryDate) {
        this.assignmentExpiryDate = assignmentExpiryDate;
    }
}

package com.skyhigh.daycareapi.model.facility;

import jakarta.persistence.*;

/**
 * Custom age groups, which might be different for each daycare
 */
@Entity
public class AgeGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Age range name shown to Daycare manager
     * ex: Toddler, Infant, 6-12 months
     */
    private String ageRange;

    /**
     * Minimum child age for the range in months
     * ex: 6 months, 48 months = 4 years
     */
    private int minimumChildAge;

    /**
     * Maximum child age for the range in months
     * ex: 12 months, 60 months = 5 years
     */
    private int maximumChildAge;

    private int totalAvailableSlots;

    @ManyToOne
    private DayCare dayCare;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public int getMinimumChildAge() {
        return minimumChildAge;
    }

    public void setMinimumChildAge(int minimumChildAge) {
        this.minimumChildAge = minimumChildAge;
    }

    public int getMaximumChildAge() {
        return maximumChildAge;
    }

    public void setMaximumChildAge(int maximumChildAge) {
        this.maximumChildAge = maximumChildAge;
    }

    public int getTotalAvailableSlots() {
        return totalAvailableSlots;
    }

    public void setTotalAvailableSlots(int totalAvailableSlots) {
        this.totalAvailableSlots = totalAvailableSlots;
    }

    public DayCare getDayCare() {
        return dayCare;
    }

    public void setDayCare(DayCare dayCare) {
        this.dayCare = dayCare;
    }
}

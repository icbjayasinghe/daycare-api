package com.skyhigh.daycareapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.daycareapi.model.facility.DayCare;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(
        name = "daycare_config",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_daycare_config_daycare",
                        columnNames = "daycare_id"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class DaycareConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long configId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "daycare_id",
            nullable = false,
            unique = true
    )
    private DayCare dayCare;

    @JsonProperty("totalCapacity")
    private Long totalCapacity;

    @JsonProperty("hourlyCharge")
    private Long hourlyCharge;

}

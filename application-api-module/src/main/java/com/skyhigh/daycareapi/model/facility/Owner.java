package com.skyhigh.daycareapi.model.facility;

import com.skyhigh.daycareapi.model.User;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
public class Owner extends User {
}

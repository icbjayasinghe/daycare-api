package com.skyhigh.domainmodule.model.facility;


import com.skyhigh.domainmodule.model.User;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
public class Owner extends User {
}

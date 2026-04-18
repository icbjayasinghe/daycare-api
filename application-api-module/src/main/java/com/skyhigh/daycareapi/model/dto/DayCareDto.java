package com.skyhigh.daycareapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class DayCareDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("telephone")
    private String telephone;

    @JsonProperty("owners")
    private @Valid List<OwnerDto> owners = null;

    @JsonProperty("address")
    private AddressDto address;

    public DayCareDto name(String name) {
        this.name = name;
        return this;
    }

    @Schema(
            name = "name",
            required = false
    )
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayCareDto telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    @Schema(
            name = "telephone",
            required = false
    )
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public DayCareDto owners(List<OwnerDto> owners) {
        this.owners = owners;
        return this;
    }

    public DayCareDto addOwnersItem(OwnerDto ownersItem) {
        if (this.owners == null) {
            this.owners = new ArrayList();
        }

        this.owners.add(ownersItem);
        return this;
    }

    @Schema(
            name = "owners",
            required = false
    )
    public @Valid List<OwnerDto> getOwners() {
        return this.owners;
    }

    public void setOwners(List<OwnerDto> owners) {
        this.owners = owners;
    }

    public DayCareDto address(AddressDto address) {
        this.address = address;
        return this;
    }

    @Schema(
            name = "address",
            required = false
    )
    public @Valid AddressDto getAddress() {
        return this.address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}

package com.skyhigh.daycareapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Schema(name = "DayCareDto", description = "Day care DTO")
@Builder
public class DayCareDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("website")
    private String website;
    @JsonProperty("withOwnPortal")
    private Boolean withOwnPortal;
    @JsonProperty("owners")
    private @Valid List<OwnerDto> owners = null;
    @JsonProperty("address")
    private AddressDto address;

    public DayCareDto id(Long id) {
        this.id = id;
        return this;
    }

    @Schema(
            name = "id",
            required = false
    )
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public DayCareDto website(String website) {
        this.website = website;
        return this;
    }

    @Schema(
            name = "website",
            required = false
    )
    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public DayCareDto withOwnPortal(Boolean withOwnPortal) {
        this.withOwnPortal = withOwnPortal;
        return this;
    }

    @Schema(
            name = "withOwnPortal",
            required = false
    )
    public Boolean getWithOwnPortal() {
        return this.withOwnPortal;
    }

    public void setWithOwnPortal(Boolean withOwnPortal) {
        this.withOwnPortal = withOwnPortal;
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            DayCareDto dayCareDto = (DayCareDto)o;
            return Objects.equals(this.id, dayCareDto.id) && Objects.equals(this.name, dayCareDto.name) && Objects.equals(this.telephone, dayCareDto.telephone) && Objects.equals(this.website, dayCareDto.website) && Objects.equals(this.withOwnPortal, dayCareDto.withOwnPortal) && Objects.equals(this.owners, dayCareDto.owners) && Objects.equals(this.address, dayCareDto.address);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.telephone, this.website, this.withOwnPortal, this.owners, this.address});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DayCareDto {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    telephone: ").append(this.toIndentedString(this.telephone)).append("\n");
        sb.append("    website: ").append(this.toIndentedString(this.website)).append("\n");
        sb.append("    withOwnPortal: ").append(this.toIndentedString(this.withOwnPortal)).append("\n");
        sb.append("    owners: ").append(this.toIndentedString(this.owners)).append("\n");
        sb.append("    address: ").append(this.toIndentedString(this.address)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
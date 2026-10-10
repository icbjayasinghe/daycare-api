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

    @JsonProperty("owners")
    @Valid
    private List<OwnerDto> owners = null;

    @JsonProperty("address")
    private AddressDto address;

    public DayCareDto id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */

    @Schema(name = "id", required = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayCareDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */

    @Schema(name = "name", required = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayCareDto telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    /**
     * Get telephone
     * @return telephone
     */

    @Schema(name = "telephone", required = false)
    public String getTelephone() {
        return telephone;
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
            this.owners = new ArrayList<>();
        }
        this.owners.add(ownersItem);
        return this;
    }

    /**
     * Get owners
     * @return owners
     */
    @Valid
    @Schema(name = "owners", required = false)
    public List<OwnerDto> getOwners() {
        return owners;
    }

    public void setOwners(List<OwnerDto> owners) {
        this.owners = owners;
    }

    public DayCareDto address(AddressDto address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     */
    @Valid
    @Schema(name = "address", required = false)
    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DayCareDto dayCareDto = (DayCareDto) o;
        return Objects.equals(this.id, dayCareDto.id) &&
                Objects.equals(this.name, dayCareDto.name) &&
                Objects.equals(this.telephone, dayCareDto.telephone) &&
                Objects.equals(this.owners, dayCareDto.owners) &&
                Objects.equals(this.address, dayCareDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, telephone, owners, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DayCareDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
        sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

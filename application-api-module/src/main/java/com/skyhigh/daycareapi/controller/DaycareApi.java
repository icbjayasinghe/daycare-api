package com.skyhigh.daycareapi.controller;

import com.skyhigh.daycareapi.model.dto.DaycareLogoDto;
import com.skyhigh.domainmodule.model.constants.DaycareStatus;
import com.skyhigh.daycareapi.model.dto.DayCareDto;
import com.skyhigh.daycareapi.model.dto.DaycareDashboardDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.*;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T19:12:13.568372-03:00[America/Halifax]")
@Validated
@Tag(name = "daycare", description = "Daycare operations")
public interface DaycareApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /daycare : Create new daycare
     * This can be done by admin only
     *
     * @param dayCareDto Created daycare object (required)
     * @return Successful operation (status code 201)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "createDayCare",
            summary = "Create new daycare",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "201", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/daycare",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    default ResponseEntity<DayCareDto> createDayCare(
            @Parameter(name = "DayCareDto", description = "Created daycare object", required = true) @Valid @RequestBody DayCareDto dayCareDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /daycare/{id} : Delete daycare by id
     * This can be done only by admin after receiving a written request from the daycare owner
     *
     * @param id Numeric ID of the daycare to delete (required)
     * @return Successful operation (status code 200)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "deleteDayCare",
            summary = "Delete daycare by id",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/daycare/{id}",
            produces = { "application/json" }
    )
    default ResponseEntity<DayCareDto> deleteDayCare(
            @Parameter(name = "id", description = "Numeric ID of the daycare to delete", required = true) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /daycare/{daycareId}/logo : Delete daycare logo
     *
     * @param daycareId  (required)
     * @return Logo deleted successfully (status code 204)
     *         or User is not authorized to manage this daycare (status code 403)
     *         or Daycare or logo not found (status code 404)
     */
    @Operation(
            operationId = "deleteDaycareLogo",
            summary = "Delete daycare logo",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "204", description = "Logo deleted successfully"),
                    @ApiResponse(responseCode = "403", description = "User is not authorized to manage this daycare"),
                    @ApiResponse(responseCode = "404", description = "Daycare or logo not found")
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/daycare/{daycareId}/logo"
    )
    default ResponseEntity<Void> deleteDaycareLogo(
            @Parameter(name = "daycareId", description = "", required = true) @PathVariable("daycareId") Long daycareId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /daycare : Edit daycare
     * This can be done by admin or Daycare owner
     *
     * @param dayCareDto Created daycare object (required)
     * @return Successful operation (status code 200)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "editDayCare",
            summary = "Edit daycare",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            },
            security = {
                    @SecurityRequirement(name = "bearerAuth")
            }
    )
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/daycare",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    default ResponseEntity<DayCareDto> editDayCare(
            @Parameter(name = "DayCareDto", description = "Created daycare object", required = true) @Valid @RequestBody DayCareDto dayCareDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /daycare/{id} : Get daycare by id
     * This can be done by any user
     *
     * @param id Numeric ID of the daycare to delete (required)
     * @return Successful operation (status code 200)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "getDayCare",
            summary = "Get daycare by id",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/daycare/{id}",
            produces = { "application/json" }
    )
    default ResponseEntity<DayCareDto> getDayCare(
            @Parameter(name = "id", description = "Numeric ID of the daycare to delete", required = true) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /daycare/byOwner/{email} : Get daycare by owner
     * This can be done by owner
     *
     * @param email Owner of the daycare (required)
     * @return Successful operation (status code 200)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "getDayCareByEmail",
            summary = "Get daycare by owner",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/daycare/byOwner/{email}",
            produces = { "application/json" }
    )
    default ResponseEntity<DayCareDto> getDayCareByEmail(
            @Parameter(name = "email", description = "Owner of the daycare", required = true) @PathVariable("email") String email
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /daycare/{email}/dashboard : Get daycare provider dashboard
     * Retrieve dashboard statistics and recent applications for a daycare.
     *
     * @param email Unique identifier of the daycare (required)
     * @return Dashboard retrieved successfully (status code 200)
     *         or Unauthorized (status code 401)
     *         or Access denied (status code 403)
     *         or Daycare not found (status code 404)
     *         or Internal server error (status code 500)
     */
    @Operation(
            operationId = "getDaycareDashboard",
            summary = "Get daycare provider dashboard",
            tags = { "Daycare Dashboard" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dashboard retrieved successfully", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DaycareDashboardDto.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Unauthorized"),
                    @ApiResponse(responseCode = "403", description = "Access denied"),
                    @ApiResponse(responseCode = "404", description = "Daycare not found"),
                    @ApiResponse(responseCode = "500", description = "Internal server error")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/daycare/{email}/dashboard",
            produces = { "application/json" }
    )
    default ResponseEntity<DaycareDashboardDto> getDaycareDashboard(
            @Parameter(name = "email", description = "Unique identifier of the daycare", required = true) @PathVariable("email") String email
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"daycareId\" : 101, \"totalCapacity\" : 25, \"availableSpaces\" : 7, \"recentApplications\" : [ { \"dayCare\" : { \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }, \"id\" : 1, \"appliedAt\" : \"2000-01-23T04:56:07.000+00:00\", \"child\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"dob\" : \"2000-01-23\", \"id\" : 1 } }, { \"dayCare\" : { \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }, \"id\" : 1, \"appliedAt\" : \"2000-01-23T04:56:07.000+00:00\", \"child\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"dob\" : \"2000-01-23\", \"id\" : 1 } } ], \"occupancyRate\" : 72.0, \"enrolledChildren\" : 18, \"applications\" : { \"approved\" : 18, \"rejected\" : 2, \"pending\" : 5 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /daycare/{daycareId}/logo : Get daycare logo
     *
     * @param daycareId  (required)
     * @return Logo information (status code 200)
     *         or Logo not found (status code 404)
     */
    @Operation(
            operationId = "getDaycareLogo",
            summary = "Get daycare logo",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Logo information", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DaycareLogoDto.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Logo not found")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/daycare/{daycareId}/logo",
            produces = { "application/json" }
    )
    default ResponseEntity<DaycareLogoDto> getDaycareLogo(
            @Parameter(name = "daycareId", description = "", required = true) @PathVariable("daycareId") Long daycareId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"daycareId\" : 0, \"logoUrl\" : \"https://cdn.example.com/daycares/101/logo.png\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /daycare : Get daycare list
     * This can be done by any user
     *
     * @param keyword Search keyword (searches name, description, etc.) (optional)
     * @param latitude Latitude of the center point (optional)
     * @param longitude Longitude of the center point (optional)
     * @param radius Search radius in kilometers from the center point (optional, default to 10)
     * @param status Search by status (optional)
     * @return Successful operation (status code 200)
     *         or Operation failed (status code 400)
     */
    @Operation(
            operationId = "listDayCares",
            summary = "Get daycare list",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/daycare",
            produces = { "application/json" }
    )
    default ResponseEntity<List<DayCareDto>> listDayCares(
            @Parameter(name = "keyword", description = "Search keyword (searches name, description, etc.)") @Valid @RequestParam(value = "keyword", required = false) String keyword,
            @Parameter(name = "latitude", description = "Latitude of the center point") @Valid @RequestParam(value = "latitude", required = false) Float latitude,
            @Parameter(name = "longitude", description = "Longitude of the center point") @Valid @RequestParam(value = "longitude", required = false) Float longitude,
            @Parameter(name = "radius", description = "Search radius in kilometers from the center point") @Valid @RequestParam(value = "radius", required = false, defaultValue = "10") Float radius,
            @Parameter(name = "status", description = "Search by status") @Valid @RequestParam(value = "status", required = false) DaycareStatus status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"website\", \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"locationCoordinates\" : \"locationCoordinates\", \"apartment\" : \"apartment\" }, \"withOwnPortal\" : true, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ], \"id\" : 0, \"config\" : { \"configId\" : 101, \"totalCapacity\" : 5, \"hourlyCharge\" : 18 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /daycare/{daycareId}/logo : Upload or replace daycare logo
     *
     * @param daycareId  (required)
     * @param file Daycare logo image (PNG, JPG or WEBP) (required)
     * @return Logo uploaded successfully (status code 200)
     *         or Invalid image file (status code 400)
     *         or User is not authorized to manage this daycare (status code 403)
     *         or Daycare not found (status code 404)
     */
    @Operation(
            operationId = "uploadDaycareLogo",
            summary = "Upload or replace daycare logo",
            tags = { "Daycare" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Logo uploaded successfully", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DaycareLogoDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid image file"),
                    @ApiResponse(responseCode = "403", description = "User is not authorized to manage this daycare"),
                    @ApiResponse(responseCode = "404", description = "Daycare not found")
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/daycare/{daycareId}/logo",
            produces = { "application/json" },
            consumes = { "multipart/form-data" }
    )
    default ResponseEntity<DaycareLogoDto> uploadDaycareLogo(
            @Parameter(name = "daycareId", description = "", required = true) @PathVariable("daycareId") Long daycareId,
            @Parameter(name = "file", description = "Daycare logo image (PNG, JPG or WEBP)", required = true) @RequestPart(value = "file", required = true) MultipartFile file
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"daycareId\" : 0, \"logoUrl\" : \"https://cdn.example.com/daycares/101/logo.png\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}



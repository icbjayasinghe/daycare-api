package com.skyhigh.daycareapi.controller;

import com.skyhigh.daycareapi.model.dto.DayCareDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.util.*;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-06-16T05:59:37.895280-03:00[America/Halifax]")
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
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"apartment\" : \"apartment\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
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
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"apartment\" : \"apartment\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
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
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"apartment\" : \"apartment\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
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
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"apartment\" : \"apartment\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
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
            @Parameter(name = "radius", description = "Search radius in kilometers from the center point") @Valid @RequestParam(value = "radius", required = false, defaultValue = "10") Float radius
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"address\" : \"address\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"apartment\" : \"apartment\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}



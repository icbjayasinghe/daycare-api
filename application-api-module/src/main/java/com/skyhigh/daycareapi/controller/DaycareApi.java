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

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.util.*;

@Validated
@Tag(name = "daycare", description = "Daycare operations")
public interface DaycareApi {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Operation(
            operationId = "createDayCare",
            summary = "Create new daycare",
            tags = {"Daycare"},
            responses = {
                    @ApiResponse(responseCode = "201", description = "Successful operation", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = {RequestMethod.POST},
            value = {"/daycare"},
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<DayCareDto> createDayCare(@Parameter(name = "DayCareDto",description = "Created daycare object",required = true) @RequestBody @Valid DayCareDto dayCareDto) {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"state\" : \"state\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "deleteDayCare",
            summary = "Delete daycare by id",
            tags = {"Daycare"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation",
                        content = {@Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = {RequestMethod.DELETE},
            value = {"/daycare/{id}"},
            produces = {"application/json"}
    )
    default ResponseEntity<DayCareDto> deleteDayCare(@Parameter(name = "id",description = "Numeric ID of the daycare to delete",required = true) @PathVariable("id") Integer id) {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"state\" : \"state\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "editDayCare",
            summary = "Edit daycare",
            tags = {"Daycare"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = {RequestMethod.PUT},
            value = {"/daycare"},
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<DayCareDto> editDayCare(@Parameter(name = "DayCareDto",description = "Created daycare object",required = true) @RequestBody @Valid DayCareDto dayCareDto) {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"state\" : \"state\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "getDayCare",
            summary = "Get daycare by id",
            tags = {"Daycare"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/daycare/{id}"},
            produces = {"application/json"}
    )
    default ResponseEntity<DayCareDto> getDayCare(@Parameter(name = "id",description = "Numeric ID of the daycare to delete",required = true) @PathVariable("id") Integer id) {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"state\" : \"state\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "listDayCares",
            summary = "Get daycare list",
            tags = {"Daycare"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = DayCareDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Operation failed")
            }
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/daycare"},
            produces = {"application/json"}
    )
    default ResponseEntity<DayCareDto> listDayCares(@Parameter(name = "keyword",description = "Search keyword (searches name, description, etc.)") @RequestParam(value = "keyword",required = false) @Valid String keyword, @Parameter(name = "latitude",description = "Latitude of the center point") @RequestParam(value = "latitude",required = false) @DecimalMin("-90") @DecimalMax("90") @Valid Float latitude, @Parameter(name = "longitude",description = "Longitude of the center point") @RequestParam(value = "longitude",required = false) @DecimalMin("-180") @DecimalMax("180") @Valid Float longitude, @Parameter(name = "radius",description = "Search radius in kilometers from the center point") @RequestParam(value = "radius",required = false,defaultValue = "10") @DecimalMin("0.1") @DecimalMax("100") @Valid Float radius) {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"state\" : \"state\" }, \"name\" : \"name\", \"telephone\" : \"telephone\", \"owners\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"email\" : \"email\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }
}

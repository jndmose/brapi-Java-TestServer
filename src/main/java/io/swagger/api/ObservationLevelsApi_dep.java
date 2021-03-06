/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12-1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ObservationLevelsResponse;
import io.swagger.annotations.*;

import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-04T21:50:05.517Z")

@Api(value = "observationLevels", description = "the observationLevels API")
public interface ObservationLevelsApi_dep {

    @ApiOperation(value = "<strong>Deprecated</strong> List observation levels", nickname = "observationLevelsGet", notes = " Call to retrieve the list of supported observation levels. Observation levels indicate the granularity level at which the measurements are taken. The values are used to supply the `observationLevel` parameter in the observation unit details call. ", response = ObservationLevelsResponse.class, tags={ "Observations","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationLevelsResponse.class) })
    @RequestMapping(value = "/observationLevels",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ObservationLevelsResponse> observationLevelsGet(@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page) throws BrAPIServerException;

}

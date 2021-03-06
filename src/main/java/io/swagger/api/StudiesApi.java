/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.GermplasmSummaryListResponse;
import io.swagger.model.NewObservationDbIdsResponse;
import io.swagger.model.NewObservationUnitDbIdsResponse;
import io.swagger.model.NewObservationUnitRequest;
import io.swagger.model.NewObservationsRequest;
import io.swagger.model.NewObservationsRequestWrapperDeprecated;
import io.swagger.model.NewObservationsTableRequest;
import io.swagger.model.ObservationUnitPositionsResponse;
import io.swagger.model.ObservationUnitsResponse1;
import io.swagger.model.ObservationsResponse;
import io.swagger.model.StudiesResponse;
import io.swagger.model.StudyLayoutRequest;
import io.swagger.model.StudyObservationVariablesResponse;
import io.swagger.model.StudyResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T14:32:54.779-05:00[America/New_York]")

@Api(value = "studies", description = "the studies API")
public interface StudiesApi {

    @ApiOperation(value = "Get the Studies", nickname = "studiesGet", notes = "Get list of studies  Implementation Notes  StartDate and endDate should be ISO8601 format for dates  See Search Services for additional implementation details.", response = StudiesResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StudiesResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/studies",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<StudiesResponse> studiesGet(@ApiParam(value = "Common name for the crop associated with this study") @Valid @RequestParam(value = "commonCropName", required = false) String commonCropName,@ApiParam(value = "DEPRECATED in v1.3 - see \"studyTypeDbId\"") @Valid @RequestParam(value = "studyType", required = false) String studyType,@ApiParam(value = "Filter based on study type unique identifier") @Valid @RequestParam(value = "studyTypeDbId", required = false) String studyTypeDbId,@ApiParam(value = "Program filter to only return studies associated with given program id.") @Valid @RequestParam(value = "programDbId", required = false) String programDbId,@ApiParam(value = "Filter by location") @Valid @RequestParam(value = "locationDbId", required = false) String locationDbId,@ApiParam(value = "Filter by season or year") @Valid @RequestParam(value = "seasonDbId", required = false) String seasonDbId,@ApiParam(value = "Filter by trial") @Valid @RequestParam(value = "trialDbId", required = false) String trialDbId,@ApiParam(value = "Filter by study DbId") @Valid @RequestParam(value = "studyDbId", required = false) String studyDbId,@ApiParam(value = "DEPRECATED in v1.3 - see /search/studies") @Valid @RequestParam(value = "germplasmDbIds", required = false) ArrayList<String> germplasmDbIds,@ApiParam(value = "DEPRECATED in v1.3 - see /search/studies") @Valid @RequestParam(value = "observationVariableDbIds", required = false) ArrayList<String> observationVariableDbIds,@ApiParam(value = "Filter active status true/false.") @Valid @RequestParam(value = "active", required = false) Boolean active,@ApiParam(value = "Name of the field to sort by.", allowableValues = "studyDbId, trialDbId, programDbId, locationDbId, seasonDbId, studyTypeDbId, studyName, studyLocation, programName") @Valid @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Sort order direction. Ascending/Descending.", allowableValues = "asc, ASC, desc, DESC") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Germplasm associated with a specific Study", nickname = "studiesStudyDbIdGermplasmGet", notes = "Get the available Germplasm which are associated with this study", response = GermplasmSummaryListResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Germplasm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GermplasmSummaryListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/germplasm",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GermplasmSummaryListResponse> studiesStudyDbIdGermplasmGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the details for a specific Study", nickname = "studiesStudyDbIdGet", notes = "Retrieve the information of the study required for field data collection  An additionalInfo field was added to provide a controlled vocabulary for less common data fields.  Linked data  - Observation Variables: ```/brapi/v1/studies/{studyDbId}/observationvariables```   - Germplasm: ```/brapi/v1/studies/{studyDbId}/germplasm```   - Observation Units: ```/brapi/v1/studies/{studyDbId}/observationunits```   - Layout: ```brapi/v1/studies/{studyDbId}/layout```", response = StudyResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StudyResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<StudyResponse> studiesStudyDbIdGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the plot layout details for a specific Study", nickname = "studiesStudyDbIdLayoutGet", notes = "DEPRECATED in v1.3 - see `GET /studies/{studyDbId}/layouts` (pluralized)", response = ObservationUnitPositionsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationUnitPositionsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/layout",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ObservationUnitPositionsResponse> studiesStudyDbIdLayoutGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Update an existing Study with new layout details", nickname = "studiesStudyDbIdLayoutPut", notes = "DEPRECATED in v1.3 - see `PUT /studies/{studyDbId}/layouts` (pluralized)", response = ObservationUnitPositionsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationUnitPositionsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/layout",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ObservationUnitPositionsResponse> studiesStudyDbIdLayoutPut(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "The request body for updateing a study layout"  )  @Valid @RequestBody StudyLayoutRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the plot layout details for a specific Study", nickname = "studiesStudyDbIdLayoutsGet", notes = "Retrive the layout details for a study. Returns an array of observation unit position data which describes where each unit and germplasm is located within the study layout  Retrieve the plot layout of the study with id {id}.  For each observationUnit within a study, return the `block`, `replicate`, and `entryType` values as well as the `X` and `Y` coordinates. `entryType` can be \"check\", \"test\", or \"filler\".  Also return some human readable meta data about the observationUnit and germplasm.", response = ObservationUnitPositionsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationUnitPositionsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/layouts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ObservationUnitPositionsResponse> studiesStudyDbIdLayoutsGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Update an existing Study with new layout details", nickname = "studiesStudyDbIdLayoutsPut", notes = "Modify a study layout  Update the layout data for a set of observation units within a study. Each layout object is a subset of fields within an observationUnit, so it doesnt make sense to create a new layout object by itself.  Implementation Notes:  + If any of the fields in the request object is missing, that piece of data will not be updated.   + If an observationUnitDbId can not be found within the given study, an error will be returned.   + `entryType` can have the values \"check\", \"test\", or \"filler\".   + The response should match the structure of the response from `GET studies/{studyDbId}/layout`, but it should only contain the layout objects which have been updated by the PUT request. Also, pagination is not available in the response.", response = ObservationUnitPositionsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationUnitPositionsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/layouts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ObservationUnitPositionsResponse> studiesStudyDbIdLayoutsPut(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "The request body for updateing a study layout"  )  @Valid @RequestBody StudyLayoutRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Deprecated Retrieve study observation variables", nickname = "studiesStudyDbIdObservationVariablesGet", notes = "   test-server.brapi.org/brapi/v1/studies/{studyDbId}/observationVariables", response = StudyObservationVariablesResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observation Variables","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StudyObservationVariablesResponse.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationVariables",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<StudyObservationVariablesResponse> studiesStudyDbIdObservationVariablesGet(@ApiParam(value = "string database unique identifier",required=true) @PathVariable("studyDbId") String studyDbId) throws BrAPIServerException;


    @ApiOperation(value = "Get the Observations associated with a specific Study", nickname = "studiesStudyDbIdObservationsGet", notes = "Retrieve all observations where there are measurements for the given observation variables.  observationTimestamp should be ISO8601 format with timezone -> YYYY-MM-DDThh:mm:ss+hhmm", response = ObservationsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ObservationsResponse> studiesStudyDbIdObservationsGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "Numeric `id` of that variable (combination of trait, unit and method)") @Valid @RequestParam(value = "observationVariableDbIds", required = false) ArrayList<String> observationVariableDbIds,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Update the Observations of a specific Study", nickname = "studiesStudyDbIdObservationsPut", notes = "Implementation Guidelines:   + If an `observationDbId` is \"null\" or an empty string in the request, a NEW observation should be created for the given study and observationUnit   + If an `observationDbId` is populated but not found in the database, a NEW observation should be created for the given study and observationUnit AND an NEW `observationDbId` should be assigned to it. A warning should be returned to the client.   + If an `observationDbId` is populated and found in the database, but the existing entry is not associated with the given study or observationUnit, a NEW observation should be created for the given study and observationUnit AND an NEW `observationDbId` should be assigned to it. A warning should be returned to the client.   + If an `observationDbId` is populated and found in the database and is associated with the given study and observationUnit, then it should be updated with the new data given.", response = NewObservationDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observations",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<NewObservationDbIdsResponse> studiesStudyDbIdObservationsPut(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = ""  )  @Valid @RequestBody NewObservationsRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Observation Units associated with a specific Study", nickname = "studiesStudyDbIdObservationunitsGet", notes = "The main API call for field data collection, to retrieve all the observation units within a study.", response = ObservationUnitsResponse1.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObservationUnitsResponse1.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationunits",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ObservationUnitsResponse1> studiesStudyDbIdObservationunitsGet(@ApiParam(value = "The study these observation units are related to.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "The granularity level of observation units. Either `plotNumber` or `plantNumber` fields will be relavant depending on whether granularity is plot or plant respectively.") @Valid @RequestParam(value = "observationLevel", required = false) String observationLevel,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Deprecated Save Observation Unit Phenotypes", nickname = "studiesStudyDbIdObservationunitsPost", notes = "This call has been deprecated in V1.1. Use instead: \"PUT /studies/{studyDbId}/observationunits\" and \"PUT /studies/{studyDbId}/observationunits/zip\"", response = NewObservationUnitDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationUnitDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationunits",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<NewObservationUnitDbIdsResponse> studiesStudyDbIdObservationunitsPost(@ApiParam(value = "The study these observation units are related to.",required=true) @PathVariable("studyDbId") String studyDbId,@NotNull @ApiParam(value = "(default is JSON, but can be zip) In case where JSON data is zipped for faster transfer speed (as in the case of the IRRI handheld implementation), the zipped JSON file will be listed in datafiles. The zipped file contains a JSON file with the same structure as the BrAPI call.", required = true) @Valid @RequestParam(value = "format", required = true) String format,@ApiParam(value = ""  )  @Valid @RequestBody NewObservationsRequestWrapperDeprecated body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Update the Observation Units for a specific Study", nickname = "studiesStudyDbIdObservationunitsPut", notes = "Use this call for uploading new Observations as JSON to a system.  Note: If ''observationUnitDbId'' or ''observationDbId'' is populated, they should be considered updates to existing records.  If an existing record of that DbId is not found, the document should be treated as new records and assigned new DbIds.  If ''observationUnitDbId'' or ''observationDbId'' is un-populated (empty string or null) the document should be treated as new records and assigned new DbIds.", response = NewObservationUnitDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationUnitDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationunits",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<NewObservationUnitDbIdsResponse> studiesStudyDbIdObservationunitsPut(@ApiParam(value = "The study these observation units are related to.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = ""  )  @Valid @RequestBody ArrayList<NewObservationUnitRequest> body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Use this call for uploading new Observations as a Batched Zip File to a system.", nickname = "studiesStudyDbIdObservationunitsZipPost", notes = "If ''observationUnitDbId'' or ''observationDbId'' is populated, they should be considered updates to existing records.   If an existing record of that DbId is not found, the document should be treated as new records and assigned new DbIds.   If ''observationUnitDbId'' or ''observationDbId'' is un-populated (empty string or null) the document should be treated as new records and assigned new DbIds.", response = NewObservationUnitDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Observations","Studies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationUnitDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationunits/zip",
        produces = { "application/json" }, 
        consumes = { "application/zip" },
        method = RequestMethod.POST)
    ResponseEntity<NewObservationUnitDbIdsResponse> studiesStudyDbIdObservationunitsZipPost(@ApiParam(value = "The study these observation units are related to.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = ""  )  @Valid @RequestBody Object body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Observation Variables for a specific Study", nickname = "studiesStudyDbIdObservationvariablesGet", notes = "List all the observation variables measured in the study.  Refer to the data type definition of variables in `/Specification/ObservationVariables/README.md`.", response = StudyObservationVariablesResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observation Variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StudyObservationVariablesResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/observationvariables",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<StudyObservationVariablesResponse> studiesStudyDbIdObservationvariablesGet(@ApiParam(value = "string database unique identifier",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Observations for a specific Study in a table format", nickname = "studiesStudyDbIdTableGet", notes = "Retrieve the details of the study required for field data collection. Includes actual trait data.", response = String.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/table",
        produces = { "application/csv", "application/json", "application/tsv" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> studiesStudyDbIdTableGet(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = "The format parameter will cause the data to be dumped to a file in the specified format. Currently, tsv and csv are supported.") @Valid @RequestParam(value = "format", required = false) String format,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Submit new Observations in a table format for a specific Study", nickname = "studiesStudyDbIdTablePost", notes = "This call can be used to create new observations in bulk.  Note: If you need to update any existing observation, please use `PUT /studies/{studyDbId}/observations`. This call should only be used to create NEW observations.  Implementation Guidelines:  + All observations submitted through this call should create NEW observation records in the database under the given observation unit.   + Each \"observationUnitDbId\" listed should already exist in the database. If the server can not find a given \"observationUnitDbId\", it should report an error. (see Error Handling)   + The response of this call should be the set of \"observationDbIds\" created from this call, along with the associated \"observationUnitDbId\" and \"observationVariableDbId\" that each observation is associated with.  + Images can optionally be saved using this call by providing a zipped file of all images in the datafiles. The physical zipped file should be transferred as well in the mulit-part form data.", response = NewObservationDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Studies","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/studies/{studyDbId}/table",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<NewObservationDbIdsResponse> studiesStudyDbIdTablePost(@ApiParam(value = "Identifier of the study. Usually a number, could be alphanumeric.",required=true) @PathVariable("studyDbId") String studyDbId,@ApiParam(value = ""  )  @Valid @RequestBody NewObservationsTableRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}

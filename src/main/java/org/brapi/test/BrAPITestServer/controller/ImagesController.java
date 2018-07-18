package org.brapi.test.BrAPITestServer.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.brapi.test.BrAPITestServer.service.CropService;
import org.brapi.test.BrAPITestServer.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.api.CommonCropNamesApi;
import io.swagger.api.CropsApi;
import io.swagger.model.CallsResponse;
import io.swagger.model.CommonCropNamesResponse;
import io.swagger.model.CommonCropNamesResponseResult;
import io.swagger.model.Image;
import io.swagger.model.ImageListResponse;
import io.swagger.model.ImageListResponseResult;
import io.swagger.model.ImageResponse;
import io.swagger.model.Metadata;
import io.swagger.model.NewImageDbIdsResponse;
import io.swagger.model.NewImageDbIdsResponseResult;
import io.swagger.model.ImageRequest;

@RestController
public class ImagesController extends BrAPIController {
	ImageService imageService;

	@Autowired
	public ImagesController(ImageService imageService) {
		this.imageService = imageService;
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ImageResponse.class) })
	@RequestMapping(value = "/images/{imageDbId}", produces = { "application/json" }, method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<ImageResponse> imagesImageDbIdGet(@PathVariable("imageDbId") String imageDbId) {

		Metadata metaData = generateEmptyMetadata();
		Image result = imageService.getImage(imageDbId);

		ImageResponse response = new ImageResponse();
		response.setMetadata(metaData);
		response.setResult(result);

		return new ResponseEntity<ImageResponse>(response, HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ImageResponse.class) })
	@RequestMapping(value = "/images", produces = { "application/json" }, method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<ImageListResponse> imagesGet(
			@RequestParam(value = "observationUnitDbId", required = false) String observationUnitDbId,
			@RequestParam(value = "observationDbId", required = false) String observationDbId,
			@RequestParam(value = "descriptiveOntologyTerm", required = false) String descriptiveOntologyTerm,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {

		Metadata metaData = generateMetaDataTemplate(page, pageSize);
		List<Image> data = imageService.findImages(observationUnitDbId, observationDbId, descriptiveOntologyTerm, metaData);

		ImageListResponseResult result = new ImageListResponseResult();
		result.setData(data);
		ImageListResponse response = new ImageListResponse();
		response.setMetadata(metaData);
		response.setResult(result);

		return new ResponseEntity<ImageListResponse>(response, HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = NewImageDbIdsResponse.class) })
	@RequestMapping(value = "/images", produces = { "application/json" }, method = RequestMethod.PUT)
	@CrossOrigin
	public ResponseEntity<NewImageDbIdsResponse> imagesPut(@RequestBody ImageRequest imageMetadata) {

		Metadata metaData = generateEmptyMetadata();
		NewImageDbIdsResponseResult result = imageService.saveImageMetaData(imageMetadata);

		NewImageDbIdsResponse response = new NewImageDbIdsResponse();
		response.setMetadata(metaData);
		response.setResult(result);

		return new ResponseEntity<NewImageDbIdsResponse>(response, HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ImageResponse.class) })
	@RequestMapping(value = "/images/{imageDbId}/imagedata", method = RequestMethod.PUT)
	@CrossOrigin
	public ResponseEntity<NewImageDbIdsResponse> imagesImageDbIdImageDataPut(@PathVariable("imageDbId") String imageDbId, @RequestBody byte[] imageData) {

		Metadata metaData = generateEmptyMetadata();
		NewImageDbIdsResponseResult result = imageService.saveImageData(imageDbId, imageData);

		NewImageDbIdsResponse response = new NewImageDbIdsResponse();
		response.setMetadata(metaData);
		response.setResult(result);

		return new ResponseEntity<NewImageDbIdsResponse>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/images/{imageDbId}/{imageName}", method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<NewImageDbIdsResponse> imagesImageDbIdImageDataGet(HttpServletResponse response, 
			@PathVariable("imageDbId") String imageDbId, @PathVariable("imageName") String imageName) {
	    byte[] bytes = imageService.getImageData(imageDbId);
	    Image image = imageService.getImage(imageDbId);
	    
	    try (InputStream inputStream = new ByteArrayInputStream(bytes)) {
	        StreamUtils.copy(inputStream, response.getOutputStream());
	        response.setContentType(image.getImageType());
	    } catch (IOException e) {
	        // handle
	    }

		return new ResponseEntity(HttpStatus.OK);
	}
}

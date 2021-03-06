package org.brapi.test.BrAPITestServer.controller;

import java.util.List;

import javax.validation.Valid;

import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;
import org.brapi.test.BrAPITestServer.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.api.ImagesApi;
import io.swagger.model.Image;
import io.swagger.model.ImageResponse;
import io.swagger.model.ImagesResponse;
import io.swagger.model.ImagesResponseResult;
import io.swagger.model.Metadata;
import io.swagger.model.NewImageRequest;

@RestController
public class ImagesController extends BrAPIController implements ImagesApi {

	ImageService imageService;

	@Autowired
	public ImagesController(ImageService imageService) {
		this.imageService = imageService;
	}

	@CrossOrigin
	@Override
	public ResponseEntity<ImagesResponse> imagesGet(@Valid String imageDbId, @Valid String imageName,
			@Valid String observationUnitDbId, @Valid String observationDbId, @Valid String descriptiveOntologyTerm,
			@Valid Integer page, @Valid Integer pageSize, String authorization) throws BrAPIServerException {

		Metadata metadata = generateMetaDataTemplate(page, pageSize);

		List<Image> data = imageService.findImages(imageDbId, imageName, observationUnitDbId, observationDbId,
				descriptiveOntologyTerm, metadata);

		ImagesResponseResult result = new ImagesResponseResult();
		result.setData(data);
		ImagesResponse response = new ImagesResponse();
		response.setMetadata(metadata);
		response.setResult(result);
		return new ResponseEntity<ImagesResponse>(response, HttpStatus.OK);
	}

	@CrossOrigin
	@Override
	public ResponseEntity<ImageResponse> imagesImageDbIdGet(@PathVariable("imageDbId") String imageDbId, String authorization)
			throws BrAPIServerException {
		Image data = imageService.getImage(imageDbId);

		ImageResponse response = new ImageResponse();
		response.setMetadata(generateEmptyMetadata());
		response.setResult(data);
		return new ResponseEntity<ImageResponse>(response, HttpStatus.OK);
	}

	@CrossOrigin
	@PreAuthorize("hasAuthority('ADMIN')")
	@Override
	public ResponseEntity<ImageResponse> imagesImageDbIdImagecontentPut(@PathVariable("imageDbId") String imageDbId, @Valid @RequestBody byte[] imageData,
			String authorization) throws BrAPIServerException {
		Image data = imageService.saveImageData(imageDbId, imageData);

		ImageResponse response = new ImageResponse();
		response.setMetadata(generateEmptyMetadata());
		response.setResult(data);
		return new ResponseEntity<ImageResponse>(response, HttpStatus.OK);
	}

	@CrossOrigin
	@PreAuthorize("hasAuthority('ADMIN')")
	@Override
	public ResponseEntity<ImageResponse> imagesImageDbIdPut(@PathVariable("imageDbId") String imageDbId, @Valid @RequestBody NewImageRequest request,
			String authorization) throws BrAPIServerException {
		Image data = imageService.updateImageMetaData(imageDbId, request);

		ImageResponse response = new ImageResponse();
		response.setMetadata(generateEmptyMetadata());
		response.setResult(data);
		return new ResponseEntity<ImageResponse>(response, HttpStatus.OK);
	}

	@CrossOrigin
	@PreAuthorize("hasAuthority('ADMIN')")
	@Override
	public ResponseEntity<ImageResponse> imagesPost(@Valid @RequestBody NewImageRequest request, String authorization)
			throws BrAPIServerException {
		Image data = imageService.saveImageMetaData(request);

		ImageResponse response = new ImageResponse();
		response.setMetadata(generateEmptyMetadata());
		response.setResult(data);
		return new ResponseEntity<ImageResponse>(response, HttpStatus.OK);
	}

}

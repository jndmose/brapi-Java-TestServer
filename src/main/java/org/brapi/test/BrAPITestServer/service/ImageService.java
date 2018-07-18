package org.brapi.test.BrAPITestServer.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.brapi.test.BrAPITestServer.BaseUrlProperty;
import org.brapi.test.BrAPITestServer.model.entity.ImageEntity;
import org.brapi.test.BrAPITestServer.model.entity.ObservationUnitEntity;
import org.brapi.test.BrAPITestServer.repository.ImageRepository;
import org.brapi.test.BrAPITestServer.repository.ObservationUnitRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UrlPathHelper;

import io.swagger.model.Image;
import io.swagger.model.ImageRequest;
import io.swagger.model.Metadata;
import io.swagger.model.NewImageDbIdsResponseResult;

@Service
public class ImageService {
	
	private ImageRepository imageRepository;
	private ObservationUnitRepository observationUnitRepository;

    @Value("${app.baseurl}")
	private String baseUrlProperty;
	
	public ImageService(ImageRepository imageRepository, ObservationUnitRepository observationUnitRepository) {
		this.imageRepository = imageRepository;
		this.observationUnitRepository = observationUnitRepository;
	}
	
	public Image getImage(String imageDbId) {
		Image image = null;
		
		if(imageDbId != null && !imageDbId.isEmpty()) {
			Optional<ImageEntity> imageOption = imageRepository.findById(imageDbId);
			if(imageOption.isPresent()) {
				image = convertFromEntiy(imageOption.get());
			}
		}
		
		return image;
	}

	public List<Image> findImages(String observationUnitDbId, String observationDbId, String descriptiveOntologyTerm, Metadata metaData) {
		Pageable pageReq = PagingUtility.getPageRequest(metaData);
		
		String obsUnitDbId = "", obsDbId = "", tag = "";
		if(observationUnitDbId != null && !observationUnitDbId.isEmpty()) {
			obsUnitDbId = observationUnitDbId;
		}
		if(observationDbId != null && !observationDbId.isEmpty()) {
			obsDbId = "%" + observationDbId +"%";
		}
		if(descriptiveOntologyTerm != null && !descriptiveOntologyTerm.isEmpty()) {
			tag = "%" + descriptiveOntologyTerm +"%";
		}
		
		Page<ImageEntity> imagePage = imageRepository.findBySearch(obsUnitDbId, obsDbId, tag, pageReq);
		PagingUtility.calculateMetaData(metaData, imagePage);
		
		List<Image> images = imagePage.map(this::convertFromEntiy).getContent();
		
		return images;
	}
	
	public byte[] getImageData(String imageDbId) {
		byte[] bytes = null;
		if(imageDbId != null && !imageDbId.isEmpty()) {
			Optional<ImageEntity> imageOption = imageRepository.findById(imageDbId);
			if(imageOption.isPresent()) {
				bytes = imageOption.get().getImageData();
			}
		}
		return bytes;
	}
	
	public NewImageDbIdsResponseResult saveImageMetaData(ImageRequest imageMetadata) {
		ImageEntity newEntity;
		
		if(imageMetadata.getImageDbId() != null && !imageMetadata.getImageDbId().isEmpty()) {
			Optional<ImageEntity> imageOption = imageRepository.findById(imageMetadata.getImageDbId());
			if(imageOption.isPresent()) {
				newEntity = imageOption.get();
				updateEntity(newEntity, imageMetadata);
			}else {
				newEntity = new ImageEntity();
				updateEntity(newEntity, imageMetadata);
			}
		}else {
			newEntity = new ImageEntity();
			updateEntity(newEntity, imageMetadata);
		}
		
		ImageEntity saved = imageRepository.save(newEntity);
		
		NewImageDbIdsResponseResult result = new NewImageDbIdsResponseResult();
		result.setImageDbId(saved.getId());
		result.setName(saved.getName());
		
		return result;
	}

	public NewImageDbIdsResponseResult saveImageData(String imageDbId, byte[] imageData) {
		ImageEntity newEntity = null;
		
		if(imageDbId != null && !imageDbId.isEmpty()) {
			Optional<ImageEntity> imageOption = imageRepository.findById(imageDbId);
			if(imageOption.isPresent()) {
				newEntity = imageOption.get();
				newEntity.setImageData(imageData);
				newEntity.setImageURL(constructURL(newEntity) );
			}
		}
		
		NewImageDbIdsResponseResult result = new NewImageDbIdsResponseResult();
		if(newEntity != null) {
			ImageEntity saved = imageRepository.save(newEntity);
		
			result.setImageDbId(saved.getId());
			result.setName(saved.getName());
		}else {
			result.setImageDbId(null);
			result.setName(null);
		}
		
		return result;
	}
	
	private String constructURL(ImageEntity newEntity) {
		String name = "image";
		if(newEntity.getImageFileName() != null && !newEntity.getImageFileName().isEmpty()) {
			name = newEntity.getImageFileName().replaceAll(" ", "_");
		}else {
			if(newEntity.getName() != null && !newEntity.getName().isEmpty()) {
				name = newEntity.getName().replaceAll(" ", "_");			
			}
			if(newEntity.getImageType() != null && !newEntity.getImageType().isEmpty()) {
				name = name + "." + newEntity.getImageType();
			}	
		}
		return baseUrlProperty + "/images/" + newEntity.getId() + "/" + name;
	}

	private void updateEntity(ImageEntity newEntity, ImageRequest imageMetadata) {
		
		if(imageMetadata.getObservationUnitDbId() != null && !imageMetadata.getObservationUnitDbId().isEmpty()) {
			Optional<ObservationUnitEntity> unitOption = this.observationUnitRepository.findById(imageMetadata.getObservationUnitDbId());
			if(unitOption.isPresent()) {
				newEntity.setObservationUnit(unitOption.get());
			}
		}
		
		newEntity.setDescription(imageMetadata.getDescription());
		newEntity.setDescriptiveOntologyTerms(arrayToString(imageMetadata.getDescriptiveOntologyTerms()));
		newEntity.setImageFileName(imageMetadata.getImageFileName());
		newEntity.setImageFileSize(imageMetadata.getImageFileSize());
		newEntity.setImageHeight(imageMetadata.getImageHeight());
		newEntity.setName(imageMetadata.getImageName());
		newEntity.setImageType(imageMetadata.getImageType());
		newEntity.setImageWidth(imageMetadata.getImageWidth());
		newEntity.setObservationDbIds(arrayToString(imageMetadata.getObservationDbIds()));
	}

	private Image convertFromEntiy(ImageEntity entity) {
		Image img = new Image();
		img.setDescription(entity.getDescription());
		img.setDescriptiveOntologyTerms(Arrays.asList(entity.getDescriptiveOntologyTerms().split(",")));
		img.setImageDbId(entity.getId());
		img.setImageFileName(entity.getImageFileName());
		img.setImageFileSize(entity.getImageFileSize());
		img.setImageHeight(entity.getImageHeight());
		img.setImageName(entity.getName());
		img.setImageType(entity.getImageType());
		img.setImageURL(entity.getImageURL());
		img.setImageWidth(entity.getImageWidth());
		img.setObservationDbIds(Arrays.asList(entity.getObservationDbIds().split(",")));
		if(entity.getObservationUnit() != null) {
			img.setObservationUnitDbId(entity.getObservationUnit().getId());
		}
		return img;
	}
	
	private String arrayToString(List<String> list) {
		String str = "";
		if(list != null && !list.isEmpty()) {
			for(String item: list) {
				str = str + item + ",";
			}
		}
		return str;
	}
}

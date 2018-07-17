package io.swagger.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
	@JsonProperty("imageDbId")
	private String imageDbId;

	@JsonProperty("imageName")
	private String imageName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("observationUnitDbId")
	private String observationUnitDbId;

	@JsonProperty("imageURL")
	private String imageURL;

	@JsonProperty("imageFileName")
	private String imageFileName;

	@JsonProperty("imageFileSize")
	private int imageFileSize;

	@JsonProperty("imageWidth")
	private int imageWidth;

	@JsonProperty("imageHeight")
	private int imageHeight;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("descriptiveOntologyTerms")
	private List<String> descriptiveOntologyTerms;

	@JsonProperty("observationDbIds")
	private List<String> observationDbIds;

	public List<String> getDescriptiveOntologyTerms() {
		return descriptiveOntologyTerms;
	}

	public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
	}

	public List<String> getObservationDbIds() {
		return observationDbIds;
	}

	public void setObservationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
	}

	public String getImageDbId() {
		return imageDbId;
	}

	public void setImageDbId(String imageDbId) {
		this.imageDbId = imageDbId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObservationUnitDbId() {
		return observationUnitDbId;
	}

	public void setObservationUnitDbId(String observationUnitDbId) {
		this.observationUnitDbId = observationUnitDbId;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public int getImageFileSize() {
		return imageFileSize;
	}

	public void setImageFileSize(int imageFileSize) {
		this.imageFileSize = imageFileSize;
	}

	public int getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}

	public int getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	
}

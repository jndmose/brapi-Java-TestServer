package org.brapi.test.BrAPITestServer.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class ImageEntity extends BaseEntity{
	@Column
	private byte[] imageData;
	@ManyToOne(cascade=CascadeType.DETACH)
	private ObservationUnitEntity observationUnit;	
	@Column
	private String name;
	@Column
	private String imageFileName;
	@Column
	private String description;
	@Column
	private String imageURL;
	@Column
	private Integer imageFileSize;
	@Column
	private Integer imageHeight;
	@Column
	private Integer imageWidth;
	@Column
	private String imageType;
	@Column
	private String descriptiveOntologyTerms;
	@Column
	private String observationDbIds;
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	public ObservationUnitEntity getObservationUnit() {
		return observationUnit;
	}
	public void setObservationUnit(ObservationUnitEntity observationUnit) {
		this.observationUnit = observationUnit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public Integer getImageFileSize() {
		return imageFileSize;
	}
	public void setImageFileSize(Integer imageFileSize) {
		this.imageFileSize = imageFileSize;
	}
	public Integer getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}
	public Integer getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getDescriptiveOntologyTerms() {
		return descriptiveOntologyTerms;
	}
	public void setDescriptiveOntologyTerms(String descriptiveOntologyTerms) {
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
	}
	public String getObservationDbIds() {
		return observationDbIds;
	}
	public void setObservationDbIds(String observationDbIds) {
		this.observationDbIds = observationDbIds;
	}

}

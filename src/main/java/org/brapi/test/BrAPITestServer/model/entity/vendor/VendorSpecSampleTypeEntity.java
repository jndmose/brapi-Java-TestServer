package org.brapi.test.BrAPITestServer.model.entity.vendor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.brapi.test.BrAPITestServer.model.entity.BaseEntity;

@Entity
@Table(name="vendor_spec_sample_type")
public class VendorSpecSampleTypeEntity extends BaseEntity {
	@Column
	private String vendorSpecStandardRequirementDbId;
	@Column
	private String sampleType;
	public String getVendorSpecStandardRequirementDbId() {
		return vendorSpecStandardRequirementDbId;
	}
	public void setVendorSpecStandardRequirementDbId(String vendorSpecStandardRequirementDbId) {
		this.vendorSpecStandardRequirementDbId = vendorSpecStandardRequirementDbId;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
}

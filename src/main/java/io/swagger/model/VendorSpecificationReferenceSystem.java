package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VendorSpecificationReferenceSystem
 */
@Validated

public class VendorSpecificationReferenceSystem   {
  @JsonProperty("URI")
  private String URI = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referenceSystemName")
  private String referenceSystemName = null;

  public VendorSpecificationReferenceSystem URI(String URI) {
    this.URI = URI;
    return this;
  }

  /**
   * The primary URI for this reference system
   * @return URI
  **/
  @ApiModelProperty(value = "The primary URI for this reference system")


  public String getURI() {
    return URI;
  }

  public void setURI(String URI) {
    this.URI = URI;
  }

  public VendorSpecificationReferenceSystem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * DEPRECATED in v1.3 - Use \"referenceSystemName\"
   * @return name
  **/
  @ApiModelProperty(value = "DEPRECATED in v1.3 - Use \"referenceSystemName\"")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VendorSpecificationReferenceSystem referenceSystemName(String referenceSystemName) {
    this.referenceSystemName = referenceSystemName;
    return this;
  }

  /**
   * The human readable name for this reference system
   * @return referenceSystemName
  **/
  @ApiModelProperty(value = "The human readable name for this reference system")


  public String getReferenceSystemName() {
    return referenceSystemName;
  }

  public void setReferenceSystemName(String referenceSystemName) {
    this.referenceSystemName = referenceSystemName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorSpecificationReferenceSystem vendorSpecificationReferenceSystem = (VendorSpecificationReferenceSystem) o;
    return Objects.equals(this.URI, vendorSpecificationReferenceSystem.URI) &&
        Objects.equals(this.name, vendorSpecificationReferenceSystem.name) &&
        Objects.equals(this.referenceSystemName, vendorSpecificationReferenceSystem.referenceSystemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URI, name, referenceSystemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecificationReferenceSystem {\n");
    
    sb.append("    URI: ").append(toIndentedString(URI)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceSystemName: ").append(toIndentedString(referenceSystemName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


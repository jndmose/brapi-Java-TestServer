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
 * VendorSpecificationPlatformDeliverables
 */
@Validated

public class VendorSpecificationPlatformDeliverables   {
  @JsonProperty("deliverableName")
  private String deliverableName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("name")
  private String name = null;

  public VendorSpecificationPlatformDeliverables deliverableName(String deliverableName) {
    this.deliverableName = deliverableName;
    return this;
  }

  /**
   * Human readable name of a vendor deliverable
   * @return deliverableName
  **/
  @ApiModelProperty(value = "Human readable name of a vendor deliverable")


  public String getDeliverableName() {
    return deliverableName;
  }

  public void setDeliverableName(String deliverableName) {
    this.deliverableName = deliverableName;
  }

  public VendorSpecificationPlatformDeliverables description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VendorSpecificationPlatformDeliverables format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public VendorSpecificationPlatformDeliverables name(String name) {
    this.name = name;
    return this;
  }

  /**
   * DEPRECATED in v1.3 - Use \"deliverableName\"
   * @return name
  **/
  @ApiModelProperty(value = "DEPRECATED in v1.3 - Use \"deliverableName\"")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorSpecificationPlatformDeliverables vendorSpecificationPlatformDeliverables = (VendorSpecificationPlatformDeliverables) o;
    return Objects.equals(this.deliverableName, vendorSpecificationPlatformDeliverables.deliverableName) &&
        Objects.equals(this.description, vendorSpecificationPlatformDeliverables.description) &&
        Objects.equals(this.format, vendorSpecificationPlatformDeliverables.format) &&
        Objects.equals(this.name, vendorSpecificationPlatformDeliverables.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverableName, description, format, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecificationPlatformDeliverables {\n");
    
    sb.append("    deliverableName: ").append(toIndentedString(deliverableName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


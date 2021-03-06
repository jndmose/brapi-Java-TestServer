package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * PedigreeSiblings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T14:32:54.779-05:00[America/New_York]")

public class PedigreeSiblings   {
  @JsonProperty("defaultDisplayName")
  private String defaultDisplayName = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  public PedigreeSiblings defaultDisplayName(String defaultDisplayName) {
    this.defaultDisplayName = defaultDisplayName;
    return this;
  }

  /**
   * Get defaultDisplayName
   * @return defaultDisplayName
  **/
  @ApiModelProperty(value = "")


  public String getDefaultDisplayName() {
    return defaultDisplayName;
  }

  public void setDefaultDisplayName(String defaultDisplayName) {
    this.defaultDisplayName = defaultDisplayName;
  }

  public PedigreeSiblings germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * Get germplasmDbId
   * @return germplasmDbId
  **/
  @ApiModelProperty(value = "")


  public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedigreeSiblings pedigreeSiblings = (PedigreeSiblings) o;
    return Objects.equals(this.defaultDisplayName, pedigreeSiblings.defaultDisplayName) &&
        Objects.equals(this.germplasmDbId, pedigreeSiblings.germplasmDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultDisplayName, germplasmDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedigreeSiblings {\n");
    
    sb.append("    defaultDisplayName: ").append(toIndentedString(defaultDisplayName)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
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


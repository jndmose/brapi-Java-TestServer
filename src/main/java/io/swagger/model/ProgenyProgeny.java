package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProgenyProgeny
 */
@Validated

public class ProgenyProgeny   {
  @JsonProperty("defaultDisplayName")
  private String defaultDisplayName = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  /**
   * Gets or Sets parentType
   */
  public enum ParentTypeEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    SELF("SELF"),
    
    POPULATION("POPULATION");

    private String value;

    ParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ParentTypeEnum fromValue(String text) {
      for (ParentTypeEnum b : ParentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("parentType")
  private ParentTypeEnum parentType = null;

  public ProgenyProgeny defaultDisplayName(String defaultDisplayName) {
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

  public ProgenyProgeny germplasmDbId(String germplasmDbId) {
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

  public ProgenyProgeny parentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Get parentType
   * @return parentType
  **/
  @ApiModelProperty(value = "")


  public ParentTypeEnum getParentType() {
    return parentType;
  }

  public void setParentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgenyProgeny progenyProgeny = (ProgenyProgeny) o;
    return Objects.equals(this.defaultDisplayName, progenyProgeny.defaultDisplayName) &&
        Objects.equals(this.germplasmDbId, progenyProgeny.germplasmDbId) &&
        Objects.equals(this.parentType, progenyProgeny.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultDisplayName, germplasmDbId, parentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgenyProgeny {\n");
    
    sb.append("    defaultDisplayName: ").append(toIndentedString(defaultDisplayName)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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


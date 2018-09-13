package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GermplasmMarkerprofilesList
 */
@Validated

public class GermplasmMarkerprofilesList   {
  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("markerprofileDbIds")
  @Valid
  private List<String> markerprofileDbIds = null;

  public GermplasmMarkerprofilesList germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm within the given database server
   * @return germplasmDbId
  **/
  @ApiModelProperty(value = "The ID which uniquely identifies a germplasm within the given database server")


  public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public GermplasmMarkerprofilesList markerprofileDbIds(List<String> markerprofileDbIds) {
    this.markerprofileDbIds = markerprofileDbIds;
    return this;
  }

  public GermplasmMarkerprofilesList addMarkerprofileDbIdsItem(String markerprofileDbIdsItem) {
    if (this.markerprofileDbIds == null) {
      this.markerprofileDbIds = new ArrayList<String>();
    }
    this.markerprofileDbIds.add(markerprofileDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a marker profile within the given database server
   * @return markerprofileDbIds
  **/
  @ApiModelProperty(value = "The ID which uniquely identifies a marker profile within the given database server")


  public List<String> getMarkerprofileDbIds() {
    return markerprofileDbIds;
  }

  public void setMarkerprofileDbIds(List<String> markerprofileDbIds) {
    this.markerprofileDbIds = markerprofileDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmMarkerprofilesList germplasmMarkerprofilesList = (GermplasmMarkerprofilesList) o;
    return Objects.equals(this.germplasmDbId, germplasmMarkerprofilesList.germplasmDbId) &&
        Objects.equals(this.markerprofileDbIds, germplasmMarkerprofilesList.markerprofileDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbId, markerprofileDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMarkerprofilesList {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    markerprofileDbIds: ").append(toIndentedString(markerprofileDbIds)).append("\n");
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


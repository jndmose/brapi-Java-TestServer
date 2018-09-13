package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MarkerSummaryMap;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MarkersResponseResult
 */
@Validated

public class MarkersResponseResult   {
  @JsonProperty("data")
  @Valid
  private List<MarkerSummaryMap> data = null;

  public MarkersResponseResult data(List<MarkerSummaryMap> data) {
    this.data = data;
    return this;
  }

  public MarkersResponseResult addDataItem(MarkerSummaryMap dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<MarkerSummaryMap>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MarkerSummaryMap> getData() {
    return data;
  }

  public void setData(List<MarkerSummaryMap> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkersResponseResult markersResponseResult = (MarkersResponseResult) o;
    return Objects.equals(this.data, markersResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkersResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


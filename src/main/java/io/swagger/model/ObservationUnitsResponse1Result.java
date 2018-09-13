package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ObservationUnitStudy;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObservationUnitsResponse1Result
 */
@Validated

public class ObservationUnitsResponse1Result   {
  @JsonProperty("data")
  @Valid
  private List<ObservationUnitStudy> data = null;

  public ObservationUnitsResponse1Result data(List<ObservationUnitStudy> data) {
    this.data = data;
    return this;
  }

  public ObservationUnitsResponse1Result addDataItem(ObservationUnitStudy dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ObservationUnitStudy>();
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

  public List<ObservationUnitStudy> getData() {
    return data;
  }

  public void setData(List<ObservationUnitStudy> data) {
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
    ObservationUnitsResponse1Result observationUnitsResponse1Result = (ObservationUnitsResponse1Result) o;
    return Objects.equals(this.data, observationUnitsResponse1Result.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitsResponse1Result {\n");
    
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


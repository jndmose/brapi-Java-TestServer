package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NewObservationDbIdsObservations;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewObservationDbIds
 */
@Validated

public class NewObservationDbIds   {
  @JsonProperty("observations")
  @Valid
  private List<NewObservationDbIdsObservations> observations = null;

  public NewObservationDbIds observations(List<NewObservationDbIdsObservations> observations) {
    this.observations = observations;
    return this;
  }

  public NewObservationDbIds addObservationsItem(NewObservationDbIdsObservations observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<NewObservationDbIdsObservations>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * List of observation references which have been created or updated
   * @return observations
  **/
  @ApiModelProperty(value = "List of observation references which have been created or updated")

  @Valid

  public List<NewObservationDbIdsObservations> getObservations() {
    return observations;
  }

  public void setObservations(List<NewObservationDbIdsObservations> observations) {
    this.observations = observations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewObservationDbIds newObservationDbIds = (NewObservationDbIds) o;
    return Objects.equals(this.observations, newObservationDbIds.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewObservationDbIds {\n");
    
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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


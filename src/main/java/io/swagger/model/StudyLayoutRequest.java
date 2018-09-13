package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StudyLayoutRequestLayout;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudyLayoutRequest
 */
@Validated

public class StudyLayoutRequest   {
  @JsonProperty("layout")
  @Valid
  private List<StudyLayoutRequestLayout> layout = null;

  public StudyLayoutRequest layout(List<StudyLayoutRequestLayout> layout) {
    this.layout = layout;
    return this;
  }

  public StudyLayoutRequest addLayoutItem(StudyLayoutRequestLayout layoutItem) {
    if (this.layout == null) {
      this.layout = new ArrayList<StudyLayoutRequestLayout>();
    }
    this.layout.add(layoutItem);
    return this;
  }

  /**
   * List of observation unit position data entities which need to be updated
   * @return layout
  **/
  @ApiModelProperty(value = "List of observation unit position data entities which need to be updated")

  @Valid

  public List<StudyLayoutRequestLayout> getLayout() {
    return layout;
  }

  public void setLayout(List<StudyLayoutRequestLayout> layout) {
    this.layout = layout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyLayoutRequest studyLayoutRequest = (StudyLayoutRequest) o;
    return Objects.equals(this.layout, studyLayoutRequest.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyLayoutRequest {\n");
    
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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


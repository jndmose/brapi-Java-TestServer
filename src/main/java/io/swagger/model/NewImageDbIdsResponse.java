package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Metadata;
import javax.validation.Valid;

public class NewImageDbIdsResponse   {
  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("result")
  private NewImageDbIdsResponseResult result = null;

  public NewImageDbIdsResponse metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of this response
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata of this response")

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public NewImageDbIdsResponse result(NewImageDbIdsResponseResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NewImageDbIdsResponseResult getResult() {
    return result;
  }

  public void setResult(NewImageDbIdsResponseResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewImageDbIdsResponse newSampleDbId = (NewImageDbIdsResponse) o;
    return Objects.equals(this.metadata, newSampleDbId.metadata) &&
        Objects.equals(this.result, newSampleDbId.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewSampleDbId {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


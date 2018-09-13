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
 * ProgramsSearchRequest
 */
@Validated

public class ProgramsSearchRequest   {
  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("leadPerson")
  private String leadPerson = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objective")
  private String objective = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

  @JsonProperty("programName")
  private String programName = null;

  public ProgramsSearchRequest abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * An abbreviation of a program to search for
   * @return abbreviation
  **/
  @ApiModelProperty(value = "An abbreviation of a program to search for")


  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public ProgramsSearchRequest leadPerson(String leadPerson) {
    this.leadPerson = leadPerson;
    return this;
  }

  /**
   * The name or identifier of the program leader to search for
   * @return leadPerson
  **/
  @ApiModelProperty(value = "The name or identifier of the program leader to search for")


  public String getLeadPerson() {
    return leadPerson;
  }

  public void setLeadPerson(String leadPerson) {
    this.leadPerson = leadPerson;
  }

  public ProgramsSearchRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * DEPRECATED in v1.3 - Use \"programName\"
   * @return name
  **/
  @ApiModelProperty(value = "DEPRECATED in v1.3 - Use \"programName\"")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProgramsSearchRequest objective(String objective) {
    this.objective = objective;
    return this;
  }

  /**
   * A program objective to search for
   * @return objective
  **/
  @ApiModelProperty(value = "A program objective to search for")


  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public ProgramsSearchRequest page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Which page of the \"data\" array to return. The page indexing starts at 0 (page=0 will return the first page). Default is 0.
   * @return page
  **/
  @ApiModelProperty(value = "Which page of the \"data\" array to return. The page indexing starts at 0 (page=0 will return the first page). Default is 0.")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ProgramsSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The maximum number of items to return per page of the \"data\" array. Default is 1000.
   * @return pageSize
  **/
  @ApiModelProperty(value = "The maximum number of items to return per page of the \"data\" array. Default is 1000.")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ProgramsSearchRequest programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

  /**
   * A program identifier to search for
   * @return programDbId
  **/
  @ApiModelProperty(value = "A program identifier to search for")


  public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public ProgramsSearchRequest programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * A name of a program to search for
   * @return programName
  **/
  @ApiModelProperty(value = "A name of a program to search for")


  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramsSearchRequest programsSearchRequest = (ProgramsSearchRequest) o;
    return Objects.equals(this.abbreviation, programsSearchRequest.abbreviation) &&
        Objects.equals(this.leadPerson, programsSearchRequest.leadPerson) &&
        Objects.equals(this.name, programsSearchRequest.name) &&
        Objects.equals(this.objective, programsSearchRequest.objective) &&
        Objects.equals(this.page, programsSearchRequest.page) &&
        Objects.equals(this.pageSize, programsSearchRequest.pageSize) &&
        Objects.equals(this.programDbId, programsSearchRequest.programDbId) &&
        Objects.equals(this.programName, programsSearchRequest.programName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, leadPerson, name, objective, page, pageSize, programDbId, programName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramsSearchRequest {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    leadPerson: ").append(toIndentedString(leadPerson)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
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


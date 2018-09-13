package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ObservationSummary;
import io.swagger.model.ObservationUnitXref;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObservationUnitStudy
 */
@Validated

public class ObservationUnitStudy   {
  @JsonProperty("X")
  private String X = null;

  @JsonProperty("Y")
  private String Y = null;

  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("entryNumber")
  private String entryNumber = null;

  @JsonProperty("entryType")
  private String entryType = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId = null;

  @JsonProperty("observationUnitName")
  private String observationUnitName = null;

  @JsonProperty("observationUnitXref")
  @Valid
  private List<ObservationUnitXref> observationUnitXref = null;

  @JsonProperty("observations")
  @Valid
  private List<ObservationSummary> observations = null;

  @JsonProperty("pedigree")
  private String pedigree = null;

  @JsonProperty("plantNumber")
  private String plantNumber = null;

  @JsonProperty("plotNumber")
  private String plotNumber = null;

  @JsonProperty("positionCoordinateX")
  private String positionCoordinateX = null;

  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   */
  public enum PositionCoordinateXTypeEnum {
    LONGITUDE("LONGITUDE"),
    
    LATITUDE("LATITUDE"),
    
    PLANTED_ROW("PLANTED_ROW"),
    
    PLANTED_INDIVIDUAL("PLANTED_INDIVIDUAl"),
    
    GRID_ROW("GRID_ROW"),
    
    GRID_COL("GRID_COL"),
    
    MEASURED_ROW("MEASURED_ROW"),
    
    MEASURED_COL("MEASURED_COL");

    private String value;

    PositionCoordinateXTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionCoordinateXTypeEnum fromValue(String text) {
      for (PositionCoordinateXTypeEnum b : PositionCoordinateXTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("positionCoordinateXType")
  private PositionCoordinateXTypeEnum positionCoordinateXType = null;

  @JsonProperty("positionCoordinateY")
  private String positionCoordinateY = null;

  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   */
  public enum PositionCoordinateYTypeEnum {
    LONGITUDE("LONGITUDE"),
    
    LATITUDE("LATITUDE"),
    
    PLANTED_ROW("PLANTED_ROW"),
    
    PLANTED_INDIVIDUAL("PLANTED_INDIVIDUAl"),
    
    GRID_ROW("GRID_ROW"),
    
    GRID_COL("GRID_COL"),
    
    MEASURED_ROW("MEASURED_ROW"),
    
    MEASURED_COL("MEASURED_COL");

    private String value;

    PositionCoordinateYTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionCoordinateYTypeEnum fromValue(String text) {
      for (PositionCoordinateYTypeEnum b : PositionCoordinateYTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("positionCoordinateYType")
  private PositionCoordinateYTypeEnum positionCoordinateYType = null;

  @JsonProperty("replicate")
  private String replicate = null;

  public ObservationUnitStudy X(String X) {
    this.X = X;
    return this;
  }

  /**
   * DEPRECATED - use \"positionCoordinateX\"
   * @return X
  **/
  @ApiModelProperty(value = "DEPRECATED - use \"positionCoordinateX\"")


  public String getX() {
    return X;
  }

  public void setX(String X) {
    this.X = X;
  }

  public ObservationUnitStudy Y(String Y) {
    this.Y = Y;
    return this;
  }

  /**
   * DEPRECATED - use \"positionCoordinateY\"
   * @return Y
  **/
  @ApiModelProperty(value = "DEPRECATED - use \"positionCoordinateY\"")


  public String getY() {
    return Y;
  }

  public void setY(String Y) {
    this.Y = Y;
  }

  public ObservationUnitStudy blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

  /**
   * The block number for an observation unit. Different systems may use different block designs.
   * @return blockNumber
  **/
  @ApiModelProperty(value = "The block number for an observation unit. Different systems may use different block designs.")


  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public ObservationUnitStudy entryNumber(String entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  /**
   * The entry number for an observation unit. Different systems may use different entry systems.
   * @return entryNumber
  **/
  @ApiModelProperty(value = "The entry number for an observation unit. Different systems may use different entry systems.")


  public String getEntryNumber() {
    return entryNumber;
  }

  public void setEntryNumber(String entryNumber) {
    this.entryNumber = entryNumber;
  }

  public ObservationUnitStudy entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * The type of entry for this observation unit. ex. \"check\", \"test\", \"filler\"
   * @return entryType
  **/
  @ApiModelProperty(value = "The type of entry for this observation unit. ex. \"check\", \"test\", \"filler\"")


  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public ObservationUnitStudy germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   *  The ID which uniquely identifies a germplasm
   * @return germplasmDbId
  **/
  @ApiModelProperty(value = " The ID which uniquely identifies a germplasm")


  public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public ObservationUnitStudy germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * Name of the germplasm. It can be the prefered name and does not have to be unique.
   * @return germplasmName
  **/
  @ApiModelProperty(value = "Name of the germplasm. It can be the prefered name and does not have to be unique.")


  public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public ObservationUnitStudy observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies an observation unit
   * @return observationUnitDbId
  **/
  @ApiModelProperty(value = "The ID which uniquely identifies an observation unit")


  public String getObservationUnitDbId() {
    return observationUnitDbId;
  }

  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }

  public ObservationUnitStudy observationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
    return this;
  }

  /**
   * A human readable name for an observation unit
   * @return observationUnitName
  **/
  @ApiModelProperty(value = "A human readable name for an observation unit")


  public String getObservationUnitName() {
    return observationUnitName;
  }

  public void setObservationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
  }

  public ObservationUnitStudy observationUnitXref(List<ObservationUnitXref> observationUnitXref) {
    this.observationUnitXref = observationUnitXref;
    return this;
  }

  public ObservationUnitStudy addObservationUnitXrefItem(ObservationUnitXref observationUnitXrefItem) {
    if (this.observationUnitXref == null) {
      this.observationUnitXref = new ArrayList<ObservationUnitXref>();
    }
    this.observationUnitXref.add(observationUnitXrefItem);
    return this;
  }

  /**
   * A list of external references to this observation unit
   * @return observationUnitXref
  **/
  @ApiModelProperty(value = "A list of external references to this observation unit")

  @Valid

  public List<ObservationUnitXref> getObservationUnitXref() {
    return observationUnitXref;
  }

  public void setObservationUnitXref(List<ObservationUnitXref> observationUnitXref) {
    this.observationUnitXref = observationUnitXref;
  }

  public ObservationUnitStudy observations(List<ObservationSummary> observations) {
    this.observations = observations;
    return this;
  }

  public ObservationUnitStudy addObservationsItem(ObservationSummary observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<ObservationSummary>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * List of observations associated with this observation unit
   * @return observations
  **/
  @ApiModelProperty(value = "List of observations associated with this observation unit")

  @Valid

  public List<ObservationSummary> getObservations() {
    return observations;
  }

  public void setObservations(List<ObservationSummary> observations) {
    this.observations = observations;
  }

  public ObservationUnitStudy pedigree(String pedigree) {
    this.pedigree = pedigree;
    return this;
  }

  /**
   * The string representation of the pedigree of this observation unit
   * @return pedigree
  **/
  @ApiModelProperty(value = "The string representation of the pedigree of this observation unit")


  public String getPedigree() {
    return pedigree;
  }

  public void setPedigree(String pedigree) {
    this.pedigree = pedigree;
  }

  public ObservationUnitStudy plantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
    return this;
  }

  /**
   * The plant number in a field. Applicable for observationLevel: \"plant\"
   * @return plantNumber
  **/
  @ApiModelProperty(value = "The plant number in a field. Applicable for observationLevel: \"plant\"")


  public String getPlantNumber() {
    return plantNumber;
  }

  public void setPlantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
  }

  public ObservationUnitStudy plotNumber(String plotNumber) {
    this.plotNumber = plotNumber;
    return this;
  }

  /**
   * The plot number in a field. Applicable for observationLevel: \"plot\"
   * @return plotNumber
  **/
  @ApiModelProperty(value = "The plot number in a field. Applicable for observationLevel: \"plot\"")


  public String getPlotNumber() {
    return plotNumber;
  }

  public void setPlotNumber(String plotNumber) {
    this.plotNumber = plotNumber;
  }

  public ObservationUnitStudy positionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
    return this;
  }

  /**
   * The X position coordinate for an observation unit. Different systems may use different coordinate systems.
   * @return positionCoordinateX
  **/
  @ApiModelProperty(value = "The X position coordinate for an observation unit. Different systems may use different coordinate systems.")


  public String getPositionCoordinateX() {
    return positionCoordinateX;
  }

  public void setPositionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
  }

  public ObservationUnitStudy positionCoordinateXType(PositionCoordinateXTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
    return this;
  }

  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   * @return positionCoordinateXType
  **/
  @ApiModelProperty(value = "The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column ")


  public PositionCoordinateXTypeEnum getPositionCoordinateXType() {
    return positionCoordinateXType;
  }

  public void setPositionCoordinateXType(PositionCoordinateXTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
  }

  public ObservationUnitStudy positionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
    return this;
  }

  /**
   * The Y position coordinate for an observation unit. Different systems may use different coordinate systems.
   * @return positionCoordinateY
  **/
  @ApiModelProperty(value = "The Y position coordinate for an observation unit. Different systems may use different coordinate systems.")


  public String getPositionCoordinateY() {
    return positionCoordinateY;
  }

  public void setPositionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
  }

  public ObservationUnitStudy positionCoordinateYType(PositionCoordinateYTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
    return this;
  }

  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   * @return positionCoordinateYType
  **/
  @ApiModelProperty(value = "The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column ")


  public PositionCoordinateYTypeEnum getPositionCoordinateYType() {
    return positionCoordinateYType;
  }

  public void setPositionCoordinateYType(PositionCoordinateYTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
  }

  public ObservationUnitStudy replicate(String replicate) {
    this.replicate = replicate;
    return this;
  }

  /**
   * The replicate number of an observation unit. May be the same as blockNumber.
   * @return replicate
  **/
  @ApiModelProperty(value = "The replicate number of an observation unit. May be the same as blockNumber.")


  public String getReplicate() {
    return replicate;
  }

  public void setReplicate(String replicate) {
    this.replicate = replicate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationUnitStudy observationUnitStudy = (ObservationUnitStudy) o;
    return Objects.equals(this.X, observationUnitStudy.X) &&
        Objects.equals(this.Y, observationUnitStudy.Y) &&
        Objects.equals(this.blockNumber, observationUnitStudy.blockNumber) &&
        Objects.equals(this.entryNumber, observationUnitStudy.entryNumber) &&
        Objects.equals(this.entryType, observationUnitStudy.entryType) &&
        Objects.equals(this.germplasmDbId, observationUnitStudy.germplasmDbId) &&
        Objects.equals(this.germplasmName, observationUnitStudy.germplasmName) &&
        Objects.equals(this.observationUnitDbId, observationUnitStudy.observationUnitDbId) &&
        Objects.equals(this.observationUnitName, observationUnitStudy.observationUnitName) &&
        Objects.equals(this.observationUnitXref, observationUnitStudy.observationUnitXref) &&
        Objects.equals(this.observations, observationUnitStudy.observations) &&
        Objects.equals(this.pedigree, observationUnitStudy.pedigree) &&
        Objects.equals(this.plantNumber, observationUnitStudy.plantNumber) &&
        Objects.equals(this.plotNumber, observationUnitStudy.plotNumber) &&
        Objects.equals(this.positionCoordinateX, observationUnitStudy.positionCoordinateX) &&
        Objects.equals(this.positionCoordinateXType, observationUnitStudy.positionCoordinateXType) &&
        Objects.equals(this.positionCoordinateY, observationUnitStudy.positionCoordinateY) &&
        Objects.equals(this.positionCoordinateYType, observationUnitStudy.positionCoordinateYType) &&
        Objects.equals(this.replicate, observationUnitStudy.replicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, blockNumber, entryNumber, entryType, germplasmDbId, germplasmName, observationUnitDbId, observationUnitName, observationUnitXref, observations, pedigree, plantNumber, plotNumber, positionCoordinateX, positionCoordinateXType, positionCoordinateY, positionCoordinateYType, replicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitStudy {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
    sb.append("    observationUnitXref: ").append(toIndentedString(observationUnitXref)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    pedigree: ").append(toIndentedString(pedigree)).append("\n");
    sb.append("    plantNumber: ").append(toIndentedString(plantNumber)).append("\n");
    sb.append("    plotNumber: ").append(toIndentedString(plotNumber)).append("\n");
    sb.append("    positionCoordinateX: ").append(toIndentedString(positionCoordinateX)).append("\n");
    sb.append("    positionCoordinateXType: ").append(toIndentedString(positionCoordinateXType)).append("\n");
    sb.append("    positionCoordinateY: ").append(toIndentedString(positionCoordinateY)).append("\n");
    sb.append("    positionCoordinateYType: ").append(toIndentedString(positionCoordinateYType)).append("\n");
    sb.append("    replicate: ").append(toIndentedString(replicate)).append("\n");
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


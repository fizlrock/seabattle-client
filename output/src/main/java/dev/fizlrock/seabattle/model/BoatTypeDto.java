/*
 * Seabattle API
 * Сервис для игры в морской бой
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: nirku0soft@yandex.ru
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.fizlrock.seabattle.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Описание вида корабля
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class BoatTypeDto {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  @javax.annotation.Nullable
  private Integer size;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @javax.annotation.Nullable
  private Integer count;

  public BoatTypeDto() {
  }

  public BoatTypeDto size(@javax.annotation.Nullable Integer size) {
    
    this.size = size;
    return this;
  }

  /**
   * Длина корабля в клетках
   * minimum: 1
   * @return size
   */
  @javax.annotation.Nullable

  public Integer getSize() {
    return size;
  }


  public void setSize(@javax.annotation.Nullable Integer size) {
    this.size = size;
  }

  public BoatTypeDto count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * Кол-во кораблей данного типа в игре
   * minimum: 1
   * @return count
   */
  @javax.annotation.Nullable

  public Integer getCount() {
    return count;
  }


  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoatTypeDto boatTypeDto = (BoatTypeDto) o;
    return Objects.equals(this.size, boatTypeDto.size) &&
        Objects.equals(this.count, boatTypeDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoatTypeDto {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {

    private BoatTypeDto instance;

    public Builder() {
      this(new BoatTypeDto());
    }

    protected Builder(BoatTypeDto instance) {
      this.instance = instance;
    }

    public BoatTypeDto.Builder size(Integer size) {
      this.instance.size = size;
      return this;
    }
    public BoatTypeDto.Builder count(Integer count) {
      this.instance.count = count;
      return this;
    }


    /**
    * returns a built BoatTypeDto instance.
    *
    * The builder is not reusable.
    */
    public BoatTypeDto build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static BoatTypeDto.Builder builder() {
    return new BoatTypeDto.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public BoatTypeDto.Builder toBuilder() {
    return new BoatTypeDto.Builder()
      .size(getSize())
      .count(getCount());
  }


}

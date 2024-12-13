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
 * Аватар пользователя
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AvatarDto {
  public static final String SERIALIZED_NAME_AVATAR_ID = "avatar_id";
  @SerializedName(SERIALIZED_NAME_AVATAR_ID)
  @javax.annotation.Nullable
  private Long avatarId;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  @javax.annotation.Nullable
  private String pictureUrl;

  public AvatarDto() {
  }

  public AvatarDto avatarId(@javax.annotation.Nullable Long avatarId) {
    
    this.avatarId = avatarId;
    return this;
  }

  /**
   * Get avatarId
   * @return avatarId
   */
  @javax.annotation.Nullable

  public Long getAvatarId() {
    return avatarId;
  }


  public void setAvatarId(@javax.annotation.Nullable Long avatarId) {
    this.avatarId = avatarId;
  }

  public AvatarDto pictureUrl(@javax.annotation.Nullable String pictureUrl) {
    
    this.pictureUrl = pictureUrl;
    return this;
  }

  /**
   * Get pictureUrl
   * @return pictureUrl
   */
  @javax.annotation.Nullable

  public String getPictureUrl() {
    return pictureUrl;
  }


  public void setPictureUrl(@javax.annotation.Nullable String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarDto avatarDto = (AvatarDto) o;
    return Objects.equals(this.avatarId, avatarDto.avatarId) &&
        Objects.equals(this.pictureUrl, avatarDto.pictureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, pictureUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarDto {\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
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

    private AvatarDto instance;

    public Builder() {
      this(new AvatarDto());
    }

    protected Builder(AvatarDto instance) {
      this.instance = instance;
    }

    public AvatarDto.Builder avatarId(Long avatarId) {
      this.instance.avatarId = avatarId;
      return this;
    }
    public AvatarDto.Builder pictureUrl(String pictureUrl) {
      this.instance.pictureUrl = pictureUrl;
      return this;
    }


    /**
    * returns a built AvatarDto instance.
    *
    * The builder is not reusable.
    */
    public AvatarDto build() {
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
  public static AvatarDto.Builder builder() {
    return new AvatarDto.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public AvatarDto.Builder toBuilder() {
    return new AvatarDto.Builder()
      .avatarId(getAvatarId())
      .pictureUrl(getPictureUrl());
  }


}


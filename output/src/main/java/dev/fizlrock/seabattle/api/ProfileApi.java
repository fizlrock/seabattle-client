package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.fizlrock.seabattle.model.AvatarDto;
import dev.fizlrock.seabattle.model.GameStatsDto;
import dev.fizlrock.seabattle.model.UserProfileDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProfileApi {
  /**
   * Получить список доступных аватаров
   * 
   * @return Call&lt;List&lt;AvatarDto&gt;&gt;
   */
  @GET("avatar")
  Call<List<AvatarDto>> getAvatars();
    

  /**
   * Получить статистику об играх пользователя
   * 
   * @param count  (optional, default to 5)
   * @return Call&lt;List&lt;GameStatsDto&gt;&gt;
   */
  @POST("user/stats")
  Call<List<GameStatsDto>> getStats(
    @retrofit2.http.Query("count") Long count
  );

  /**
   * Получить профиль пользователя 
   * 
   * @return Call&lt;UserProfileDto&gt;
   */
  @GET("user/profile")
  Call<UserProfileDto> getUserProfile();
    

  /**
   * Получить профиль пользователя 
   * 
   * @param userId  (required)
   * @return Call&lt;UserProfileDto&gt;
   */
  @GET("user/profile/{userId}")
  Call<UserProfileDto> getUserProfileById(
    @retrofit2.http.Path("userId") Long userId
  );

  /**
   * Установить аватар для пользователя
   * 
   * @param avatarId  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("user/profile/avatar/{avatarId}")
  Call<Void> setAvatar(
    @retrofit2.http.Path("avatarId") Long avatarId
  );

}

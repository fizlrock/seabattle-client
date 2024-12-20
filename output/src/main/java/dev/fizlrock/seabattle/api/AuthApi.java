package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.fizlrock.seabattle.model.RegistrationRequestBody;
import dev.fizlrock.seabattle.model.UserProfileDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AuthApi {
  /**
   * Получить токен авторизации 
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("token")
  Call<Void> getToken();
    

  /**
   * Регистрация пользователя 
   * 
   * @param registrationRequestBody  (optional)
   * @return Call&lt;UserProfileDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user")
  Call<UserProfileDto> registerUser(
    @retrofit2.http.Body RegistrationRequestBody registrationRequestBody
  );

}

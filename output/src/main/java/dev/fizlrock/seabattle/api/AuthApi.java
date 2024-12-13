package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.model.RegistrationRequestBody;
import dev.fizlrock.seabattle.model.UserProfileDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

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

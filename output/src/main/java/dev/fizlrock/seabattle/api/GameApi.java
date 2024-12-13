package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.fizlrock.seabattle.model.BoatCordDto;
import dev.fizlrock.seabattle.model.GameSettingsDto;
import dev.fizlrock.seabattle.model.GameStateDto;
import dev.fizlrock.seabattle.model.ShotDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GameApi {
  /**
   * Получить список параметров игры 
   * 
   * @return Call&lt;GameSettingsDto&gt;
   */
  @GET("game/settings")
  Call<GameSettingsDto> getGameSettings();
    

  /**
   * Получить состояние игры, если оно изменилось(вебхук).
   * Получить состояние игры, если оно изменилось(вебхук). В параметрах необходимо указать текущую версию состояния игры - currentState. Если currentStateNumber не совпадет с stateNumber сервер вернет текущий game_state_dto.  Так же сервер вернет game_state_dto если истечет таймаут.  
   * @param currentStateNumber  (required)
   * @return Call&lt;GameStateDto&gt;
   */
  @GET("game")
  Call<GameStateDto> getUpdatedGameState(
    @retrofit2.http.Query("currentStateNumber") Long currentStateNumber
  );

  /**
   * Сделать выстрел по полю противника
   * 
   * @param shotDto  (optional)
   * @return Call&lt;GameStateDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("game/shot")
  Call<GameStateDto> makeShot(
    @retrofit2.http.Body ShotDto shotDto
  );

  /**
   * Начать новую игру
   * Начать новую игру
   * @param boatCordDto  (optional)
   * @return Call&lt;GameStateDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("game")
  Call<GameStateDto> startNewGame(
    @retrofit2.http.Body List<BoatCordDto> boatCordDto
  );

}

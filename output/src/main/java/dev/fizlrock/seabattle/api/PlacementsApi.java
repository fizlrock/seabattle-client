package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.fizlrock.seabattle.model.BoatCordDto;
import dev.fizlrock.seabattle.model.PlacementStrategyDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PlacementsApi {
  /**
   * Сгенерировать расстановку кораблей по заданной стратегии 
   * 
   * @param strategyId ID стратегии генерации (required)
   * @return Call&lt;List&lt;BoatCordDto&gt;&gt;
   */
  @GET("placement/generated/{strategyId}")
  Call<List<BoatCordDto>> getGeneratedBoatSpec(
    @retrofit2.http.Path("strategyId") Long strategyId
  );

  /**
   * Получить список стратегий создания карты расстановкий кораблей 
   * 
   * @return Call&lt;PlacementStrategyDto&gt;
   */
  @GET("placement/strategy")
  Call<PlacementStrategyDto> getPlacementStrategies();
    

}

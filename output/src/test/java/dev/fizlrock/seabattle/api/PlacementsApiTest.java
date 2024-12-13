package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.model.BoatCordDto;
import dev.fizlrock.seabattle.model.PlacementStrategyDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlacementsApi
 */
public class PlacementsApiTest {

    private PlacementsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().createService(PlacementsApi.class);
    }

    /**
     * Сгенерировать расстановку кораблей по заданной стратегии 
     *
     * 
     */
    @Test
    public void getGeneratedBoatSpecTest() {
        Long strategyId = null;
        // List<BoatCordDto> response = api.getGeneratedBoatSpec(strategyId);

        // TODO: test validations
    }
    /**
     * Получить список стратегий создания карты расстановкий кораблей 
     *
     * 
     */
    @Test
    public void getPlacementStrategiesTest() {
        // PlacementStrategyDto response = api.getPlacementStrategies();

        // TODO: test validations
    }
}

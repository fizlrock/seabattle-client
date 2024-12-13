package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.model.BoatCordDto;
import dev.fizlrock.seabattle.model.GameSettingsDto;
import dev.fizlrock.seabattle.model.GameStateDto;
import dev.fizlrock.seabattle.model.ShotDto;
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
 * API tests for GameApi
 */
public class GameApiTest {

    private GameApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().createService(GameApi.class);
    }

    /**
     * Получить список параметров игры 
     *
     * 
     */
    @Test
    public void getGameSettingsTest() {
        // GameSettingsDto response = api.getGameSettings();

        // TODO: test validations
    }
    /**
     * Получить состояние игры, если оно изменилось(вебхук).
     *
     * Получить состояние игры, если оно изменилось(вебхук). В параметрах необходимо указать текущую версию состояния игры - currentState. Если currentStateNumber не совпадет с stateNumber сервер вернет текущий game_state_dto.  Так же сервер вернет game_state_dto если истечет таймаут.  
     */
    @Test
    public void getUpdatedGameStateTest() {
        Long currentStateNumber = null;
        // GameStateDto response = api.getUpdatedGameState(currentStateNumber);

        // TODO: test validations
    }
    /**
     * Сделать выстрел по полю противника
     *
     * 
     */
    @Test
    public void makeShotTest() {
        ShotDto shotDto = null;
        // GameStateDto response = api.makeShot(shotDto);

        // TODO: test validations
    }
    /**
     * Начать новую игру
     *
     * Начать новую игру
     */
    @Test
    public void startNewGameTest() {
        List<BoatCordDto> boatCordDto = null;
        // GameStateDto response = api.startNewGame(boatCordDto);

        // TODO: test validations
    }
}

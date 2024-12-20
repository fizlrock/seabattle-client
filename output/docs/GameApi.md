# GameApi

All URIs are relative to *https://107.172.142.23:1234*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameSettings**](GameApi.md#getGameSettings) | **GET** game/settings | Получить список параметров игры  |
| [**getUpdatedGameState**](GameApi.md#getUpdatedGameState) | **GET** game | Получить состояние игры, если оно изменилось(вебхук). |
| [**makeShot**](GameApi.md#makeShot) | **POST** game/shot | Сделать выстрел по полю противника |
| [**startNewGame**](GameApi.md#startNewGame) | **POST** game | Начать новую игру |



## getGameSettings

> GameSettingsDto getGameSettings()

Получить список параметров игры 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");

        GameApi apiInstance = new GameApi(defaultClient);
        try {
            GameSettingsDto result = apiInstance.getGameSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getGameSettings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GameSettingsDto**](GameSettingsDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Настройки игры |  -  |


## getUpdatedGameState

> GameStateDto getUpdatedGameState(currentStateNumber)

Получить состояние игры, если оно изменилось(вебхук).

Получить состояние игры, если оно изменилось(вебхук). В параметрах необходимо указать текущую версию состояния игры - currentState. Если currentStateNumber не совпадет с stateNumber сервер вернет текущий game_state_dto.  Так же сервер вернет game_state_dto если истечет таймаут.  

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GameApi apiInstance = new GameApi(defaultClient);
        Long currentStateNumber = 56L; // Long | 
        try {
            GameStateDto result = apiInstance.getUpdatedGameState(currentStateNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getUpdatedGameState");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currentStateNumber** | **Long**|  | |

### Return type

[**GameStateDto**](GameStateDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Новое состояние игры. |  -  |
| **208** | Cостояние игры с переданным currentStateNumber. Такой ответ означает истечение таймаута.  |  -  |


## makeShot

> GameStateDto makeShot(shotDto)

Сделать выстрел по полю противника

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GameApi apiInstance = new GameApi(defaultClient);
        ShotDto shotDto = new ShotDto(); // ShotDto | 
        try {
            GameStateDto result = apiInstance.makeShot(shotDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#makeShot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shotDto** | [**ShotDto**](ShotDto.md)|  | [optional] |

### Return type

[**GameStateDto**](GameStateDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Состояние карты |  -  |


## startNewGame

> GameStateDto startNewGame(boatCordDto)

Начать новую игру

Начать новую игру

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GameApi apiInstance = new GameApi(defaultClient);
        List<BoatCordDto> boatCordDto = Arrays.asList(); // List<BoatCordDto> | 
        try {
            GameStateDto result = apiInstance.startNewGame(boatCordDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#startNewGame");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **boatCordDto** | [**List&lt;BoatCordDto&gt;**](BoatCordDto.md)|  | [optional] |

### Return type

[**GameStateDto**](GameStateDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Состояние игры |  -  |


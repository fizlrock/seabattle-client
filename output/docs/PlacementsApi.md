# PlacementsApi

All URIs are relative to *https://107.172.142.23:1234*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGeneratedBoatSpec**](PlacementsApi.md#getGeneratedBoatSpec) | **GET** placement/generated/{strategyId} | Сгенерировать расстановку кораблей по заданной стратегии  |
| [**getPlacementStrategies**](PlacementsApi.md#getPlacementStrategies) | **GET** placement/strategy | Получить список стратегий создания карты расстановкий кораблей  |



## getGeneratedBoatSpec

> List&lt;BoatCordDto&gt; getGeneratedBoatSpec(strategyId)

Сгенерировать расстановку кораблей по заданной стратегии 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.PlacementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlacementsApi apiInstance = new PlacementsApi(defaultClient);
        Long strategyId = 56L; // Long | ID стратегии генерации
        try {
            List<BoatCordDto> result = apiInstance.getGeneratedBoatSpec(strategyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#getGeneratedBoatSpec");
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
| **strategyId** | **Long**| ID стратегии генерации | |

### Return type

[**List&lt;BoatCordDto&gt;**](BoatCordDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Расстановка кораблей |  -  |


## getPlacementStrategies

> PlacementStrategyDto getPlacementStrategies()

Получить список стратегий создания карты расстановкий кораблей 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.PlacementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlacementsApi apiInstance = new PlacementsApi(defaultClient);
        try {
            PlacementStrategyDto result = apiInstance.getPlacementStrategies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#getPlacementStrategies");
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

[**PlacementStrategyDto**](PlacementStrategyDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список стратегий расстановки |  -  |


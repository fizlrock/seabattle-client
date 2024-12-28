# ProfileApi

All URIs are relative to *https://107.172.142.23:1234*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvatars**](ProfileApi.md#getAvatars) | **GET** avatar | Получить список доступных аватаров |
| [**getStats**](ProfileApi.md#getStats) | **POST** user/stats | Получить статистику об играх пользователя |
| [**getUserProfile**](ProfileApi.md#getUserProfile) | **GET** user/profile | Получить профиль пользователя  |
| [**getUserProfileById**](ProfileApi.md#getUserProfileById) | **GET** user/profile/{userId} | Получить профиль пользователя  |
| [**setAvatar**](ProfileApi.md#setAvatar) | **POST** user/profile/avatar/{avatarId} | Установить аватар для пользователя |



## getAvatars

> List&lt;AvatarDto&gt; getAvatars()

Получить список доступных аватаров

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        try {
            List<AvatarDto> result = apiInstance.getAvatars();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#getAvatars");
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

[**List&lt;AvatarDto&gt;**](AvatarDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список аватаров |  -  |


## getStats

> List&lt;GameStatsDto&gt; getStats(count)

Получить статистику об играх пользователя

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        Long count = 5L; // Long | 
        try {
            List<GameStatsDto> result = apiInstance.getStats(count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#getStats");
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
| **count** | **Long**|  | [optional] [default to 5] |

### Return type

[**List&lt;GameStatsDto&gt;**](GameStatsDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Статистика игр последних count игр |  -  |


## getUserProfile

> UserProfileDto getUserProfile()

Получить профиль пользователя 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        try {
            UserProfileDto result = apiInstance.getUserProfile();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#getUserProfile");
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

[**UserProfileDto**](UserProfileDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Профиль пользователя |  -  |


## getUserProfileById

> UserProfileDto getUserProfileById(userId)

Получить профиль пользователя 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        Long userId = 56L; // Long | 
        try {
            UserProfileDto result = apiInstance.getUserProfileById(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#getUserProfileById");
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
| **userId** | **Long**|  | |

### Return type

[**UserProfileDto**](UserProfileDto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Профиль пользователя |  -  |


## setAvatar

> setAvatar(avatarId)

Установить аватар для пользователя

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        Long avatarId = 56L; // Long | 
        try {
            apiInstance.setAvatar(avatarId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#setAvatar");
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
| **avatarId** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Аватар успешно установлен |  -  |


# ProfileApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvatars**](ProfileApi.md#getAvatars) | **GET** avatar | Получить список доступных аватаров |
| [**getUserProfile**](ProfileApi.md#getUserProfile) | **GET** user/profile | Получить профиль пользователя  |
| [**setAvatar**](ProfileApi.md#setAvatar) | **POST** user/{userId}/avatar/{avatarId} | Установить аватар для пользователя |



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
        defaultClient.setBasePath("http://localhost:8081");

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
        defaultClient.setBasePath("http://localhost:8081");
        
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


## setAvatar

> setAvatar(userId, avatarId)

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
        defaultClient.setBasePath("http://localhost:8081");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        Long userId = 56L; // Long | 
        Long avatarId = 56L; // Long | 
        try {
            apiInstance.setAvatar(userId, avatarId);
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
| **userId** | **Long**|  | |
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


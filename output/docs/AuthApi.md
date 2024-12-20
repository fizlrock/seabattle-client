# AuthApi

All URIs are relative to *https://107.172.142.23:1234*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](AuthApi.md#getToken) | **GET** token | Получить токен авторизации  |
| [**registerUser**](AuthApi.md#registerUser) | **POST** user | Регистрация пользователя  |



## getToken

> getToken()

Получить токен авторизации 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.auth.*;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");
        
        // Configure HTTP basic authorization: basicHttpAuthentication
        HttpBasicAuth basicHttpAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicHttpAuthentication");
        basicHttpAuthentication.setUsername("YOUR USERNAME");
        basicHttpAuthentication.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            apiInstance.getToken();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#getToken");
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

null (empty response body)

### Authorization

[basicHttpAuthentication](../README.md#basicHttpAuthentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Авторизация успешно пройдена. |  * Authorization - JWT токен для дальнейшей аутентификации <br>  |
| **401** | Проблема с аутентификацией |  -  |


## registerUser

> UserProfileDto registerUser(registrationRequestBody)

Регистрация пользователя 

### Example

```java
// Import classes:
import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.invoker.ApiException;
import dev.fizlrock.seabattle.invoker.Configuration;
import dev.fizlrock.seabattle.invoker.models.*;
import dev.fizlrock.seabattle.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://107.172.142.23:1234");

        AuthApi apiInstance = new AuthApi(defaultClient);
        RegistrationRequestBody registrationRequestBody = new RegistrationRequestBody(); // RegistrationRequestBody | 
        try {
            UserProfileDto result = apiInstance.registerUser(registrationRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#registerUser");
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
| **registrationRequestBody** | [**RegistrationRequestBody**](RegistrationRequestBody.md)|  | [optional] |

### Return type

[**UserProfileDto**](UserProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Пользователь успешно зарегистирован |  -  |


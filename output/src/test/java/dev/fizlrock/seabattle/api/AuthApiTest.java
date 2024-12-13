package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.model.RegistrationRequestBody;
import dev.fizlrock.seabattle.model.UserProfileDto;
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
 * API tests for AuthApi
 */
public class AuthApiTest {

    private AuthApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().createService(AuthApi.class);
    }

    /**
     * Получить токен авторизации 
     *
     * 
     */
    @Test
    public void getTokenTest() {
        // api.getToken();

        // TODO: test validations
    }
    /**
     * Регистрация пользователя 
     *
     * 
     */
    @Test
    public void registerUserTest() {
        RegistrationRequestBody registrationRequestBody = null;
        // UserProfileDto response = api.registerUser(registrationRequestBody);

        // TODO: test validations
    }
}

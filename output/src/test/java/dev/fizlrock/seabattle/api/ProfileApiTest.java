package dev.fizlrock.seabattle.api;

import dev.fizlrock.seabattle.invoker.ApiClient;
import dev.fizlrock.seabattle.model.AvatarDto;
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
 * API tests for ProfileApi
 */
public class ProfileApiTest {

    private ProfileApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().createService(ProfileApi.class);
    }

    /**
     * Получить список доступных аватаров
     *
     * 
     */
    @Test
    public void getAvatarsTest() {
        // List<AvatarDto> response = api.getAvatars();

        // TODO: test validations
    }
    /**
     * Получить профиль пользователя 
     *
     * 
     */
    @Test
    public void getUserProfileTest() {
        // UserProfileDto response = api.getUserProfile();

        // TODO: test validations
    }
    /**
     * Установить аватар для пользователя
     *
     * 
     */
    @Test
    public void setAvatarTest() {
        Long userId = null;
        Long avatarId = null;
        // api.setAvatar(userId, avatarId);

        // TODO: test validations
    }
}

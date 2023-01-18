package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UserInfoTest extends TestBase {
    @Tag("ui")
    @Tag("all")
    @Test
    @DisplayName("Получить текущего пользователя")
    void checkUserInfoTest() {
        userInfoPage
                .getUserInfoTest();
    }
}
package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ui")
@Tag("all")
public class UserInfoTest extends TestBase {

    @Test
    @DisplayName("Получить текущего пользователя")
    void checkUserInfoTest() {
        userInfoPage
                .getUserInfoTest();
    }
}
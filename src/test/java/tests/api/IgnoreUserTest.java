package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class IgnoreUserTest extends TestBase{
    @Tag("ui")
    @Test
    @DisplayName("Начать игнорировать пользователя")
    void userIgnoreTest() {
        ignorePage
                .addUserIgnore();
    }


    @Tag("ui")
    @Test
    @DisplayName("Перестать игнорировать пользователя")
    void userRemoveIgnoreTest() {
        ignorePage
                .removeUserIgnore();
    }
}

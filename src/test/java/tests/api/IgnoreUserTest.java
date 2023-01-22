package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ui")
@Tag("all")
public class IgnoreUserTest extends TestBase{

    @Test
    @DisplayName("Начать игнорировать пользователя")
    void userIgnoreTest() {
        ignorePage
                .addUserIgnore();
    }


    @Test
    @DisplayName("Перестать игнорировать пользователя")
    void userRemoveIgnoreTest() {
        ignorePage
                .removeUserIgnore();
    }
}

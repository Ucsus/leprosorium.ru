package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("mobile")
@Tag("all")
public class LoginTest extends TestBase {

    @Test
    @DisplayName("Проверка авторизации с корректным логином и паролем")
    void successLoginTest() {
        loginPage
                .authorizationFormFill()
                .checkAuthorization();
    }

    @Test
    @DisplayName("Проверка авторизации с неправильным паролем")
    void invalidPasswordTest() {
        loginPage
                .invalidPassword();
    }

    @Test
    @DisplayName("Проверка авторизации с неправильным логином")
    void invalidUserTest() {
        loginPage
                .invalidUser();
    }
}

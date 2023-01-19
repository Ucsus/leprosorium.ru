package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка авторизации с корректным логином и паролем")
    void successLoginTest() {
        loginPage
                .authorizationFormFill()
                .checkAuthorization();
    }

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка авторизации с неправильным паролем")
    void invalidPasswordTest() {
        loginPage
                .invalidPassword();
    }

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка авторизации с неправильным логином")
    void invalidUserTest() {
        loginPage
                .invalidUser();
    }
}

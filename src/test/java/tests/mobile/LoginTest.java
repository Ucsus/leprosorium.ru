package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    void successLoginTest() {
        loginPage
                .authorizationFormFill()
                .checkAuthorization();
    }

    @Tag("mobile")
    @Tag("all")
    @Test
    void invalidPasswordTest() {
        loginPage
                .invalidPassword();
    }

    @Tag("mobile")
    @Tag("all")
    @Test
    void invalidUserTest() {
        loginPage
                .invalidUser();
    }
}

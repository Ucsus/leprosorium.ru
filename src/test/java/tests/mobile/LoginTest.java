package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Tag("mobile")
    @Test
    void successLoginTest() {
        loginPage
                .authorizationFormFill()
                .checkAuthorization();
    }

    @Tag("mobile")
    @Test
    void invalidPasswordTest() {
        loginPage
                .invalidPassword();
    }

    @Tag("mobile")
    @Test
    void invalidUserTest() {
        loginPage
                .invalidUser();
    }
}

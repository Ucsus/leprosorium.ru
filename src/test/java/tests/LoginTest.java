package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;


public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    void authorizationTest() {
        loginPage.
                openPage().
                loginButtonClick().
                loginFormCheck().
                authorizationFormFill();
    }
}

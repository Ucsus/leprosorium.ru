package tests;

import com.codeborne.selenide.Condition;
import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LoginTest extends TestBase {
    private final LoginPage loginPage = new LoginPage();

    @Test
    void authTest() {
        step("Open main page", () -> {
            loginPage.openPage();
        });
        step("Login button click", () -> {
            loginPage.loginButton.click();
        });
        step("Check login form", () -> {
            loginPage.loginForm.shouldHave(Condition.visible);
        });
        step("Authorization", () -> {
            AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
            loginPage.username.setValue(config.username());
            loginPage.password.setValue(config.password()).pressEnter();
        });
        step("Navigation", () -> {
            loginPage.navigationMenu.click();
        });
        step("Go to qaguru.leprosorium.ru", () -> {
           $(".b-navthing_tab_both_link").click();
        });
    }
}

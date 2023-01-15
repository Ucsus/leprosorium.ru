package tests.mobile;

import com.codeborne.selenide.Configuration;
import drivers.MobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.mobile.pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setup() {
        Configuration.browser = MobileDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @Test
    void successLoginTest() {
        loginPage
                .authorizationFormFill()
                .checkAuthorization();
    }

    @Test
    void invalidPasswordTest() {
        loginPage
                .invalidPassword();
    }

    @Test
    void invalidUserTest() {
        loginPage
                .invalidUser();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Последний скриншот");
        Attach.pageSource();

        closeWebDriver();
    }
}

package tests.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.WebDriver;
import helpers.Attach;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import tests.web.pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    LoginPage loginPage = new LoginPage();

    public void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @BeforeAll
    static void setUp() {
        WebDriver.configuration();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    @Step("Авторизация")
    void authorizationTest() {
        loginPage
                .openPage("/login")
                .loginButtonClick()
                .loginFormCheck()
                .authorizationFormFill()
                .authorizationCheck();
    }

    @AfterEach
    void addAttach() {
        Attach.addVideo("Видео");
        Attach.browserConsoleLogs();
        Attach.screenshotAs("Последний скриншот");
        Attach.pageSource("Код страницы");
        closeWebDriver();
    }
}

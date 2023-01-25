package tests.web;

import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.web.BrowserSetup;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tests.web.pages.FraudPage;
import tests.web.pages.LoginPage;
import tests.web.pages.MainPage;
import tests.web.pages.SearchPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public abstract class TestBase {
    static String useRemote = System.getProperty("webHost", "local");
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    FraudPage fraudPage = new FraudPage();

    @BeforeAll
    static void setUp() {
        BrowserSetup.configure();
    }

    @BeforeEach
    public void addListenerAndStart() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void addAttachments() {
        Attach.screenshotAs("Скриншот");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.video();
        if (useRemote.equals("remote")) {
            Attach.video();
        }
        closeWebDriver();
    }
}
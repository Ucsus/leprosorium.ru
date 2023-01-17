package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.mobile.BrowserStackMobileDriver;
import drivers.mobile.EmulationMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tests.mobile.pages.FavPage;
import tests.mobile.pages.InboxPage;
import tests.mobile.pages.LoginPage;
import tests.mobile.pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.getSessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {

    static String driver = System.getProperty("mobileDeviceHost", "emulation");
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    FavPage favPage = new FavPage();
    InboxPage inboxPage = new InboxPage();

    @BeforeAll
    public static void setup() {
        if (driver.equals("browserstack")) {
            Configuration.browser = BrowserStackMobileDriver.class.getName();
        } else if (driver.equals("emulation")) {
            Configuration.browser = EmulationMobileDriver.class.getName();
        } else {
            throw new RuntimeException("Incorrect stand name");
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = getSessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);

        if (driver.equals("browserstack")) {
            Attach.video(sessionId);
        }
    }

}

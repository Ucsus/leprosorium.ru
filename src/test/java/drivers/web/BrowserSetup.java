package drivers.web;

import com.codeborne.selenide.Configuration;
import config.web.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetup {
    public static WebConfig config = ConfigFactory.create(WebConfig.class);

    public static boolean isRemoteWebDriver() {
        return !config.remoteUrl().equals("");
    }

    public static void configure() {
        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.browserSize = config.browserSize();
        Configuration.pageLoadStrategy = config.pageLoad();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--lang=en-en");

        if (isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = String.format("https://%s:%s@%swd/hub",
                    config.selenoidLogin(), config.selenoidPassword(), config.remoteUrl());
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            Configuration.browserCapabilities = capabilities;
        }
    }
}
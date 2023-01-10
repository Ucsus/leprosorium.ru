package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configuration() {

        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.browserSize = config.browserSize();
        Configuration.baseUrl = config.baseUrl();
        Configuration.pageLoadStrategy = config.pageLoad();

        String remote = config.remote();
        String remoteUrl = WebDriverProvider.config.remote();
        if (remoteUrl != null) {
            Configuration.remote = remote;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
    }


}
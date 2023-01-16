package drivers;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

public class WebDriver {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configuration() {

        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.browserSize = config.browserSize();
        Configuration.baseUrl = config.baseUrl();
        Configuration.pageLoadStrategy = config.pageLoad();
        String remoteUrl = config.remoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }


}
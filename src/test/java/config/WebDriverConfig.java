package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${host}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://leprosorium.ru")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("108")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remote")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remote();

    @Key("pageLoad")
    @DefaultValue("eager")
    String pageLoad();
}
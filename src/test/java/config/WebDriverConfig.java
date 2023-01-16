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
    @DefaultValue("100")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("pageLoad")
    @DefaultValue("eager")
    String pageLoad();
}
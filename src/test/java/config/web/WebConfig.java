package config.web;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/remote.properties",
        "classpath:config/api.properties",
        "classpath:config/local.properties"
})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://leprosorium.ru")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("remoteUrl")
    @DefaultValue("")
    String remoteUrl();

    @Key("selenoidLogin")
    @DefaultValue("")
    String selenoidLogin();

    @Key("selenoidPassword")
    @DefaultValue("")
    String selenoidPassword();

    @Key("pageLoad")
    @DefaultValue("eager")
    String pageLoad();
}
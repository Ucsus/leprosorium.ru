package config.web;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/remote.properties",
        "classpath:config/api.properties",
        "classpath:config/local.properties"
})
public interface WebConfig extends Config {

    @DefaultValue("https://leprosorium.ru")
    String baseUrl();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("100.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    String username();

    String password();

    @DefaultValue("")
    String remoteUrl();

    @DefaultValue("")
    String selenoidLogin();

    @DefaultValue("")
    String selenoidPassword();

    @DefaultValue("eager")
    String pageLoad();
}
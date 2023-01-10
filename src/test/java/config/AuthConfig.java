package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:./resources/config/auth.properties",
        "classpath:config/auth.properties"
})
public interface AuthConfig extends Config {
    @Key("username")
    String username();
    @Key("password")
    String password();
}

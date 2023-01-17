package config.api;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/api.properties")
public interface ApiConfig extends Config {
    String baseUrl();
    String username();
    String password();
}

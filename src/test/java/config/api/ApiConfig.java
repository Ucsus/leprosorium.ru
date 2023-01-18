package config.api;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/api.properties")
public interface ApiConfig extends Config {
    String uid();
    String username();
    String password();
}

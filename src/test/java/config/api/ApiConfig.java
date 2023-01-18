package config.api;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/api.properties")
public interface ApiConfig extends Config {
    @DefaultValue("92788")
    String uid();
    String sid();
    @DefaultValue("https://leprosorium.ru")
    String baseUrl();
    @DefaultValue("/api")
    String basePath();
    String username();
    String password();
}

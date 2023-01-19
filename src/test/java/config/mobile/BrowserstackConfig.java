package config.mobile;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface BrowserstackConfig extends Config {

    String user();
    String key();
    String app();
    String device();
    String osVersion();
    String project();
    String build();
    String name();
    String url();
}

package config.mobile;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/emulator.properties")
public interface EmulationConfig extends Config {

    String platformName();
    String platformVersion();
    String deviceName();
    String appPackage();
    String appActivity();
}

package config;

import org.aeonbits.owner.ConfigFactory;

public enum ConfigReader {
    Instance;

    private static final WebConfig config =
            ConfigFactory.create(WebConfig.class, System.getProperties());

    public WebConfig read() {
        return config;
    }
}

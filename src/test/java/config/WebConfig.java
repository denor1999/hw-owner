package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    Browser browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("isRemote")
    Boolean isRemote();

    @Key("remoteUrl")
    String remoteUrl();
}

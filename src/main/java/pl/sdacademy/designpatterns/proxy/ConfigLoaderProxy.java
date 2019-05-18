package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderProxy implements ConfigLoader {

    private ConfigLoader configLoader;
    private String serverUrl;
    private String configuration;

    public ConfigLoaderProxy (String serverUrl){
        this.serverUrl = serverUrl;
        configLoader = new ConfigLoaderImpl(serverUrl);
    }

    public String load() {
        if (configuration == null) {
            return configLoader.load();
        }
        return configuration;
    }
}

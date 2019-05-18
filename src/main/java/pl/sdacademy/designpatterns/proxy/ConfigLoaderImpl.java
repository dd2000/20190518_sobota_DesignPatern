package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderImpl implements ConfigLoader {
    private String configuration;
    private String serverUrl;

    public ConfigLoaderImpl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String load(){
        System.out.println("Getting configuration");
        try {
            Thread.sleep(2000);
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

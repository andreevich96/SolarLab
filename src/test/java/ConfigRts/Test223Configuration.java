package ConfigRts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test223Configuration {

    private Properties properties = new Properties();

    public String mainPage;
    public String browser;
    public boolean holdBrowserOpen;
    public boolean startMaximized;

    public Test223Configuration() throws IOException {
        FileInputStream inputStream = new FileInputStream("src/test/resources/configRTS.properties");

        properties.load(inputStream);

        mainPage = properties.getProperty("mainRtsPage");
        browser = properties.getProperty("browser");
        holdBrowserOpen = Boolean.parseBoolean(properties.getProperty("holdBrowserOpen"));
        startMaximized = Boolean.parseBoolean(properties.getProperty("startMaximized"));
    }
}

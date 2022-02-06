package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DriverSingleton {
    private static DriverSingleton instance;

    private WebDriver webDriver;

    private DriverSingleton() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/download").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        this.webDriver = new ChromeDriver(options);
    }

    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return getInstance().webDriver;
    }
}

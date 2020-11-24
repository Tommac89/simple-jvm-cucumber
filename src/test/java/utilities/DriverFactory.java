package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (null == driver) {
            driver = new ChromeDriver();
            driver.manage().window().fullscreen();
        }
        return driver;
    }
}

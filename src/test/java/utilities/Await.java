package utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Await {

    private static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10L);

    public static WebDriverWait await() {
        return wait;
    }
}


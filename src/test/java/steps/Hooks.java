package steps;

import io.cucumber.java.After;
import utilities.DriverFactory;

public class Hooks {

    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }
}

package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage {

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ResultsPage searchFor(String searchString) {
        searchBar.sendKeys(searchString + ENTER);
        return new ResultsPage(driver);
    }

}

package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.objects.HomePage;
import page.objects.ResultsPage;
import utilities.DriverFactory;

public class SearchStepDefs {

    ResultsPage resultsPage;
    WebDriver driver;

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        driver = DriverFactory.getDriver();
        driver.get("http://www.automationpractice.com");
    }

    @When("I search for {string} in the searchbar")
    public void useSearchBar(String searchTerm) {
        resultsPage = new HomePage(driver)
                .searchFor(searchTerm);
    }

    @And("add a product to the cart: {string}")
    public void add_a_product_to_the_cart(String productName) {
        resultsPage
                .locateProduct(productName)
                .addToCart()
                .proceedToShoppingCart();
    }


}

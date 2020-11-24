package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import page.objects.ShoppingCart;

import static utilities.DriverFactory.getDriver;

public class CartStepDefs {

    @Then("the total cart price is {string}")
    public void the_price_is_as_expected(String expectedPrice) {
        Assert.assertEquals(expectedPrice, new ShoppingCart(getDriver()).getTotalPrice());
    }
}

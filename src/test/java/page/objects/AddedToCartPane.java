package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static utilities.Await.await;

public class AddedToCartPane {

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCart;

    private WebDriver driver;

    public AddedToCartPane(WebDriver driver) {
        this.driver = driver;
        await().until(visibilityOfElementLocated(By.cssSelector(".layer_cart_product")));
        PageFactory.initElements(driver, this);
    }

    public ShoppingCart proceedToShoppingCart() {
        proceedToCart.click();
        return new ShoppingCart(driver);
    }

}

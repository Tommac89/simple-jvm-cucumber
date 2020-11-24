package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.DriverFactory;

public class ProductTile {

    private final WebElement baseElement;
    String productNameSelector = "a.product-name";

    public ProductTile(WebElement element) {
        this.baseElement = element;
    }

    public String getPrice() {
        return baseElement
                .findElement(By.cssSelector(".price.product-price"))
                .getText();
    }

    public String getName() {
        return baseElement
                .findElement(By.cssSelector(productNameSelector))
                .getText();
    }

    public ProductPage openProductsPage() {
        baseElement
                .findElement(By.cssSelector(productNameSelector))
                .click();
        return new ProductPage(DriverFactory.getDriver());
    }

    private WebElement getImage() {
        return baseElement.findElement(By.cssSelector("img"));
    }

    public AddedToCartPane addToCart() {
        WebElement addToCart = baseElement
                .findElement(By.cssSelector(".ajax_add_to_cart_button"));

        WebDriver driver = DriverFactory.getDriver();
        new Actions(driver).moveToElement(getImage()).build().perform();
        addToCart.click();

        return new AddedToCartPane(driver);
    }


}

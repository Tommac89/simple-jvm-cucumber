package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static utilities.Await.await;

public class ShoppingCart {

    @FindBy(id = "total_price")
    private WebElement totalPrice;

    public ShoppingCart(WebDriver driver) {
        await().until(presenceOfElementLocated(By.id("cart_title")));
        PageFactory.initElements(driver, this);
    }

    public String getTotalPrice() {
        return totalPrice.getText().trim();
    }
}

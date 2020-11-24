package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static utilities.Await.await;

public class ResultsPage {
    @FindBy(css = ".product-container")
    private List<WebElement> productContainers;

    private WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        await().until(visibilityOfElementLocated(By.cssSelector("h1.product-listing")));
        PageFactory.initElements(driver, this);
    }

    private List<ProductTile> getProductContainers() {
        return productContainers.stream()
                .map(ProductTile::new)
                .collect(Collectors.toList());
    }

    public ProductTile locateProduct(String productName) {
        return getProductContainers().stream().parallel()
                .filter(product -> product.getName().trim().equals(productName))
                .findFirst().orElseThrow();
    }


}

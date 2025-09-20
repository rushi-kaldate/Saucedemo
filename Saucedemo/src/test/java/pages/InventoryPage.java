package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InventoryPage {
	
	WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "inventory_item_name")
    List<WebElement> productNames;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpackToCartButton;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void clickAddToCartForFirstProduct() {
        addBackpackToCartButton.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public int getProductCount() {
        return productNames.size();
    }

}

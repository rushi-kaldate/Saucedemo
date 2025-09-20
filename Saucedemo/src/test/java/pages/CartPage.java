package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	 WebDriver driver;

	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Locators
	    @FindBy(className = "inventory_item_name")
	    List<WebElement> cartItems;

	    @FindBy(id = "remove-sauce-labs-backpack")
	    WebElement removeBackpackBtn;

	    @FindBy(id = "checkout")
	    WebElement checkoutButton;

	    // Methods
	    public int getNumberOfItemsInCart() {
	        return cartItems.size();
	    }

	    public String getFirstCartItemName() {
	        return cartItems.get(0).getText();
	    }

	    public void removeFirstItemFromCart() {
	        removeBackpackBtn.click();
	    }

	    public void clickCheckout() {
	        checkoutButton.click();
	    }

	    public boolean isCartEmpty() {
	        return cartItems.isEmpty();
	    }

}

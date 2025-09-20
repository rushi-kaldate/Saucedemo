package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	 WebDriver driver;

	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Checkout Step One Locators
	    @FindBy(id = "first-name")
	    WebElement firstNameInput;

	    @FindBy(id = "last-name")
	    WebElement lastNameInput;

	    @FindBy(id = "postal-code")
	    WebElement zipCodeInput;

	    @FindBy(id = "continue")
	    WebElement continueButton;

	    @FindBy(css = "h3[data-test='error']")
	    WebElement errorMessage;

	    // Checkout Step Two Locators
	    @FindBy(className = "inventory_item_name")
	    WebElement itemNameInCheckout;

	    @FindBy(className = "summary_subtotal_label")
	    WebElement itemTotalLabel;

	    @FindBy(id = "finish")
	    WebElement finishButton;

	    // Checkout Complete Locators
	    @FindBy(className = "complete-header")
	    WebElement thankYouMessage;

	    // Checkout Step One Methods
	    public void enterFirstName(String firstName) {
	        firstNameInput.sendKeys(firstName);
	    }

	    public void enterLastName(String lastName) {
	        lastNameInput.sendKeys(lastName);
	    }

	    public void enterZipCode(String zipCode) {
	        zipCodeInput.sendKeys(zipCode);
	    }

	    public void clickContinue() {
	        continueButton.click();
	    }

	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }

	    public void fillCheckoutInformation(String firstName, String lastName, String zipCode) {
	        enterFirstName(firstName);
	        enterLastName(lastName);
	        enterZipCode(zipCode);
	        clickContinue();
	    }

	    // Checkout Step Two Methods
	    public String getItemNameInOverview() {
	        return itemNameInCheckout.getText();
	    }

	    public String getItemTotal() {
	        return itemTotalLabel.getText();
	    }

	    public void clickFinish() {
	        finishButton.click();
	    }

	    // Checkout Complete Methods
	    public String getThankYouMessage() {
	        return thankYouMessage.getText();
	    }

}

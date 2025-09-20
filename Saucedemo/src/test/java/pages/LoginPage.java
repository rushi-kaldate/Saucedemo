package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	
    // Locators (Page ke elements find karne ke liye)
    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    WebElement errorMessage;

    // Methods (Actions jo is page par kar sakte ho)
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    // Ek hi method mein complete login
    public void loginToApp(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();

}
}


package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.BaseTest;

import pages.InventoryPage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        // Test Steps
        loginPage.loginToApp("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        // Verification (Assertion)
        Assert.assertTrue(inventoryPage.getProductCount() > 0, "Login failed, products not displayed.");
    }

    @Test(priority = 2)
    public void invalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp("invalid_user", "secret_sauce");

        String errorMessage = loginPage.getErrorMessage();
        // Verify error message
        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }


}

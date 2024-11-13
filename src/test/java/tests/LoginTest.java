package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class LoginTest {

    @Test
    public void testSuccess() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(); // Fixed typo from loginPagen to loginPage
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        System.out.print("hi");
    }
    @Test
    public void testUnSuccess() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(); // Fixed typo from loginPagen to loginPage
        loginPage.login("Admin", "adm123");
        Assert.assertTrue(loginPage.invalidLog.isDisplayed(), "Invalid login message not displayed");
    }

    // @AfterMethod
    // public void tearDown() {
    //    Driver.closeDriver(); // Ensure driver closes after each test
    // }
}

package tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class LoginTests {
    static WebDriver driver;
    @BeforeMethod
            public void before(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    LoginPage loginPage = new LoginPage();

    @Test
    public void testSuccessfulLogin(){
        loginPage.login("Admin","admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }
    @Test
    public void testUnsuccessfulLogin(){
        loginPage.login("Admin","bug");
        Assert.assertTrue(loginPage.invalidLoginText.isDisplayed());

    }
}

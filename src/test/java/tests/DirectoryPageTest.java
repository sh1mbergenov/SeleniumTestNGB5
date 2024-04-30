package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.Duration;

public class DirectoryPageTest {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();
    DirectoryPage directoryPage = new DirectoryPage();
    @Test
    public void directoryTest(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        loginPage.login("Admin","admin123");
        SeleniumUtils.waitForSeconds(5);
        commonPage.directoryTab.click();
        directoryPage.jobTitle.click();
//        JavascriptExecutor js =  (JavascriptExecutor)  driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", directoryPage.hrManager);
//        SeleniumUtils.waitForSeconds(5);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(directoryPage.hrManager));
        directoryPage.hrManager.click();
        directoryPage.searchButton.click();


    }
}

package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;
import pages.PimPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class CreateEmployee {
    static WebDriver driver;
    LoginPage loginPage = new LoginPage();
   CommonPage commonPage = new CommonPage();
   PimPage pimPage = new PimPage();
    @Test
    public void addEmployee() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        loginPage.login("Admin","admin123");
        Thread.sleep(5000);
        commonPage.pimTab.click();
        pimPage.addEmployee();
        Thread.sleep(4000);
        String expectedName = pimPage.fName + " " + pimPage.lName;
        SeleniumUtils.verifyTextInElement(driver,20, pimPage.fullNameText, expectedName);
        commonPage.pimTab.click();
         Thread.sleep(5000);
        WebElement firstNameInTable = driver.findElement(By.xpath("//div[text()='"+ pimPage.empId+"']/../following-sibling::div[1]"));
        WebElement lastnameInTable = driver.findElement(By.xpath("//div[text()='"+pimPage.empId+"']/../following-sibling::div[2]"));
        WebElement empIDInTable = driver.findElement(By.xpath("//div[text()='"+pimPage.empId +"']"));
        SeleniumUtils.verifyTextInElement(driver,20,empIDInTable,pimPage.empId);
        SeleniumUtils.verifyTextInElement(driver,20,firstNameInTable,pimPage.fName);
        SeleniumUtils.verifyTextInElement(driver,20,lastnameInTable,pimPage.lName);








    }
}

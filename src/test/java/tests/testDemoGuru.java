package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99PageNewCustomer;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class testDemoGuru {
    static WebDriver driver;
    Guru99PageNewCustomer page = new Guru99PageNewCustomer();
    @Test
    public void test(){
        driver = Driver.getDriver();
        driver.get(Config.getProperty("guruTest"));
        page.newCustomer.click();
        driver.switchTo().alert().dismiss();
        page.name.sendKeys("admin");
        Actions actions = new Actions(driver);
        actions.keyDown(page.name, Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND);
        actions.keyDown(page.name,Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE);
        actions.build().perform();
        Assert.assertEquals(page.message.getText(),Config.getProperty("expectedMessage"));


    }
}

package tests.exampleWebsites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class EtsyTest {
    @Test(groups = {"sanity"})
    public void etsyTest1(){
        new ChromeDriver().get("https://www.amazon.com/");
    }
    @Test
    public void etsyTest2(){
        System.out.println("This is test 2 of etsy");
        SeleniumUtils.waitForSeconds(5);
    }
    @Test(groups = {"login"})
    public void etsyTest3(){
        System.out.println("This is test 3 of etsy");
        SeleniumUtils.waitForSeconds(5);
    }
    @Test(groups = {"logins"})
    public void login1(){
        System.out.println("login etsy test 1");
    }
    @Test(groups = {"logins"})
    public void login2(){
        System.out.println("login etsy test 2");
    }

}

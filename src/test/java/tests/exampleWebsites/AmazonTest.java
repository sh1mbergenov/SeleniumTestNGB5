package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTest {
    @BeforeTest(groups = "logins")
    public static void beforeTest(){
        System.out.println("BEFORE TEST IN AMAZON");
    }
    @Test(groups = {"sanity"})
    public void amazonTest1(){
      new ChromeDriver().get("https://www.amazon.com/");
    }
    @Test(groups = {"login"})
    public void amazonTest2(){
        System.out.println("This is test 2 of amazon");
        SeleniumUtils.waitForSeconds(5);
    }
    @Test
    public void amazonTest3(){
        System.out.println("This is test 3 of amazon");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test(groups = {"logins"})
    public void login1(){
        System.out.println("login amazon test 1");
    }
    @Test(groups = {"logins"})
    public void login2(){
        System.out.println("login amazon test 2");
    }
    @AfterTest(groups = "logins")
    public static void afterTest(){
        System.out.println("AFTER TEST IN AMAZON");
    }
}

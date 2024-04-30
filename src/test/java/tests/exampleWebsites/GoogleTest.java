package tests.exampleWebsites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTest {

    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("THIS IS BEFORE SUITE METHOD IN TestNG");
    }
    @Test
    public void googleTest1(){
        new ChromeDriver().get("https://www.google.com/");
    }
    @Test(groups = {"login"})
    public void googleTest2(){
        System.out.println("This is test 2 of goggle");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test(groups = {"sanity"})
    public void googleTest3(){
        System.out.println("This is test 3 of google");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test(groups = {"logins"})
    public void login1(){
        System.out.println("login google test 1");
    }
    @Test(groups = {"logins"})
    public void login2(){
        System.out.println("login google test 2");
    }
    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("THIS IS AFTER SUITE INSIDE GOOGLE");
    }
}

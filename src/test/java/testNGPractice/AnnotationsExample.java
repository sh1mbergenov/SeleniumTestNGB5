package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExample {
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("Setting up the suite environment.");
    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("Configuring test environment");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Loading class resources.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup.");
    }
    @Test
    public void test1(){
        Assert.assertTrue(5>4);
    }
    @Test
    public void test2(){
     Assert.assertEquals(10-5,5);
    }
    @Test
    public void test3(){
     Assert.assertFalse(20>20);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Cleaning up after test method");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Releasing class resources.");
    }
    @AfterTest
    public static void afterTest(){
        System.out.println("Tearing down test environment");
    }
    @AfterSuite
    public static void afterSuite(){
        System.out.println("Cleaning up the suite environment");
    }
}

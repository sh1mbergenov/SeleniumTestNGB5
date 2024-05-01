package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {

    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("THIS IS BEFORE TEST METHOD IN TestNG");
    }
    @AfterTest
    public static void afterTestMethod(){
        System.out.println("THIS IS AFTER TEST IN TestNG ");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is BEFORE CLASS");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("I am test 1");
        Assert.assertTrue(22>19);
    }

    @Test
    public void test2(){
        System.out.println("I am test 2");
    }
    @Test
    public void test3(){
        System.out.println("I am test 3");
    }
    @Test
    public void test4(){
        System.out.println("I am test 4");
    }


}

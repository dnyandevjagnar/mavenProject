package TestNGproject.annotations;

import org.testng.annotations.*;

public class LifeCycleOfAllAnnotationsExample {
    // Test Case 1
    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }// Test Case 2

    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");

    }
}
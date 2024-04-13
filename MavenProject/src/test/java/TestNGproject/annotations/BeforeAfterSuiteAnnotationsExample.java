package TestNGproject.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuiteAnnotationsExample {
    @Test
    public void testCase2(){
        System.out.println("Test case 2 ");
    }
    @Test
    public void testCase3(){
        System.out.println("Test case 3 ");
    }
    @Test
    public void testCase4(){
        System.out.println("Test case 4 ");
    }
    @AfterSuite
    public void testCase5(){//after suite method
        System.out.println("Test case 5 After suite annotations ");
    }
    @BeforeSuite
    public void testCase1(){//before suite method
        System.out.println("Test case 1 Before suite annotations ");
    }

}

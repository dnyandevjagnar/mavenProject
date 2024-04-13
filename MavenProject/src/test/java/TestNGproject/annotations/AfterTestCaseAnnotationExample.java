package TestNGproject.annotations;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AfterTestCaseAnnotationExample {

    @AfterTest
    public void afterTestCaseMethod(){
        System.out.println("After Test annotations ");
    }
    @Test
     public void TestCase1() {
         System.out.println("test Case one");
     }
     @Test
    public void TestCase2() {
         System.out.println("test Case two");
     }
      @Test
    public void TestCase3(){
          System.out.println("test Case three");
      }
    @Test
    public void TestCase4(){
        System.out.println("test Case four");
    }

}
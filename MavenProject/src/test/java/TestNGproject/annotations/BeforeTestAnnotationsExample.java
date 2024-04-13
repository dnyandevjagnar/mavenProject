package TestNGproject.annotations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnnotationsExample {
    WebDriver driver;
    @BeforeTest
    public void beforeTestCaseMethod(){
        System.setProperty("WebDriver,Chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
       driver=new ChromeDriver();

    }
    @Test
    public void testCase1(){
        driver.get("https://www.google.com/");
        System.out.println("test case 1 ");
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase2(){
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        System.out.println("test case 2 ");
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase3(){
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        System.out.println("test case 3 ");
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase4(){
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        System.out.println("test case 4 ");
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase5(){
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        System.out.println("test case 5");
        System.out.println(driver.getTitle());
    }
//    @AfterTest
//    public void afterTestCaseMethod(){
//       System.out.println("after all test");
//        driver.close();
//    }

}

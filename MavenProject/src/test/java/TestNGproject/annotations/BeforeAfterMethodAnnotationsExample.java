package TestNGproject.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotationsExample {
    WebDriver driver;
    @BeforeMethod
    public  void beforeTestCase(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public  void testCase1(){
        driver.get("https://www.google.com/");
    }

    @Test
    public  void testCase2(){
        driver.get("https://mvnrepository.com/search?q=TestNG");
    }

    @AfterMethod
    public void AfterTestCase(){
        driver.close();
    }
}

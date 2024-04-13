package TestNGproject.annotations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassAnnotationsExample {

    WebDriver driver;
    @BeforeClass
    public void beforeClassMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
   public void testCase1(){
        driver.get("https://www.google.com/");

    }
    @Test
    public void testCase2(){

         driver.get("https://mvnrepository.com/search?q=TestNG");
    }
    @AfterClass
    public void afterClassMethod(){
        driver.close();
    }
}


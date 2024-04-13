package TestNGproject.assertionInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestNGExample {
    WebDriver driver;
    SoftAssert softAssert;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
         softAssert=new SoftAssert();
    }
    @Test
    public void test1(){
        //check tittle assertEquals Method Through
        String expectedResult="Practice Page";
        String actualResult=driver.getTitle();
        softAssert.assertEquals(expectedResult,actualResult);
        softAssert.assertAll();
    }
    @Test
    public  void test2(){
        String expectedResult="Practice Page";
        String actualResult=driver.getTitle();
        softAssert.assertEquals(expectedResult,actualResult,"expected result not match");
        softAssert.assertAll();
    }
    @Test
    public  void test3(){
        //verify the tittle in equal method
        String expectedResult="Practice Page";
        String actualResult=driver.getTitle();
        softAssert.assertTrue(expectedResult.equals(actualResult),"false test case");
        softAssert.assertAll();
    }
    @Test
    public void sendTheTextBox(){
        WebElement element=driver.findElement(By.xpath("//input[@id='name']"));
        element.sendKeys("car ");
        element.sendKeys(Keys.ENTER);
    }
    @AfterTest

    public void aftertest(){
        driver.close();
    }

}

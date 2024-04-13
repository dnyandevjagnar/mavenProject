package TestNGproject.assertionInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssetTestNGExample {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        driver.get("https://www.google.com/");
        String expectedResult="Google";
        String actualResult=driver.getTitle();
        Assert.assertEquals(expectedResult,actualResult);//if condition are true then test case two are execute
    }
   @Test
    public  void test2(){
       WebElement element=driver.findElement(By.xpath("//textarea[@name='q']"));
       element.sendKeys("car ");
       element.sendKeys(Keys.ENTER);
   }
   @AfterTest
    public void aftertest(){

        driver.close();
   }

}

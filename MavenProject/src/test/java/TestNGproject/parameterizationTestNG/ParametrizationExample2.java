package TestNGproject.parameterizationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationExample2 {
    WebDriver driver;

    @BeforeTest
    public void test1(){
        System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Parameters({"carName","city"})
    @Test
    public void test2(String carName,String city){
        WebElement element= driver.findElement(By.xpath("//textarea[@name='q']"));
        element.isEnabled();
        element.sendKeys(carName +" "+ city);
        element.sendKeys(Keys.ENTER);
        driver.close();
    }
}

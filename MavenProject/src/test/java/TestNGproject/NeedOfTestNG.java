package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTestNG {

@Test
   public void demoMethod_1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.close();
    }
    @Test
    public void demoMethod_2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/search?q=TestNG");

        WebElement element=driver.findElement(By.id("query"));
        element.click();

        driver.close();
    }
}

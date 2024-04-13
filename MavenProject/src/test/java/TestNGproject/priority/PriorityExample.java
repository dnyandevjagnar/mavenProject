package TestNGproject.priority;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PriorityExample {
    WebDriver driver;
    @Test(priority = 1)
    public void upcastingMethod(){
        System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
    };
    @Test(priority = 2)
    public void sendURL(){
      driver.get("https://www.letskodeit.com/practice");
    };
    @Test(priority = 3)
    public void findElementMethod(){
     WebElement element= driver.findElement(By.id("openwindow"));
     element.sendKeys(Keys.ENTER);
    };
    @Test(priority = 4)
    public void listOfElementMethod(){
        List<WebElement> element=driver.findElements(By.xpath("//option[text()='All']"));
        for(WebElement w:element){
            System.out.println(w.getText());
        }
    };
    @Test(priority = 5)
    public void closingMethod(){

        driver.close();
    };
}

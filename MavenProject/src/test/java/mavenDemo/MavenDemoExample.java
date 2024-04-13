package mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDemoExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saideep\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        element.sendKeys("car");
        element.click();
        System.out.println(driver.getTitle());

        driver.close();
    }
}

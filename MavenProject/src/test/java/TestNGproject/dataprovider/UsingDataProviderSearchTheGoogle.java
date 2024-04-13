package TestNGproject.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProviderSearchTheGoogle {

    @DataProvider
    public Object[][] dataProvideMethod(){
        return new Object[][] {{"java","pune"}, {"full stack","nashik"},{"python","mumbai" }};

    }
    @Test(dataProvider = "dataProvideMethod")
    public void test1(String courseName,String city){
            System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//textarea[@name='q']"));
        element.sendKeys(courseName+" "+city);
        element.sendKeys(Keys.ENTER);
        driver.close();

        }

}

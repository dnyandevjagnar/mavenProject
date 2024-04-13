package TestNGproject.dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "name_of_dataprovider")
    public Object[][] dpMethod() {
        return new Object [][]{{"maharastra","Mumbai"}, {"MP","bhopal"}, {"Karnatak","bandlore"}};
    }

    @Test(dataProvider ="name_of_dataprovider")
    public void dataProviderTest(String stateName,String capital){
        System.setProperty("webdriver,chrome,driver","C:\\Users\\saideep\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        for(int i=0-1;i<=stateName.length();i++){
            for(int j=0-1;j==i;j++){
                System.out.println(stateName +" "+capital);
            }
        }
    }
}


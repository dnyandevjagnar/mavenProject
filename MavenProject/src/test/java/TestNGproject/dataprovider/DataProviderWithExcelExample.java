package TestNGproject.dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelExample {

    @DataProvider
    public Object[][] dataProvideMethod() throws IOException {
       Object[][] arrObj =getExcelSheetData("F:\\EDSO\\Edso\\Automation testing\\TestNG\\dataprovider.xlsx ","test1sheet");

       return arrObj;

    }
    public Object[][] getExcelSheetData(String filepath,String sheetName)throws IOException {
        FileInputStream fileInputStream=new FileInputStream(filepath);  //file name access
        XSSFWorkbook EB=new XSSFWorkbook(fileInputStream);    //Excel sheet access
        XSSFSheet sheet=EB.getSheet(sheetName);               //sheet Name access
        XSSFRow row=sheet.getRow(0);
        int NoOfRows=sheet.getPhysicalNumberOfRows();
        int NoOfColoums= row.getLastCellNum();
        Cell cell;
        String[][] data=new String[NoOfRows][NoOfColoums];

        for(int i=1;i<NoOfRows;i++){
            for(int j=0;j<NoOfColoums;j++){
                row =sheet.getRow(i);
                cell =row.getCell(j);
                data[i-1][j]=cell.getStringCellValue();

            }
        }
        return data;
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

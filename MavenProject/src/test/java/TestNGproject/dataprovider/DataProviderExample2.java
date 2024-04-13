package TestNGproject.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
    @DataProvider(name = "dataProvider")
    public Object[][] dataProvideMethod(){
        return new Object[][] {{"EDSO"}, {"Services"}};
    }

    @Test(dataProvider = "dataProvider")
    public void myTest (String value) {
        System.out.print( " "+ value);
    }
}

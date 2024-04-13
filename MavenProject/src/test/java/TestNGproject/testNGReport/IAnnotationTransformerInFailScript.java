package TestNGproject.testNGReport;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IAnnotationTransformerInFailScript implements IRetryAnalyzer {
   int retryCount=0;
    int maxCount=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount < maxCount){
            retryCount++;
            return true;
        }
        return false;
    }
}

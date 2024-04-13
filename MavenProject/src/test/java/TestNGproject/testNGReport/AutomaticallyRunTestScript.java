package TestNGproject.testNGReport;


import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public abstract class AutomaticallyRunTestScript implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
           annotation.setRetryAnalyzer(IAnnotationTransformerInFailScript.class);
    }


}

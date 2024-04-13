package TestNGproject.annotationAttribute;

import org.testng.annotations.Test;

public class InvocationCountExample {
    int a=1;
    @Test(invocationCount =3)
    public  void test1(){
        System.out.println("Test 1 =Execution count="+a++);

    }
    @Test
    public  void test2(){
        System.out.println("Test 2");
    }
    @Test
    public  void test3(){
        System.out.println("Test 3");
    }
    @Test
    public  void test4(){
        System.out.println("Test 4");
    }


}

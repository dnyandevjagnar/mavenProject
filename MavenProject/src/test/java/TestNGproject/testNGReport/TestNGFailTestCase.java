package TestNGproject.testNGReport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailTestCase {
    @Test
    public void test1(){
        System.out.println("test case 1");
    }

    @Test
    public void test2(){

        Assert.assertTrue(false);
        System.out.println("test case 2");
    }

    @Test
    public void test3(){
        System.out.println("test case 3");
    }

    @Test
    public void test4(){
        Assert.assertTrue(false);
        System.out.println("test case 4");
    }

    @Test
    public void test5(){
        System.out.println("test case 5");
    }

    @Test
    public void test6() {
        System.out.println("test case 6");
    }
}

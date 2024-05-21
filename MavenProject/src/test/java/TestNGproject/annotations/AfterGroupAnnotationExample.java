package TestNGproject.annotations;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class AfterGroupAnnotationExample {

    @Test(groups = {"Agile"})
    public void development(){
        // Assert.assertTrue(false);
        System.out.println("developer");
    }

    @Test(groups = {"Agile"})
    public void testing(){
        System.out.println("Tester");
    }

    @Test
    public void hr(){
        System.out.println("H R");
    }

    @Test(groups = {"Agile"})
    public void scrumMaster(){
        System.out.println("Scrum Master");
    }

    @Test(groups = {"Agile"})
    public void projectOwner(){
        System.out.println("Project Owner");
    }

    @Test
    public void account(){
        System.out.println("Account manager");
    }
     @Test
    public void account2(){
        System.out.println("Account2 manager");
    }
    @AfterGroups(groups = "Agile")
    public void afterGroupMethod() {
        Assert.assertTrue(false);
        System.out.println("Agile Team member");
    }

    }

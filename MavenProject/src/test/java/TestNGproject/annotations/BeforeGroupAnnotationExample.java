package TestNGproject.annotations;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupAnnotationExample {

    @BeforeGroups(groups = "Agile")
    public void beforeGroupMethod(){
       // Assert.assertTrue(false);
        System.out.println("Agile Team member");
    }

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


}

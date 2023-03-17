package TestNGProrityDemo;

import org.testng.annotations.Test;

public class TestNGDependencies {
   //  @Test(dependsOnMethods ={"display2"},priority = 1)
   @Test(dependsOnGroups = "Sanity.*")
    public void display1()
    {
        System.out.println("Inside display1");
}

// @Test(priority = 2)
@Test(groups = {"Sanity1"})
public void display2()
    {

        System.out.println("Inside display2");
    }

    @Test(groups = {"Sanity2"})
    public void display3()
    {

        System.out.println("Inside display3");
    }
}


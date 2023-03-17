package TestNGProrityDemo;

import org.testng.annotations.Test;
@Test(groups={"AllClassTests"})
public class GroupingDemo {

    @Test(groups={"Sanity","Smoke"})
    public void Test()
    {
        System.out.println("Inside Test 1");
    }
    @Test(groups={"windows.Sanity"})
    public void Test2()
    {
        System.out.println("Inside Test 2");
    }
    @Test(groups={"windows.Smoke"})
    public void Test3()
    {
        System.out.println("Inside Test 3");
    }
}

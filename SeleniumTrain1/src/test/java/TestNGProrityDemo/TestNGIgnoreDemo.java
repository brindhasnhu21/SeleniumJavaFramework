package TestNGProrityDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGIgnoreDemo {
   // @Ignore
    @Test
    public void test1()
    {
        System.out.println("Inside Test 1");
    }
    @Test
    public void test2()
    {
        System.out.println("Inside Test 2");
    }
}

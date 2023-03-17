package TestNGListeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
// This class created to try the testNG.xml with listeners
public class TestListenersDemo2 {
    @Test
    public void test4()
    {
        System.out.println("inside Test4");
    }
    @Test
    public void test5()
    {
        System.out.println("inside Test5");
        Assert.assertTrue(false);
    }
    @Test
    public void test6()
    {
        System.out.println("inside Test6");
        throw new SkipException("this test is skipped");
    }
}

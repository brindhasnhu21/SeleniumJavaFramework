package TestNGListeners;

import org.junit.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.Test;

public class TestRetryAnalyser {
    @Test(retryAnalyzer = TestNGListeners.RetryAnalyzerDemo.class)
    public void test4()
    {
        System.out.println("inside Test4");
    }
    @Test(retryAnalyzer = TestNGListeners.RetryAnalyzerDemo.class)
    public void test5()
    {
        System.out.println("inside Test5");
        Assert.assertTrue(false);
    }
}

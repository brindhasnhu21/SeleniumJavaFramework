package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Test is starting" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("#####Test is success" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("#####Test Failed" + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("#####Test is skipped" + result.getName());
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("#####Test is starting" + result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
        System.out.println("#####Test failed with timeout"+result.getName());
    }


    public void onStart(ITestContext context) {
        System.out.println("#####Test Suite is starting" + context.getName());

    }
}

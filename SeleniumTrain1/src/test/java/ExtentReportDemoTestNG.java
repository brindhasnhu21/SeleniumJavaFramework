import Pages.GoogleSearchPageObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReportDemoTestNG {
    ExtentSparkReporter reports;
    ExtentReports extent;
    ExtentTest test1;
    public WebDriver driver=null;

    @BeforeSuite
public void setup()
{
    reports = new ExtentSparkReporter("demoReportTestng.html");
    extent=new ExtentReports();
    extent.attachReporter(reports);
    test1=extent.createTest("Extentreporttest","this is the extent report test");
    driver=new ChromeDriver();
}


@Test
    public void googleSearchTest() {
    driver.get("https://google.com");
    test1.info("starting of the google search");
    GoogleSearchPageObjects search_obj = new GoogleSearchPageObjects(driver);
    search_obj.setTextInSearchBox("TEST IN extenereport TESTNG");
    test1.pass("Google search Completed testng");
}

    @Test
    public void googleSearchTest_Fail() {
        driver.get("https://google.com");
        test1.info("starting of the google search Fail");
        test1.fail("Google search Completed testng-FAILED");
        //  driver.manage().timeouts().wait(30);
        //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //   search_obj.signGoogleIgnore();
        //  search_obj.clickSearchButton();
    }
@AfterSuite
public void tearDown()
{
        driver.close();
        extent.flush();

    }
}

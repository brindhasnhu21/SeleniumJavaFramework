import Pages.GoogleSearchPageObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportDemo {


    private static WebDriver driver=null;
    public static void main(String[] args) {
googleSearchTest();
    }
    public static void googleSearchTest(){
        ExtentSparkReporter reports = new ExtentSparkReporter("demoReport.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reports);
        ExtentTest test1=extent.createTest("Extentreporttest","this is the extent report test");

        //ExtentTest test = reports.startTest("TestName");
        driver=new ChromeDriver();
        driver.get("https://google.com");
        test1.info("starting of the google search");
        GoogleSearchPageObjects search_obj= new GoogleSearchPageObjects(driver);
        search_obj.setTextInSearchBox("TEST IN POM 2");
        test1.pass("Google search Completed");
       //  driver.manage().timeouts().wait(30);
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //   search_obj.signGoogleIgnore();
      //  search_obj.clickSearchButton();
        driver.close();
        extent.flush();

    }
}

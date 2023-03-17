import Pages.GoogleSearchPageObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleSearchPageTestNG2 {
    private static WebDriver driver=null;
   public static void main(String[] args) {
        googleSearchTest2();
    }
    @BeforeTest
    public void setup()
    {
        driver=new ChromeDriver();

    }

    @Test
    public static void googleSearchTest2(){
        driver.get("https://google.com");
        GoogleSearchPageObjects search_obj= new GoogleSearchPageObjects(driver);
        search_obj.setTextInSearchBox("TESTNG Test Class 2");
        //  driver.manage().timeouts().wait(30);
        //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //   search_obj.signGoogleIgnore();
        //  search_obj.clickSearchButton();

    }

    @Test
    public static void googleSearchTest3() {
        driver.get("https://google.com");
        GoogleSearchPageObjects search_obj = new GoogleSearchPageObjects(driver);
        search_obj.setTextInSearchBox("TESTNG Test Class 3");
    }
    @AfterTest
    public void sessionClose()
    {
        driver.close();
    }
}

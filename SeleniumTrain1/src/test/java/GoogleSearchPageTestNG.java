import Pages.GoogleSearchPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class GoogleSearchPageTestNG {

    WebDriver driver=null;
    String browser_property=null;
    @BeforeTest
    public void setup()
    {
        driver=new ChromeDriver();
       String path = System.getProperty("user.dir");
     Properties prop=new Properties();
         try {
            InputStream input = new FileInputStream(path + "/src/test/java/Properties/config.properties");
            prop.load(input);
            browser_property = prop.getProperty("browser");
            System.out.println("Browser from properties" + browser_property);
            if(browser_property.equalsIgnoreCase("chrome"))
                driver=new ChromeDriver();

        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
            e.printStackTrace();
        }

    }

@Test
    public void googleSearchTest(){
    driver.get("https://google.com");
         GoogleSearchPageObjects search_obj= new GoogleSearchPageObjects(driver);
        search_obj.setTextInSearchBox("TESTNG Test Class 1");
       //  driver.manage().timeouts().wait(30);
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //   search_obj.signGoogleIgnore();
      //  search_obj.clickSearchButton();

    }

    @AfterTest
    public void sessionClose()
    {
        driver.close();
    }
}

import Pages.GoogleSearchPageObjects;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPageTest {
    private static WebDriver driver=null;
    public static void main(String[] args) {
googleSearchTest();
    }
    public static void googleSearchTest(){
        driver=new ChromeDriver();
        driver.get("https://google.com");
        GoogleSearchPageObjects search_obj= new GoogleSearchPageObjects(driver);
        search_obj.setTextInSearchBox("TEST IN POM 2");
       //  driver.manage().timeouts().wait(30);
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //   search_obj.signGoogleIgnore();
      //  search_obj.clickSearchButton();
        driver.close();

    }
}

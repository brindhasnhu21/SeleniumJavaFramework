package TestNGProrityDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultipleTests {
    WebDriver wd = null;
    @Parameters("browser_name")
    @BeforeTest
        public void setBrowser(String browser_name) {
        if (browser_name.equalsIgnoreCase("Chrome")) {
            wd = new ChromeDriver();
            System.out.println("Browser is Chrome");
            System.out.println("Thread id"+Thread.currentThread().getId());
        } else if (browser_name.equalsIgnoreCase("Firefox")) {
            wd = new FirefoxDriver();
            System.out.println("Browser is Firefox");
            System.out.println("Thread id"+Thread.currentThread().getId());
        }
        /*else {
            wd = new InternetExplorerDriver();
            System.out.println("Browser is IE");
        }*/
    }

        @Test
        public void openGoogle()
        {
            wd.get("https://google.com");
        }

        @AfterTest
        public void teardown()
        {
            wd.close();
            System.out.println("Test Completed Successfully");
        }
    }


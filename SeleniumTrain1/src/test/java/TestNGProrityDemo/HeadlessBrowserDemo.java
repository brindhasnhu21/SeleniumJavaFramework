package TestNGProrityDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserDemo {

@Test
    public void openHeadlessBrowser()
    {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--headless");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://google.com");
        System.out.println("Title of the page open" +driver.getTitle());
        System.out.println("Completed");
       }
}

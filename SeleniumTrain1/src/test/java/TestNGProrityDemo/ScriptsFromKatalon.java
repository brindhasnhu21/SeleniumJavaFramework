package TestNGProrityDemo;
import java.time.Duration;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScriptsFromKatalon {
    private WebDriver driver;
    private  WebDriverWait wait;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
     //   System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
      /*  baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;*/
    }



    @Test
    public void LoginTestCase() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Below 2 lines are for implicit wait options one is deprecated teh other one active
        //  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);- this one is deprecated
  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Below 2 lines are for explicit wait lines both are needed
    //    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
    //    WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));

            //FLUENT WAIT Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.

   /*    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement web_elem = wait.until(driver -> {
            //return driver.findElement(By.name("username"));
            return driver.findElement(By.xpath("//button[@type='submit']"));
        });*/

        //// NOT WORKING have to do research-But we can use above explicit wait
  //WebElement submit_button=By.xpath("//button[@type='submit']");
    // WebElement element_submit= wait.until(ExpectedConditions.visibilityOf(submit_button));
     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      //  wait.until(ExpectedConditions.visibilityOf(submit_button));


     //   driver.findElement(By.name("username")).click();
      //  driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/i")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


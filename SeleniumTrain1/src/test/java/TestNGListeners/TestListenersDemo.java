package TestNGListeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
// Uses Listeners
 @Listeners(TestNGListeners.TestListeners.class)
public class TestListenersDemo {
    @Test
    public void test1()
    {
        System.out.println("inside Test1");
    }
    @Test
    public void test2()
    {
        System.out.println("inside Test2");
        //Assert.assertTrue(false);
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("Automation");
        search.sendKeys(Keys.RETURN);
    }
    @Test
    public void test3()
    {
        System.out.println("inside Test3");
        throw new SkipException("this test is skipped");
    }
}

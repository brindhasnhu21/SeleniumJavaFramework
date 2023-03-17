import org.checkerframework.checker.builder.qual.ReturnsReceiver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
googleSearch();
    }
    public static void googleSearch()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("Automation");
        search.sendKeys(Keys.RETURN);
    }
}

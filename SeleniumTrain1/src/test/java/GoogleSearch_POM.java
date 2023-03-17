import Pages.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch_POM {
    private static WebDriver driver=null;
    public static void main(String[] args) {
googleSearch();
    }
    public static void googleSearch()
    {
      driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search= GoogleSearchPage.SearchTextBox(driver);
        search.sendKeys("Automation in Testing");
        WebElement search_button= GoogleSearchPage.SearchButton(driver);
//        search_button.click(); Search will hide serach button so going for return option
        search_button.sendKeys(Keys.RETURN);
    }
}

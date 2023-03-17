package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    WebElement element=null;
    public static WebElement SearchTextBox(WebDriver driver)
    {
        WebElement element=driver.findElement(By.xpath("//input[@title='Search']"));
                return element;
    }
    public static WebElement SearchButton(WebDriver driver)
    {
        WebElement element=driver.findElement(By.name("btnK"));
        return element;
    }
}

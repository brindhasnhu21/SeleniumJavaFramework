package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {

WebDriver driver=null;
    By search_textbox= By.name("q");
    By search_button= By.name("btnK");
public GoogleSearchPageObjects(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setTextInSearchBox(String text)
    {
        driver.findElement(search_textbox).sendKeys(text);
    }
public void clickSearchButton() {
    WebElement sbutton = driver.findElement(search_button);
    sbutton.sendKeys(Keys.RETURN);
}
              public void signGoogleIgnore()
    {
        WebElement nothanks=driver.findElement(By.xpath("//button[@aria-label='No thanks']"));
        nothanks.click();
}
}


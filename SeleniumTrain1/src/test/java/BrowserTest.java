import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
    public static void main(String[] args) {

// chrome Driver

      WebDriver driver=new ChromeDriver();
      //  driver.get("https://seleniumhq.org/");
driver.get("https://collui-test1.snhu.edu/ui/home/index.html");
        WebElement username= driver.findElement(By.id("UserID"));
        username.sendKeys("dhanabbr");
        WebElement userpass= driver.findElement(By.id("UserPassword"));
        userpass.sendKeys("Testing1235!");
        WebElement login_btn= driver.findElement(By.id("btnLogin"));
        login_btn.click();
      //        Firefox driver
      /*  WebDriver driver=new FirefoxDriver();
        driver.get("http://seleniumhq.org/");*/

               /* WebDriver driver=new InternetExplorerDriver();
        driver.get("http://seleniumhq.org/");*/

        //to get the project path
        String projectPath=System.getProperty("user.dir");
        System.out.println("project path"+projectPath);
    }
}

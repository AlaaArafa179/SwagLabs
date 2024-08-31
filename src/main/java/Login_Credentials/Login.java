package Login_Credentials;
import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static WebDriver driver=Webdriverfactory.getDriver();

    public static void Open (){

        driver.get("https://www.saucedemo.com/");
    }

    public static void login (String username , String password) {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}

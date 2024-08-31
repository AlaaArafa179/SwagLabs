package Login_Credentials;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

    public static WebDriver driver= Webdriverfactory.getDriver();

    public static void logout(){

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}

package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverfactory {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {

            // Initialize ChromeDriver
            driver = new ChromeDriver();
        }
        return driver;
    }
}
package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;

    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void click(By element) {
        driver.findElement(element).click();
    }

    public static void sendKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public static boolean isDisplayed(By element) {
        try {
            driver.findElement(element).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}

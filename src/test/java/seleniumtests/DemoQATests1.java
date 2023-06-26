package seleniumtests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.PODemoQATests1;

public class DemoQATests1 {
    protected WebDriver driver;

    @Test
    public void checkButtons() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.cssSelector(".text")).click();
    }

    @Test
    public void checkClickOn() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//
        new PODemoQATests1(driver) {
        };
            driver.close();
            driver.quit();
        }
    }



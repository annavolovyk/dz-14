package seleniumtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.PODemoQATests2;

public class DemoQATests2 {
    protected WebDriver driver;

    @Test
    public void checkWebPages() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        new PODemoQATests2(driver) {
        };
        driver.close();
        driver.quit();
    }
}

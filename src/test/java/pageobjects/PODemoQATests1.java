package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PODemoQATests1 extends DurationPageObject {

    private final By buttonsMenu = By.xpath("//span[text()='Buttons']");
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By messageText = By.cssSelector("#dynamicClickMessage");
    public PODemoQATests1(WebDriver driver) {
        super();
        driver.get("https://www.saucedemo.com/");
    }
    public MainPage runFirstTests(){
        getElement(buttonsMenu).click();
        getElement(clickMeButton).click();
        getElement(messageText);
        return new MainPage(driver);
    }
}

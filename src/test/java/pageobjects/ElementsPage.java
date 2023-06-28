package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends DurationPageObject {

    private final By buttonsMenu = By.xpath("//span[text()='Buttons']");
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By messageText = By.cssSelector("#dynamicClickMessage");
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://demoqa.com/elements");
    }
    public MainPage runFirstTests(){
        getElement(buttonsMenu).click();
        getElement(clickMeButton).click();
        getElement(messageText);
        return new MainPage(driver);
    }
}

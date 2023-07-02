package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;


public class ButtonsPage extends AbstractPageObject {
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By messageText = By.cssSelector("#dynamicClickMessage");
    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://demoqa.com/buttons");
    }
    public void clickOnClickMeButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(clickMeButton));
        getElement(clickMeButton).click();
    }
    public String checkTheTextMessage(String text){
        getElement(messageText).sendKeys(text);
        return text;
    }
}


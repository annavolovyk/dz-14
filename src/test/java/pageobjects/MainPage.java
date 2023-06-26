package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends DurationPageObject {
    private final By headerText = By.cssSelector(".main-header");

    public MainPage(WebDriver driver) {
        super();
    }

    public String getTitleText() {
        return getElement(headerText).getText();
    }

}
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ElementsPage extends AbstractPageObject {

    private final By buttonsMenu = By.xpath("//span[text()='Buttons']");
    public ElementsPage (WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://demoqa.com/elements");
    }
    public void clickOnButtons () {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(buttonsMenu));
        getElement(buttonsMenu).click();
    }
}

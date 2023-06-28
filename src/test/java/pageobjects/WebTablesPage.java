package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends DurationPageObject {
    private final By addButton = By.xpath("//button[contains(text(),'Add')]");
    private final By enterFirstName = By.xpath("//input[@id='firstName']");
    private final By enterLastName = By.xpath("//input[@id='lastName']");
    private final By enterEmail = By.xpath("//input[@id='userEmail']");
    private final By enterAge = By.xpath("//input[@id='age']");
    private final By enterSalary = By.xpath("//input[@id='salary']");
    private final By enterDepartment = By.xpath("//input[@id='department']");
    private final By submitButton = By.xpath("//button[@id='submit']");
    private final By checkRecord = By.xpath("//td[contains(text(),'%s')]/following-sibling::td[contains(text(),'%s')]/following-sibling::td[contains(text(),'%s')]");
    private final By editRecord = By.xpath("//input[@id='salary']");


    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://demoqa.com/webtables");
    }
    public MainPage runSecondTests(){
        getElement(addButton).click();
        getElement(enterFirstName).sendKeys("John");
        getElement(enterLastName).sendKeys("Smith");
        getElement(enterAge).sendKeys("65");
        getElement(enterEmail).sendKeys("johnsmith@gmail.com");
        getElement(enterSalary).sendKeys("6000$");
        getElement(enterDepartment).sendKeys("Medicine");
        getElement(submitButton).click();
        getElement(checkRecord).getAttribute("John");
        getElement(editRecord).clear();
        getElement(editRecord).sendKeys("500$");
        return new MainPage(driver);
    }
}

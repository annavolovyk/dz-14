package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WebTablesPage extends AbstractPageObject {
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
    public void clickOnAddButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(addButton));
        getElement(addButton).click();
    }

    public void enterData(String firstname, String lastname, String age, String email, String salary, String department){
        getElement(enterFirstName).sendKeys(firstname);
        getElement(enterLastName).sendKeys(lastname);
        getElement(enterAge).sendKeys(age);
        getElement(enterEmail).sendKeys(email);
        getElement(enterSalary).sendKeys(salary);
        getElement(enterDepartment).sendKeys(department);
    }


    public void clickOnSubmitButton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(submitButton));
        getElement(submitButton).click();}


        public void addRecordToRegistrationForm(String firstname, String anothersalary){
            getElement(checkRecord).getAttribute(firstname);
            getElement(editRecord).clear();
            getElement(editRecord).sendKeys(anothersalary);
        }
}
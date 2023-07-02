package seleniumtests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebTablesPage;

import java.util.concurrent.TimeoutException;

public class WebTablesPageTests extends BaseTest {
    private final static String FIRSTNAME = "Cierra";
    private final static String LASTNAME = "Vega";
    private final static String AGE = "39";
    private final static String EMAIL = "cierra@example.com";
    private final static String SALARY = "10000";
    private final static String DEPARTMENT = "Insurance";
    private final static String ANOTHERNAME = "John";
    private final static String ANOTHERSALARY = "100";

    @Test
    public void checkAddButton() {
        new WebTablesPage(driver).clickOnAddButton();
        boolean isButtonClicked = driver.findElement(By.xpath("//button[contains(text(),'Add')]")).getAttribute("class").contains("active");
        Assert.assertTrue(isButtonClicked, "The Add button is clicked");
    }

    @Test
    public void checkEnteredData(){
        new WebTablesPage(driver).enterData(FIRSTNAME, LASTNAME,AGE,EMAIL,SALARY, DEPARTMENT);
        Assert.assertEquals(FIRSTNAME, "Cierra");
    }

    @Test
    public void checkSubmitButton() {
        new WebTablesPage(driver).clickOnAddButton();
        boolean isButtonClicked = driver.findElement(By.xpath("//button[@id='submit']")).getAttribute("class").contains("active");
        Assert.assertTrue(isButtonClicked, "The Submit button is clicked");
    }
    @Test
    public void checkAddedData () {
        new WebTablesPage(driver).addRecordToRegistrationForm(FIRSTNAME, ANOTHERSALARY);
        String actualRecord = driver.findElement(By.xpath("//td[contains(text(),'" + FIRSTNAME + "')]/following-sibling::td[contains(text(),'" + ANOTHERSALARY + "')]")).getText();
        Assert.assertEquals(actualRecord, FIRSTNAME, ANOTHERSALARY);
    }
}

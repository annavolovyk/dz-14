package seleniumtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementsPage;
import org.openqa.selenium.JavascriptExecutor;

    public class ElementsPageTests extends BaseTest {


        @Test
        public void checkButtonsElement() {
            new ElementsPage(driver)
            .clickOnButtons();
            String expectedURL = "https://demoqa.com/buttons";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL);
        }
    }

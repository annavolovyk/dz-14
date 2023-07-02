package seleniumtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.ElementsPage;

public class ButtonsPageTests extends BaseTest {
    private final static String TEXT = "You have done a dynamic click";

    @Test
    public void checkClickOnMeButton() {
        new ButtonsPage(driver)
                .clickOnClickMeButton();
        String expectedURL = "https://demoqa.com/buttons";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
//    }
    }
    @Test
    public void checkTheText(){
        String expectedMessage = new ButtonsPage(driver).checkTheTextMessage(TEXT);
        Assert.assertEquals("You have done a dynamic click", expectedMessage);
    }
}

package seleniumtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementsPage;

    public class ElementsPageTests extends BaseTest {

        @Test
        public void checkElementsPage() {
            new ElementsPage(driver) {
            };
            Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements", "The user has successfully clicked on button");
        }
    }

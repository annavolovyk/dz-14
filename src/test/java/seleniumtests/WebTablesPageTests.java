package seleniumtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebTablesPage;

public class WebTablesPageTests extends BaseTest {
    @Test
    public void checkWebPages() {
        new WebTablesPage(driver) {
        };
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables", "The user has added and edited data successfully");
    }
}

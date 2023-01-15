package tests.UITests.us02_LoginUser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class NegativeTests {
      Ercan ercanPage=new Ercan();
      Actions actions=new Actions(Driver.getDriver());
    @Test
    public void negative1() {
        //Enter with incorrect email and password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(ercanPage.signup_login.isDisplayed());
        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("incorrectEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());

    }
}

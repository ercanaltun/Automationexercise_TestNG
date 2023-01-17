package tests.UITests.us01_RegisterUser;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;



public class Register {
    Nihat nihatPage = new Nihat();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void TC01() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
       //Verify that home page is visible successfully
        nihatPage.Anasayfa.isDisplayed();
        // Click on 'Signup / Login' button
       nihatPage.SignLoginButton.click();
       // Verify 'New User Signup!' is visible
        nihatPage.NewUser.isDisplayed();
        // Enter name and email address
        nihatPage.Name.sendKeys(faker.name().name());
        actions.sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


    }

}

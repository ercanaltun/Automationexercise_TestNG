package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Nihat {

    public Nihat(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement SignLoginButton;

    @FindBy(xpath = "//*[@id='header']")
    public WebElement Anasayfa;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement NewUser;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement Name;
}

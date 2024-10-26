package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "((//ul[@class='header links'])[1]//a)[2]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "(//button[@name='send'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//span[text()='Welcome, testci tester!'])[1]")
    public WebElement loginConfirmation;

    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement customerMenuDropDown;

    @FindBy(xpath = "((//div[@data-target='dropdown'])[1]//a)[3]")
    public WebElement signOut;

    @FindBy(id = "email-error")
    public WebElement emailErrorText;



    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    public WebElement passwordErrorText;

    @FindBy(css = "[class='action remind']")
    public WebElement forgetPasswordButton;

    @FindBy(css = "[data-ui-id='page-title-wrapper']")
    public WebElement forgetPasswordText;




    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()){
            case "signIn": return this.signIn;
            case "email": return this.email;
            case "password": return this.password;
            case "signInButton": return this.signInButton;
            case "loginConfirmation": return this.loginConfirmation;
            case "customerMenuDropDown": return this.customerMenuDropDown;
            case "signOut": return this.signOut;
            case "forgetPasswordButton": return this.forgetPasswordButton;

        }
        return null;
    }
}

package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement manageAddressesButton;

    @FindBy(xpath = "//span[text()='Add New Address']")
    public WebElement addNewAddressButton;

    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement telephoneInput;

    @FindBy(xpath = "//input[@id='street_1']")
    public WebElement street1Input;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@id='region_id']")
    public WebElement regionIdInput;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement zipInput;

    @FindBy(xpath = "//span[text()='Save Address']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//input[@id='primary_billing']")
    public WebElement defaultBilling;

    @FindBy(xpath = "//input[@id='primary_shipping']")
    public WebElement defaultShipping;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement deleteOk;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement messageText;

    @FindBy(xpath= "//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo']")
    public WebElement arcProduct1;

    @FindBy(xpath= "(//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo'])[2]")
    public WebElement arcProduct2;

    @FindBy(css= "[title='Add to Cart']")
    public WebElement arcAdd;

    @FindBy(css = "[class='swatch-option text']")
    public WebElement arcSize;

    @FindBy(css = "[class='swatch-option color']")
    public WebElement arcColor;

    @FindBy(css = "[id='qty']")
    public WebElement arcQty;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement arcVerify;

    @FindBy(css = "[class='action showcart']")
    public WebElement arcShowCart;

    @FindBy(css = "[class='action viewcart']")
    public WebElement arcEditCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement arcGoToCart;

    @FindBy(css = "[class='action action-delete']")
    public WebElement arcDelete;

    @FindBy(css = "[title='Qty']")
    public WebElement arcCartQty;

    @FindBy(css = "[class='action update']")
    public WebElement arcUpdate;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    public WebElement arcStale;

    @FindBy(css = "[class='cart-empty']")
    public WebElement arcCartEmpty;

    @FindBy(xpath = "//span[text()='See Details']")
    public List<WebElement> arcCount;

    @FindBy(css = "[aria-label='store logo']")
    public WebElement homePage;


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
            case "myAccountButton":return this.myAccountButton;
            case "manageAddressesButton": return this.manageAddressesButton;
            case "addNewAddressButton": return this.addNewAddressButton;
            case "telephoneInput": return this.telephoneInput;
            case "street1Input": return this.street1Input;
            case "cityInput": return this.cityInput;
            case "regionIdInput": return this.regionIdInput;
            case "zipInput": return this.zipInput;
            case "saveAddressButton": return this.saveAddressButton;
            case "defaultBilling": return this.defaultBilling;
            case "defaultShipping": return this.defaultShipping;
            case "deleteButton": return this.deleteButton;
            case "deleteOk": return this.deleteOk;
            case "messageText": return this.messageText;
            case "homePage": return this.homePage;
            case "arcProduct1": return this.arcProduct1;
            case "arcProduct2": return this.arcProduct2;
            case "arcAdd": return this.arcAdd;
            case "arcSize": return this.arcSize;
            case "arcColor": return this.arcColor;
            case "arcQty": return this.arcQty;
            case "arcShowCart": return this.arcShowCart;
            case "arcEditCart": return this.arcEditCart;
            case "arcDelete": return this.arcDelete;
            case "arcCartQty": return this.arcCartQty;
            case "arcUpdate": return this.arcUpdate;
            case "arcGoToCart": return this.arcGoToCart;
        }
        return null;
    }
}

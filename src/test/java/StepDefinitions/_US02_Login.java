package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US02_Login {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    @Given("Navigate to magento website")
    public void navigateToMagentoWebsite() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Then("Login Success Message Should Appear")
    public void loginSuccessMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.loginConfirmation));
        Assert.assertTrue(dc.loginConfirmation.isDisplayed());
    }

    @Then("Logout Message Should Appear")
    public void logoutMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.signIn));
        Assert.assertTrue(dc.signIn.isDisplayed());
    }

    @Then("Required Field Message Should Appear")
    public void requiredFieldMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.emailErrorText));
        Assert.assertTrue(dc.emailErrorText.getText().toLowerCase().contains("required field.".toLowerCase()));

    }

    @Then("Valid Email Address Message Should Appear")
    public void validEmailAddressMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.emailErrorText));
        Assert.assertTrue(dc.emailErrorText.getText().toLowerCase().contains("valid email address".toLowerCase()));
    }

    @Then("Required Field Password Message Should Appear")
    public void requiredFieldPasswordMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.passwordErrorText));
        Assert.assertTrue(dc.passwordErrorText.getText().toLowerCase().contains("incorrect".toLowerCase()));

    }

    @Then("Invalid Password Message Should Appear")
    public void invalidPasswordMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.passwordErrorText));
        Assert.assertTrue(dc.passwordErrorText.getText().toLowerCase().contains("incorrect".toLowerCase()));
    }

    @Then("Forget Password Page Should Appear")
    public void forgetPasswordPageShouldAppear() {


        wait.until(ExpectedConditions.visibilityOf(dc.forgetPasswordText));
        Assert.assertTrue(dc.forgetPasswordText.getText().toLowerCase().contains("Forgot Your Password".toLowerCase()));

    }
}



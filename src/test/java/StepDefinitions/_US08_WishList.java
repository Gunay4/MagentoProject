package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _US08_WishList {

    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(GWD.getDriver());

    @Then("Wish List has been Added Should Appear")
    public void wishListHasBeenAddedShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("has been added"));

    }

    @And("Verify the wishlist should not be empty")
    public void verifyTheWishlistShouldNotBeEmpty() {
        Assert.assertFalse(dc.wishListNotEmpty.getText().contains("You have no items in your wish list."));
    }

    @And("Navigate to Product and click the Remove button")
    public void navigateToProductAndClickTheRemoveButton() {
        actions.moveToElement(dc.wishListProduct).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dc.wishRemoveButton));
        actions.click(dc.wishRemoveButton).build().perform();
    }

    @Then("Wish List has been Removed Should Appear")
    public void wishListHasBeenRemovedShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("has been removed"));
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.MyPages1;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class MyStepdefs {
    MyPages1 myPages=new MyPages1();
    Random rnd ;

    @When("Open the browser")
    public void openTheBrowser() {
    }

    @Given("Enter the {string}")
    public void enterThe(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Click on Shop Menu")
    public void clickOnShopMenu() {
        myPages.shopButton.click();
    }

    @And("Now click on Home menu button")
    public void nowClickOnHomeMenuButton() {
        myPages.homeButton.click();

    }


    @Then("Test whether the Home page has {int} Sliders only")
    public void testWhetherTheHomePageHasSlidersOnly(int input) {
        System.out.println(myPages.sliders.size());
        Assert.assertEquals(myPages.sliders.size(),input);

    }

    @And("The Home page must contains only {int} sliders")
    public void theHomePageMustContainsOnlySliders(int input) {
        System.out.println(myPages.sliders.size());
        Assert.assertEquals(myPages.sliders.size(),input);
    }


    @And("The Home page must contains only {int} Arrivals")
    public void theHomePageMustContainsOnlyArrivals(int input) {
        System.out.println(myPages.arrivals.size());
        Assert.assertEquals(myPages.arrivals.size(),input);
    }

    @And("Test whether the Home page has {int} Arrivals only")
    public void testWhetherTheHomePageHasArrivalsOnly(int input) {
        System.out.println(myPages.arrivals.size());
        Assert.assertEquals(myPages.arrivals.size(),input);
    }


    @And("Now click the image in the Arrivals")
    public void nowClickTheImageInTheArrivals() {
        //int index= rnd.nextInt(myPages.arrivals.size()-1);
        myPages.arrivals.get(2).click();
    }

    @And("Test whether it is navigating to next page where the user can add that book into his basket.")
    public void testWhetherItIsNavigatingToNextPageWhereTheUserCanAddThatBookIntoHisBasket() {
        assert myPages.cartTitle.isDisplayed();
    }

    @And("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
    public void ımageShouldBeClickableAndShoulNavigateToNextPageWhereUserCanAddThatBookToHisBasket() {
        Driver.getDriver().navigate().back();
        assert myPages.arrivals.get(2).isDisplayed();
        myPages.arrivals.get(2).click();
    }

    @And("Click on Description tab for the book you clicked on.")
    public void clickOnDescriptionTabForTheBookYouClickedOn() {
        myPages.description.click();
    }

    @And("There should be a description regarding that book the user clicked on")
    public void thereShouldBeADescriptionRegardingThatBookTheUserClickedOn() {
        String description=myPages.descriptionText.getText();
        System.out.println("description = " + description);
        Assert.assertFalse(description.isEmpty());
    }
}

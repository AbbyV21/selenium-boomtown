package com.boomtown.step_definitions;

import com.boomtown.pages.BoomtownHelpPage;
import com.boomtown.pages.LoginPage;
import com.boomtown.utilities.ConfigurationReader;
import com.boomtown.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoomtownSearchStepDefinitions {

    LoginPage loginPage = new LoginPage();
    BoomtownHelpPage helpPage = new BoomtownHelpPage();
    String result;

    @Given("User is on main Boomtown landing page")
    public void user_is_on_main_boomtown_landing_page() {
        String url = ConfigurationReader.getProperty("BoomtownUrl");
        Driver.getDriver().get(url);
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @When("User enters valid {string} email")
    public void user_enters_valid_email(String string) {
        String userEmail = "TestQA1@testqa.com";
        loginPage.emailInput.sendKeys(userEmail);
        loginPage.nextBtn.click();
    }
    @When("User enters valid {string} password")
    public void user_enters_valid_password(String string) {
        String userPassword = "TestQA1!";
        loginPage.passwordInput.sendKeys(userPassword);
        loginPage.loginBtn.click();
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expectedTitle = "Boomtown: Login";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("title is as expected", actualTitle, expectedTitle);
    }

//    @Given("User clicks on the help link under profile picture")
//    public void user_clicks_on_the_help_link_under_profile_picture() {
//       helpPage.userProfileLink.click();
//       helpPage.helpBtn.click();
//    }
//
//    @Then("User should see title is {string}")
//    public void user_should_see_title_is(String expected) throws InterruptedException {
//        expected= "Boomtown: My Work";
//      String actual = Driver.getDriver().getTitle();
//
//        Assert.assertEquals("Title as expected",expected, actual);
//
//    }

    @Given("user is on Boomtown help page")
    public void user_is_on_boomtown_help_page() {
        String url = ConfigurationReader.getProperty("BoomtowHelpUrl");
        Driver.getDriver().get(url);
    }


    @When("User types {string} in the search bar")
    public void user_types_in_the_search_bar(String customer) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hero_search']")));
        helpPage.searchBar.sendKeys(customer + Keys.ENTER);

    }

    @Then("User should see the result of the search")
    public void user_should_see_the_result_of_the_search() {

       result = helpPage.searchResult.getText();

    }

    @Then("User should see the number of results found including word {string}")
    public void user_should_see_the_number_of_results_found_including_word(String expected) {
       String actual = helpPage.searchResult.getText();

       Assert.assertTrue(actual.contains(expected));
    }

}

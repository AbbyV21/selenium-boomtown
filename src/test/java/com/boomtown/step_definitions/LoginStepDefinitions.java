package com.boomtown.step_definitions;

import com.boomtown.pages.BoomtownHelpPage;
import com.boomtown.pages.LoginPage;
import com.boomtown.utilities.ConfigurationReader;
import com.boomtown.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    BoomtownHelpPage helpPage = new BoomtownHelpPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        String url = ConfigurationReader.getProperty("BoomtownHelpUrl");
        Driver.getDriver().get(url);

        helpPage.loginButton.click();

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

        String expectedTitle = "My Work";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("title is as expected", actualTitle, expectedTitle);
    }

}

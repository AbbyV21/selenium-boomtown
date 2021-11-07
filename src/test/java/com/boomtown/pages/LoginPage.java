package com.boomtown.pages;

import com.boomtown.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Login")
    public WebElement loginButton;

    @FindBy(id = "ext-element-346")
    public WebElement emailInput;

    @FindBy(id = "ext-element-372")
    public WebElement nextBtn;

    @FindBy(id = "ext-element-359")
    public WebElement passwordInput;

    @FindBy(id = "ext-element-383")
    public WebElement loginBtn;



}

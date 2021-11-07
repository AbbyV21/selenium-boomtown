package com.boomtown.pages;

import com.boomtown.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoomtownHelpPage {

    public BoomtownHelpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(id = "Login")
    //public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"top-bar\"]/section/ul[2]/li/span")
    public WebElement loginButton;

    @FindBy(id = "heroContainer")
    public WebElement title;

    @FindBy(id = "hero_search")
    public WebElement searchInput;

    @FindBy(id = "kb-search-title")
    public WebElement searchTitle;

    @FindBy(xpath = "//*[@id=\"hasResults\"]/div/ul")
    public WebElement resultsList;




}

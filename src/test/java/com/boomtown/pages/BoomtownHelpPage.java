package com.boomtown.pages;

import com.boomtown.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoomtownHelpPage {

    public BoomtownHelpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="hero_search")
    public WebElement searchBar;

    @FindBy(id = "kb-search-title")
    public WebElement searchResult;

    @FindBy(id = "ext-element-91")
    public WebElement userProfileLink;

    @FindBy(xpath = "//div[@id='ext-element-121']")
    public WebElement helpBtn;




}

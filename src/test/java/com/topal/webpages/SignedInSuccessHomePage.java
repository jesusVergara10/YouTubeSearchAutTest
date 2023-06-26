package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignedInSuccessHomePage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@aria-label='Buscar en YouTube'][@class='icon-button topbar-menu-button-avatar-button']")
    WebElement searchDisplay;

    @FindBy(xpath = "//input[@class='searchbox-input title'][@name='search']")
    WebElement searchText;

    public SignedInSuccessHomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void searchVideo(String search){
        searchDisplay.click();
        searchText.sendKeys(search);
        searchDisplay.click();
    }
}

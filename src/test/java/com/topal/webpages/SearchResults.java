package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {
    WebDriver driver;

    @FindBy(xpath = "//a[@id='video-title']//yt-formatted-string[contains(text(),'NEPTUNIAN MAXIMALISM - Live at Rock In Bourlon 2022')]")
    private WebElement greatMusic;

    public SearchResults(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void watchAGreatShow(){
        greatMusic.click();
    }

}

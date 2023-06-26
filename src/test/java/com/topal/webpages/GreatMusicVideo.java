package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreatMusicVideo {
    WebDriver driver;

    @FindBy(xpath = "//yt-button-shape[@id='button-shape']/button[@aria-label='Más acciones']")
    private WebElement masAccionesButton;

    public GreatMusicVideo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMasAcciones(){
        masAccionesButton.click();
    }

}

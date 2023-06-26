package com.topal.webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignedInHome {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    private WebElement searchButton;

    public SignedInHome(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

   /* private boolean isSearchBarPresent(){
        try{
            WebElement searchbarTrue = driver.findElement(By.xpath("//input[@id='search']"));
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }

    public void turnOffAlert(){
        Alert alertwindow = driver.switchTo().alert();
        alertwindow.dismiss();
    }*/

    public void searchGreatMusic(String search){
        searchBar.clear();
        searchBar.sendKeys(search);
        searchButton.click();
    }
}

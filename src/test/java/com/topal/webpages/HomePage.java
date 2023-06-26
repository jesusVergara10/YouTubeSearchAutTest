package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "https://www.youtube.com";

    //Locators
    //log in Button
    @FindBy(how = How.XPATH, using = "//a[@aria-label='Sign in']")
    private WebElement logInButton;

    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //init elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignInButton(){
        logInButton.click();
    }

}

package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage2 {
    WebDriver driver;

    @FindBy(xpath = "//div[normalize-space()='Confirm your recovery email'][@class='vxx8jf']")
    private WebElement confirmRecoveryEmailButton;

    public LogInPage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void recoveryEmailConfirmation(){
        confirmRecoveryEmailButton.click();
    }

    public static class recoveryEmailInput{
        WebDriver driver;

        @FindBy(xpath = "//input[@type='email']")
        private WebElement emailInput;

        @FindBy(xpath = "//span[@jsname='V67aGc'][normalize-space()='Next']")
        private WebElement nextButton;

        public recoveryEmailInput(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

        public void recovEmailInject(String email){
            emailInput.clear();
            emailInput.sendKeys(email);
            nextButton.click();
        }


    }
}

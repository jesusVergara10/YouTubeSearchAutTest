package com.topal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
//    private WebDriver driver;
//
//    //constructor
//    public LogInPage(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(driver, this);
//    }

    public static class UserNameLogIn{

        WebDriver driver;

        @FindBy(xpath = "//span[normalize-space()='Sign in']")
        private WebElement heading;

        @FindBy(xpath = "//input[@type='email'][@jsname='YPqjbf']")
        private WebElement signInEmail;

        @FindBy(xpath = "//div[@id='identifierNext']/div/button")
        private WebElement nextButton;

        public UserNameLogIn(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

        public boolean isPageOpened(){
            return heading.getText().toString().contains("Sign in");
        }

        public void setEmail(String email){
            signInEmail.clear();
            signInEmail.sendKeys(email);
        }
        public void clickOnSignIn(){
            nextButton.click();
        }

    }

    public static class PasswordLogIn{

        WebDriver driver;

        @FindBy(xpath = "//input[@type='password']")
        private WebElement password;

        @FindBy(xpath = "//span[@jsname='V67aGc'][normalize-space()='Next']")
        private WebElement signInButton;

        @FindBy(xpath = "//div[@id='passwordNext']/div/button")
        private WebElement nextButton;

        public PasswordLogIn(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

        public void setPassword(String email){
            password.clear();
            password.sendKeys(email);
        }

        public void clickNext(){
            nextButton.click();
        }

    }
}

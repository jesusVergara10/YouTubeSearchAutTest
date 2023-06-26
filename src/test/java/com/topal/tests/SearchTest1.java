package com.topal.tests;

import com.topal.webpages.*;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchTest1 {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void firstSearchTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickOnSignInButton();

        LogInPage.UserNameLogIn userName = new  LogInPage.UserNameLogIn(driver);
        userName.setEmail("jesusvergaratest1@gmail.com");
        userName.clickOnSignIn();

        Thread.sleep(2000);

        LogInPage.PasswordLogIn password = new LogInPage.PasswordLogIn(driver);
        password.setPassword("Test1324");
        password.clickNext();

        //        LogInPage2 confirmation = new LogInPage2(driver);
//        confirmation.recoveryEmailConfirmation();
//
//        Thread.sleep(2000);
//
//        LogInPage2.recoveryEmailInput emailInject = new LogInPage2.recoveryEmailInput(driver);
//        emailInject.recovEmailInject("chuyvoz3@gmail.com");

        Thread.sleep(2000);

        SignedInHome newSearch = new SignedInHome(driver);
        newSearch.searchGreatMusic("Neptunian Maximalism Live");

        Thread.sleep(2000);

        SearchResults searchResults = new SearchResults(driver);
        searchResults.watchAGreatShow();

        Thread.sleep(2000);

        GreatMusicVideo greatNeptunianMusic = new GreatMusicVideo(driver);







    }


}

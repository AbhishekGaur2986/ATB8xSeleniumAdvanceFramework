package org.example.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Pom {

    WebDriver driver;

    public LoginPage_Pom(WebDriver driver){
        this.driver = driver;

    }

    // Page Locators

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By submit = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    //Page Actions

    public String loginVWOLogininInvalidCred(String user, String pass){

        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(submit).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;





    }

}

package org.example.test.vwoLogin;

import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.example.pages.pageObjectModel.LoginPage_Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_POM {

    @Owner("ABHISHEK")
    @Description("Verifying the Invalid Credentials")
    @Test
    public void testLoginNegativeVWO(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");


        LoginPage_Pom loginPagePom = new LoginPage_Pom(driver);
        String error_message = loginPagePom.loginVWOLogininInvalidCred("admin","abc");


        assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_message, "Your email, password, IP address and Locators");



    }
}

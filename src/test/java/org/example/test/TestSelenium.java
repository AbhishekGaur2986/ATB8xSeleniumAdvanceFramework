package org.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium {

    @Test
    public void test_VWOLogin(){

        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://app.vwo.com");
        webDriver.quit();

    }
}

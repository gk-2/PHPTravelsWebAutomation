package com.phptravels.pageObjects;

import com.phptravels.baseUtils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {

    @FindBy(xpath=".//input[@name='email' and @type='email']")
    WebElement emailField;

    @FindBy(xpath=".//input[@name='password' and @type='password']")
    WebElement passwordField;

    @FindBy(xpath=".//span[text()='Login']/parent::button")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void customer_Login( String username,String password) throws InterruptedException {

        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        Thread.sleep(2000);

        //click on login button
        loginButton.click();




    }
}

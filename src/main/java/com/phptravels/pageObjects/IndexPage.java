package com.phptravels.pageObjects;

import com.phptravels.baseUtils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseTest {

    @FindBy (xpath=".//button[@id='ACCOUNT']")
    WebElement account_Button;

    @FindBy(xpath=".//a[text()='Customer Login']")
    WebElement customer_LoginOption;

    public IndexPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void clickOnCustomer_LoginOption() throws InterruptedException {
        account_Button.click();
        Thread.sleep(1000);

        customer_LoginOption.click();


    }
}

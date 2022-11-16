package com.phptravels.pageObjects;

import com.phptravels.baseUtils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoardPage extends BaseTest {

    @FindBy(xpath=".//section[@class='dashboard-area']//div[@class='section-heading']//span")
    WebElement userNameText;

    public DashBoardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void verifyLoginUserName(){

        System.out.println("get text==>"+userNameText.getText());
        Assert.assertEquals(userNameText.getText(),"Demo");
    }
}

package com.phptravels.testScripts;

import com.phptravels.baseUtils.BaseTest;
import com.phptravels.pageObjects.DashBoardPage;
import com.phptravels.pageObjects.IndexPage;
import com.phptravels.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC001_LoginTest extends BaseTest {

    @Test
    public void customer_LoginTest() throws InterruptedException {
        //opening the URL
        driver.get(config.getProperty("Website"));

        //go to customer login page
        IndexPage index=new IndexPage(driver);
        index.clickOnCustomer_LoginOption();

        // enter username and password in login page and click on login
        LoginPage login=new LoginPage(driver);
        login.customer_Login(config.getProperty("Username"),config.getProperty("Password"));

        //dashboard to verify te login
        DashBoardPage dashBoardPage=new DashBoardPage(driver);
        dashBoardPage.verifyLoginUserName();


    }
}

package com.phptravels.baseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public Properties config=new Properties();
    private FileInputStream fis;
    public WebDriver driver;

    @BeforeSuite
    public void setUp(){

        try {
            fis=new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            config.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.getProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){

    //    driver.quit();
    }
}

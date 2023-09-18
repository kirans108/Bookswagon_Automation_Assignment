package com.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.selenium.base.BaseClass;
import com.selenium.pages.LogIn;
import com.selenium.utility.DataProviderLogic;
import com.selenium.utility.TestListener;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LogInTest extends BaseClass {
    public static ExtentReports reports;
    public static ExtentTest test;
    Logger logger = Logger.getLogger(LogInTest.class.getName());
    LogIn login;
    @BeforeMethod
    public void init(){
        setUp();
        login =new LogIn(driver);
        reports = new ExtentReports("C:\\Users\\kiran\\IdeaProjects\\Bookswagon_Automation\\ExtentReport.html");
        test = reports.startTest("Bookswagon Test Demo");
    }
    @Test(dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void successfulLogIn(String username, String pass) throws InterruptedException {
        logger.debug("hi");
        Boolean verifyLogIn = login.successfulLogIn(username,pass);
        if (verifyLogIn.equals(true)){
            System.out.println("Logged in successful!!");
        }else {
            System.out.println("Logged in unsuccessful!!");
        }
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        reports.endTest(test);
        reports.flush();
    }
}

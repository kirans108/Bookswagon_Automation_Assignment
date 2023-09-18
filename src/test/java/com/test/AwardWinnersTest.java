package com.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.selenium.base.BaseClass;
import com.selenium.pages.AwardWinners;
import com.selenium.utility.TestListener;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;


@Listeners(TestListener.class)
public class AwardWinnersTest extends BaseClass {
    public static ExtentReports reports;
    public static ExtentTest test;
    Logger logger = Logger.getLogger(LogInTest.class.getName());

    AwardWinners awardWinners;

    @BeforeMethod
    public void init(){
        setUp();
        awardWinners=new AwardWinners(driver);
        reports = new ExtentReports("C:\\Users\\kiran\\IdeaProjects\\Bookswagon_Automation\\ExtentReport.html");
        test = reports.startTest("Bookswagon Test Demo");

    }
    @Test(priority = 0)
    public void setAwardWinnersVerifyTest() throws AWTException, InterruptedException {
        logger.debug("Hi");
        String header = awardWinners.awardWinnersVerify();
        Assert.assertEquals(header, "Award Winners");
        String bookName = awardWinners.assertionOne();
        Assert.assertEquals(bookName, "Dinosaur Time");
        String buy=awardWinners.assertionTwo();
        Assert.assertEquals(buy,"Dinosaur Time");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        reports.endTest(test);
        reports.flush();
    }
}

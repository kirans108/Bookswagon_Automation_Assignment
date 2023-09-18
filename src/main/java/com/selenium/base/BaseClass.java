package com.selenium.base;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Logger;

public class BaseClass {
    public static WebDriver driver;
    Logger logger = Logger.getLogger(BaseClass.class.getName());
    public static void takeScreenShot(String testCaseExecute) throws IOException {
        Date date = new Date();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File capture = screenshot.getScreenshotAs(OutputType.FILE);
        File destShot = new File("C:\\Users\\kiran\\IdeaProjects\\Bookswagon_Automation\\src\\main\\resources\\Screenshots" + testCaseExecute+ "_" + date.getTime() + ".png");
        FileHandler.copy(capture, destShot);
    }

    public void setUp() {
        PropertyConfigurator.configure("C:\\Users\\kiran\\IdeaProjects\\Bookswagon_Automation\\log4j.properties");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        logger.info("Browser Launched!!");
        driver.manage().window().maximize();
        driver.get("https://www.bookswagon.com/");
        logger.info("Website Opened!!");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}

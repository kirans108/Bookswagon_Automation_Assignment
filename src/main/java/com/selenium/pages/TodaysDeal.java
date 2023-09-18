package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TodaysDeal {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_li4']")
    WebElement todaysDealSectionPage;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Hands on Math']")
    WebElement dealTwo;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bookName;

    public TodaysDeal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String setTodaysDealSectionVerify(){
        todaysDealSectionPage.click();
        dealTwo.click();
        String name=bookName.getText();
        return name;
    }
}

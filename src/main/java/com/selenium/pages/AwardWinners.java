package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class AwardWinners {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_liAW']//a[contains(text(),'Award Winners')]")
    WebElement awardWinnersSection;
    @CacheLookup
    @FindBy(xpath = " //span[@id='ctl00_phBody_lblHeading']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ddlSort']")
    WebElement dropDown;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='English']")
    WebElement language;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Dinosaur Time']")
    WebElement bookLink;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bookTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline m-0 signreflink position-relative']//li[@class='list-inline-item position-relative']//a")
    WebElement cartBtn;
    @CacheLookup
    @FindBy(xpath = "//label[@id='ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle']")
    WebElement buyingBookNameVerify;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ctl00_phBody_BookCart_lvCart_ctrl0_btnMovetoWishlist']")
    WebElement moveToWishList;

    public AwardWinners(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String awardWinnersVerify() throws AWTException, InterruptedException {
        awardWinnersSection.click();
        String header= headerVerify.getText();
        Select select=new Select(dropDown);
        select.selectByIndex(1);
        Robot robot = new Robot();
        robot.mouseWheel(5);
        Thread.sleep(2000);
        language.click();
        bookLink.click();
        return header;
    }
    public String assertionOne(){
        String bookName=bookTitle.getText();
        buyNow.click();
        cartBtn.click();
        return bookName;
    }
    public String assertionTwo(){
        String buy=buyingBookNameVerify.getText();
        moveToWishList.click();
        return buy;
    }
}

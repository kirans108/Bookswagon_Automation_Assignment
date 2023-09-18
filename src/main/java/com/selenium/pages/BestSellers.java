package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellers {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_libestseller']//a[contains(text(),'Best sellers')]")
    WebElement bestSellerSection;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_lblHeading']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Bhagavad Gita: Yatharoop']")
    WebElement bookClick;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bookName;
    @CacheLookup
    @FindBy(xpath = "//label[@id='ctl00_phBody_ProductDetail_lblourPrice']")
    WebElement bookPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline m-0 signreflink position-relative']//li[@class='list-inline-item position-relative']//a")
    WebElement cartBtn;
    @CacheLookup
    @FindBy(xpath = "    //label[@id='ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle']")
    WebElement buyBookNameVerify;

    public BestSellers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String setBestSellerSection(){
        bestSellerSection.click();
        String header=headerVerify.getText();
        bookClick.click();
        return header;
    }
    public String assertionOne(){
        String name=bookName.getText();
        return name;
    }
    public String assertionTwo(){
        String price=bookPrice.getText();
        buyNow.click();
        cartBtn.click();
        return price;
    }
    public String assertionThree(){
        String buyBookName=buyBookNameVerify.getText();
        return buyBookName;
    }
}

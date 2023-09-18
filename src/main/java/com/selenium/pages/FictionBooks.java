package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionBooks {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Fiction Books']")
    WebElement fictionBooksSection;
    @CacheLookup
    @FindBy(xpath = "//span[@class='promotitletext']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//div[@id='site-wrapper']//div[10]//a[1]//div[1]")
    WebElement bookLink;

    @CacheLookup
    @FindBy(xpath = "//button[@id='btnViewProduct']")
    WebElement viewProduct;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bookName;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;
    @CacheLookup
    @FindBy(xpath = "//a[@href='https://www.bookswagon.com/shoppingcart.aspx']//span[@class='itemcount']")
    WebElement cartBtn;
    @CacheLookup
    @FindBy(xpath = "//label[@id='ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle']")
    WebElement buyBookName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_BookCart_lvCart_imgPayment']")
    WebElement buyBtn;

    public FictionBooks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String setFictionBooksSectionVerify(){
        fictionBooksSection.click();
        String header=headerVerify.getText();
        bookLink.click();
        viewProduct.click();
        return header;
    }
    public String assertionOne(){
        String name=bookName.getText();
        buyNow.click();
        cartBtn.click();
        return name;
    }
    public String assertionTwo(){
        String name=buyBookName.getText();
        buyBtn.click();
        return name;
    }
}

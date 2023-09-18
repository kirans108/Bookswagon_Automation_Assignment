package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoxSets {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_lipreorder']//a[contains(text(),'Box Sets')]")
    WebElement boxSetSection;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_lblHeading']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Game of Thrones Leather-Cloth Boxed Set']")
    WebElement bookLink;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bookName;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline m-0 signreflink position-relative']//li[@class='list-inline-item position-relative']//a")
    WebElement cartBtn;
    @CacheLookup
    @FindBy(xpath = "//label[@id='ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle']")
    WebElement buyBookName;

    public BoxSets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setBoxSetSection(){
        boxSetSection.click();
    }
    public String assertionOne(){
        String header=headerVerify.getText();
        bookLink.click();
        return header;
    }
    public String assertionTwo() {
        String bookTitle = bookName.getText();
        buyNow.click();
        cartBtn.click();
        return bookTitle;
    }
    public String assertionThree(){
        String name=buyBookName.getText();
        return name;
    }
}

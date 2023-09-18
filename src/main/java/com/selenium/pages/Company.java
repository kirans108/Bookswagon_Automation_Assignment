package com.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='About Us']")
    WebElement aboutUsBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='abouttitle']")
    WebElement aboutBookswagon;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Career']")
    WebElement careerVerifyBtn;
    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Why join Bookswagon?']")
    WebElement careerVerify;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    WebElement contactUsVerifyBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Contact Us']")
    WebElement contactUsVerify;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Privacy Policies']")
    WebElement policiesBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='privacypolicy']")
    WebElement policiesHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Terms of Use']")
    WebElement termsOfUseBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Terms of Use']")
    WebElement termsOfUseHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Secure Shopping']")
    WebElement secureShoppingBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='safesecurehelp']")
    WebElement secureSoppingHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Copyright Policy']")
    WebElement copyRightPolicyBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='safesecurehelp']")
    WebElement copyRightPolicyHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Payment']")
    WebElement paymentBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='paymenthelp']")
    WebElement paymentHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Shipping']")
    WebElement shippingBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Terms of Use']")
    WebElement shippingHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Return']")
    WebElement returnBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='returnhelp']")
    WebElement returnHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='FAQ']")
    WebElement fAQBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='help-right']//h1[contains(text(),'FAQ')]")
    WebElement fAQHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Affiliate']")
    WebElement affiliateBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Become a Bookswagon.com affiliate. Earn money regu')]")
    WebElement affiliateHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sitemap']")
    WebElement siteMapBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Sitemap']")
    WebElement siteMapHeader;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Facebook']")
    WebElement fbClick;



    public Company(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String aboutUsVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        aboutUsBtn.click();
        String header=aboutBookswagon.getText();
        return header;
    }
    public String careerVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        careerVerifyBtn.click();
        String headerOne=careerVerify.getText();
        return headerOne;
    }
    public String contactUsVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        contactUsVerifyBtn.click();
        String headerTwo=contactUsVerify.getText();
        return headerTwo;
    }
    public String policiesVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        policiesBtn.click();
        String headerThree=policiesHeader.getText();
        return headerThree;
    }
    public String termsOfUseVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        termsOfUseBtn.click();
        String headerFour=termsOfUseHeader.getText();
        return headerFour;
    }
    public String secureShoppingVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        secureShoppingBtn.click();
        String headerFive=secureSoppingHeader.getText();
        return headerFive;
    }
    public String copyRightPolicy(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        copyRightPolicyBtn.click();
        String headerSix=copyRightPolicyHeader.getText();
        return headerSix;
    }
    public String paymentVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        paymentBtn.click();
        String headerSeven=paymentHeader.getText();
        return headerSeven;
    }

    public String shippingVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        shippingBtn.click();
        String headerEight=shippingHeader.getText();
        return headerEight;
    }
    public String returnVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        returnBtn.click();
        String headerNine=returnHeader.getText();
        return headerNine;
    }
    public String fAQVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        fAQBtn.click();
        String headerTen=fAQHeader.getText();
        return headerTen;
    }
    public String affiliateVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        affiliateBtn.click();
        String headerEleven=affiliateHeader.getText();
        return headerEleven;
    }
    public String siteMapVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        siteMapBtn.click();
        String headerTwelve=siteMapHeader.getText();
        return headerTwelve;
    }
    public void socialMediaVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        fbClick.click();
    }
}

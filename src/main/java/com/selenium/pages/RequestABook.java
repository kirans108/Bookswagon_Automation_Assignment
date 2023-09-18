package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class RequestABook {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Request a Book']")
    WebElement requestBookSection;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='floatheading']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtISBN']")
    WebElement iSBN13TextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtTitle']")
    WebElement bookTitleTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtAuthor']")
    WebElement authorTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtEmailReq']")
    WebElement emailTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtPhone']")
    WebElement phoneNumTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_btnVeiry']")
    WebElement verifyEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_Footer_ValidateOTP_btnSubmit']")
    WebElement validateOtp;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_imgbtnSave']")
    WebElement submitBtn;


    public RequestABook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String setRequestBookSectionVerify() throws InterruptedException {
        requestBookSection.click();
        String header=headerVerify.getText();
        iSBN13TextField.sendKeys("45612356");
        bookTitleTextField.sendKeys("Shot Down: The True Story of Pilot Howard Snyder and the Crew of the B-17 Susan Ruth");
        authorTextField.sendKeys("Steve Snyder");
        emailTextField.sendKeys("kiranswamy37@gmail.com");
        verifyEmail.click();
        Thread.sleep(5000);
        validateOtp.click();
        phoneNumTextField.sendKeys("8073708037");
        submitBtn.click();
        return header;
    }
}

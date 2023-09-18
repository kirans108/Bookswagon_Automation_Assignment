package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class SignUp {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_lblUser']")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "(//a[text()='New to Bookswagon? Sign up'])[1]")
    WebElement signUpBtn;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtName']")
    WebElement name;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtEmail']")
    WebElement mobileNumber;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_btnContinue']")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtOTP']")
    WebElement otp;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtPassword']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtConfirmPwd']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignUp_txtConfirmPwd']")
    WebElement signUpButton;


    public SignUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void registration() throws InterruptedException {
        String webSiteTitle=driver.getTitle();
        System.out.println(webSiteTitle);
        Assert.assertEquals(webSiteTitle,"Online Bookstore | Buy Books Online | Read Books Online");
        myAccount.click();
        signUpBtn.click();
        name.sendKeys("Kiran");
        mobileNumber.sendKeys("8073708037");
        Thread.sleep(2000);
        continueBtn.click();
        otp.sendKeys("830533");
        password.sendKeys("kiran@123");
        confirmPassword.sendKeys("kiran@123");
        signUpButton.click();

    }
}

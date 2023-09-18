package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LogIn  {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_lblUser']")
    WebElement myAccountSection;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
    WebElement mobileNum;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
    WebElement passWord;
    @CacheLookup
    @FindBy(xpath = " //a[@id='ctl00_phBody_SignIn_btnLogin']")
    WebElement LogInButton;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='privacypolicy']")
    WebElement myAccountInfo;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_lblUser']")
    WebElement mouseHoverOnMyAccount;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ctl00_lnkbtnLogout']")
    WebElement logOut;

    public LogIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public Boolean successfulLogIn(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        myAccountSection.click();
        mobileNum.sendKeys(username);
        passWord.sendKeys(password);
        LogInButton.click();
        Boolean flag = myAccountInfo.isDisplayed();
        WebElement ele=mouseHoverOnMyAccount;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        logOut.click();
        return flag;
    }
}

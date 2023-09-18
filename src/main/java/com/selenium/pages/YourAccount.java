package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class YourAccount {
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
    @FindBy(xpath = "//span[@id='ctl00_lblUser']")
    WebElement profile;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Your Account']")
    WebElement yourAccountBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@id='privacypolicy']")
    WebElement myAccountHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Personal Settings']")
    WebElement personalSetting;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='mt-2 mb-4']")
    WebElement personalSettingHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Your Orders']")
    WebElement yourOrdersBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='no-items']")
    WebElement yourOrdersList;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Your Wishlist']")
    WebElement yourWishListBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='m-0']")
    WebElement yourWishlist;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Your Gift Certificate']")
    WebElement yourGiftCertificateBtn;
    @CacheLookup
    @FindBy(xpath = " //h1[@class='m-0']")
    WebElement yourGiftCertificateHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Your Addresses']")
    WebElement yourAddressesBtn;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='mt-2 mb-4 ml-3 w-100']")
    WebElement yourAddressesHeader;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    WebElement changePasswordBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='mt-2 mb-4']")
    WebElement changePasswordHeader;

    public YourAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String yourAccountVerify(){
        myAccountSection.click();
        mobileNum.sendKeys("8073708037");
        passWord.sendKeys("kiran@123");
        LogInButton.click();
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        yourAccountBtn.click();
        String header=myAccountHeader.getText();
        return header;
    }
    public String personalSettingVerify(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        personalSetting.click();
        String headerOne=personalSettingHeader.getText();
        return headerOne;
    }
    public String yourOrders(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        yourOrdersBtn.click();
        String headerTwo=yourOrdersList.getText();
        return headerTwo;
    }
    public String yourWishList(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        yourWishListBtn.click();
        String headerThree=yourWishlist.getText();
        return headerThree;
    }
    public String yourGiftCertificate(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        yourGiftCertificateBtn.click();
        String headerFour=yourGiftCertificateHeader.getText();
        return headerFour;
    }
    public String yourAddresses(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        yourAddressesBtn.click();
        String headerFive=yourAddressesHeader.getText();
        return headerFive;
    }
    public String changePassword(){
        WebElement ele=profile;
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).perform();
        changePasswordBtn.click();
        String headerSix=changePasswordHeader.getText();
        return headerSix;
    }

}

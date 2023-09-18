package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.YourAccount;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class YourAccountTest extends BaseClass {
    YourAccount yourAccount;
    @BeforeMethod
    public void init(){
        setUp();
        yourAccount=new YourAccount(driver);
    }
    @Test
    public void setYourAccountVerify(){
        String header=yourAccount.yourAccountVerify();
        Assert.assertEquals(header,"My Account");
        String headerOne=yourAccount.personalSettingVerify();
        Assert.assertEquals(headerOne,"Personal Settings");
        String headerTwo=yourAccount.yourOrders();
        Assert.assertEquals(headerTwo,"You do not have any Order(s) placed");
        String headerThree=yourAccount.yourWishList();
        Assert.assertEquals(headerThree,"My Wishlist");
        String headerFour=yourAccount.yourGiftCertificate();
        Assert.assertEquals(headerFour,"My Gift Certificates");
        String headerFive=yourAccount.yourAddresses();
        Assert.assertEquals(headerFive,"My Addresses");
        String headerSix=yourAccount.changePassword();
        Assert.assertEquals(headerSix,"Change Password");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

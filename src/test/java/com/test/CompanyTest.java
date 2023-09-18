package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.Company;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class CompanyTest extends BaseClass {
    Company company;
    @BeforeMethod
    public  void init(){
        setUp();
        company=new Company(driver);
    }
    @Test(priority = 0)
    public void companySectionVerify(){
        String header=company.aboutUsVerify();
        Assert.assertEquals(header,"About Bookswagon");
        String headerOne=company.careerVerify();
        Assert.assertEquals(headerOne,"Why join Bookswagon?");
        String headerTwo=company.contactUsVerify();
        Assert.assertEquals(headerTwo,"Contact Us");
    }
    @Test(priority = 1)
    public void policiesVerify(){
        String headerThree=company.policiesVerify();
        Assert.assertEquals(headerThree,"Bookswagon.com Privacy Policy");
        String headerFour=company.termsOfUseVerify();
        Assert.assertEquals(headerFour,"Terms of Use");
        String headerFive=company.secureShoppingVerify();
        Assert.assertEquals(headerFive,"Safe and Secure Shopping");
        String headerSix=company.copyRightPolicy();
        Assert.assertEquals(headerSix,"Copyrights Policy");
    }
    @Test(priority = 2)
    public  void helpVerify(){
        String headerSeven=company.paymentVerify();
        Assert.assertEquals(headerSeven,"Payments");
        String headerEight=company.shippingVerify();
        Assert.assertEquals(headerEight,"Terms of Use");
        String headerNine=company.returnVerify();
        Assert.assertEquals(headerNine,"Returns");
        String headerTen=company.fAQVerify();
        Assert.assertEquals(headerTen,"FAQ");
    }
    @Test(priority = 3)
    public void socialMediaIntegration(){
        company.socialMediaVerify();
    }
    @Test(priority = 4)
    public void miscVerify(){
        String headerTwelve=company.siteMapVerify();
        Assert.assertEquals(headerTwelve,"Sitemap");
        String headerEleven=company.affiliateVerify();
        Assert.assertEquals(headerEleven,"Become a Bookswagon.com affiliate. Earn money regularly.");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.BestSellers;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class BestSellerTest extends BaseClass {
    BestSellers bestSellers;
    @BeforeMethod
    public void init(){
        setUp();
        bestSellers=new BestSellers(driver);
    }
   @Test
    public void setBestSellersVerify(){
        String header=bestSellers.setBestSellerSection();
        Assert.assertEquals(header,"Best Sellers");
        String name=bestSellers.assertionOne();
        Assert.assertEquals(name,"Bhagavad Gita: Yatharoop");
        String price=bestSellers.assertionTwo();
        Assert.assertEquals(price,"₹455");
        String buyBookName=bestSellers.assertionThree();
        Assert.assertEquals(buyBookName,"Bhagavad Gita: Yatharoop");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}

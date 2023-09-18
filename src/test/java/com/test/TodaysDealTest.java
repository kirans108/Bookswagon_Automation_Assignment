package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.TodaysDeal;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TodaysDealTest extends BaseClass {
    TodaysDeal todaysDeal;
    @BeforeMethod
    public void init(){
        setUp();
        todaysDeal=new TodaysDeal(driver);
    }
    @Test
    public void todaysDealVerify(){
        String name=todaysDeal.setTodaysDealSectionVerify();
        Assert.assertEquals(name,"Hands on Math");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}

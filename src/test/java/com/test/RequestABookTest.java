package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.RequestABook;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class RequestABookTest extends BaseClass {
    RequestABook requestABook;
    @BeforeMethod
    public void init(){
        setUp();
        requestABook=new RequestABook(driver);
    }
    @Test
    public void setRequestABookVerify() throws InterruptedException {
        String header=requestABook.setRequestBookSectionVerify();
        Assert.assertEquals(header,"Request A Book");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}

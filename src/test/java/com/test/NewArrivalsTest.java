package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.NewArrivals;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class NewArrivalsTest extends BaseClass {
    NewArrivals newArrivals;

    @BeforeMethod
    public void init() {
        setUp();
        newArrivals = new NewArrivals(driver);
    }

    @Test
    public void newArrivalsTest() {
        newArrivals.newArrivalsOfBooks();
        String price=newArrivals.assertionOne();
        Assert.assertEquals(price,"₹1,037");
        String book=newArrivals.assertionTwo();
        Assert.assertEquals(book,"201 Diet Tips For Heart Patients");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
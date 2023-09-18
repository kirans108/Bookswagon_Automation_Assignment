package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.BoxSets;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class BoxSetTest extends BaseClass {
    BoxSets boxSets;
    @BeforeMethod
    public void init(){
        setUp();
        boxSets=new BoxSets(driver);
    }
    @Test
    public void boxSetSectionVerify(){
        boxSets.setBoxSetSection();
        String header=boxSets.assertionOne();
        Assert.assertEquals(header,"Box Sets");
        String name=boxSets.assertionTwo();
        Assert.assertEquals(name,"Game of Thrones Leather-Cloth Boxed Set");
        String buyBookName=boxSets.assertionThree();
        Assert.assertEquals(buyBookName,"Game of Thrones Leather-Cloth Boxed Set");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.FictionBooks;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class FictionBooksTest extends BaseClass {
    FictionBooks fictionBooks;
    @BeforeMethod
    public void init(){
        setUp();
        fictionBooks=new FictionBooks(driver);
    }
    @Test
    public void setFictionBooksVerify(){
        String header=fictionBooks.setFictionBooksSectionVerify();
        Assert.assertEquals(header,"Fiction Books");
        String name=fictionBooks.assertionOne();
        Assert.assertEquals(name,"Harry Potter and the Philosopher's Stone");
        String nameOfBook=fictionBooks.assertionTwo();
        Assert.assertEquals(nameOfBook,"Harry Potter and the Philosopher's Stone");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

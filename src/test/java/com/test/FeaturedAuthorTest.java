package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.FeaturedAuthors;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class FeaturedAuthorTest extends BaseClass {
    FeaturedAuthors featuredAuthors;
    @BeforeMethod
    public void init(){
        setUp();
        featuredAuthors =new FeaturedAuthors(driver);
    }
    @Test
    public void setFeaturedAuthorsVerifyTest(){
        String authorNameVerify=featuredAuthors.setFeaturedAuthorsSectionVerify();
        Assert.assertEquals(authorNameVerify,"William Wordsworth");
        String bestSellerBookName=featuredAuthors.assertionOne();
        Assert.assertEquals(bestSellerBookName,"The Prelude and Selected Poems: York Notes Advanced");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

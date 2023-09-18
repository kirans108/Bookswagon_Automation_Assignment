package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.Search;
import com.selenium.utility.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SearchTest extends BaseClass {
    Search search;

    @BeforeMethod
    public void init(){
        setUp();
        search=new Search(driver);
    }
    @Test
    public void setSearchBar() throws InterruptedException {
        search.searchBar();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

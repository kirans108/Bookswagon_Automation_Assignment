package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.Book;
import com.selenium.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class BookTest extends BaseClass {
    Book book;
    @BeforeMethod
    public void init(){
        setUp();
        book=new Book(driver);
    }
    @Test
    public void setBookVerify() throws InterruptedException {
        String header=book.bookSectionVerify();
        Assert.assertEquals(header,"Art & Photography");
        String headerOne=book.biographiesAndMemoirsVerify();
        Assert.assertEquals(headerOne,"Biographies & Memoirs");
        String headerTwo= book.dictionariesAndLanguageVerify();
        Assert.assertEquals(headerTwo,"Dictionaries & Language");
        String headerThree= book.literatureAndLiteraryStudiesVerify();
        Assert.assertEquals(headerThree,"Literature & literary studies");
        String headerFour= book.englishLanguageTeachingVerify();
        Assert.assertEquals(headerFour,"English Language Teaching");
        String headerFive= book.fictionVerify();
        Assert.assertEquals(headerFive,"Fiction");
        String headerSix= book.referencesAndEncyclopedias();
        Assert.assertEquals(headerSix,"References & Encyclopedias");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

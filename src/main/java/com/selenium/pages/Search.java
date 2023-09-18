package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import java.util.List;

@Listeners(TestListener.class)
public class Search {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='inputbar']")
    WebElement searchBox;
    @FindBy(xpath = "//input[@id='btnTopSearch']")
    WebElement searchBtn;
    @FindBy(xpath = "(//div[@class='title'])[3]")
    WebElement bookTitle;
    @FindBy(xpath = "//div[@id='listSearchResult']//div[2]//div[3]//div[1]//a[1]")
    WebElement bookToBuy;
    @FindBy(xpath = "//label[@id='ctl00_phBody_ProductDetail_lblourPrice']")
    WebElement priceOfABook;
    @FindBy(xpath = "//input[@value='Add to Wishlist']")
    WebElement addToWishList;
    @FindBy(xpath = "//p[contains(text(),'The Greek philosopher Epictetus was born into slav')]")
    WebElement descriptionOfBook;

    public Search(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void searchBar() throws InterruptedException {
        searchBox.sendKeys("Manual for Living");
        searchBtn.click();
        String bookName=bookTitle.getText();
        Assert.assertEquals(bookName,"Manual for Living");
        Thread.sleep(2000);
        bookToBuy.click();
        String price=priceOfABook.getText();
        Assert.assertEquals(price,"₹637");
        System.out.println(descriptionOfBook);
        addToWishList.click();
    }
}


package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class FeaturedAuthors {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_liRequestBook']//a[normalize-space()='Featured Authors']")
    WebElement featuredAuthorsSection;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='William Wordsworth']")
    WebElement authorOne;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='William Wordsworth']")
    WebElement authorName;
    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'On April 7, 1770, William Wordsworth was conceived')]")
    WebElement authorDescription;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ddlSort']")
    WebElement dropDown;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'The Prelude and Selected Poems: York Notes Advance')]")
    WebElement bestSellerBookOfAuthor;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_ProductDetail_lblTitle']")
    WebElement bestSellerBookTitle;

    public FeaturedAuthors(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String setFeaturedAuthorsSectionVerify(){
        featuredAuthorsSection.click();
        List<WebElement> listOfProducts=driver.findElements(By.xpath("//div[@class='atrCnt']"));
        System.out.println(listOfProducts.size());

        for (WebElement webElement : listOfProducts) {
            String name = webElement.getText();
            System.out.println(name);
        }
        authorOne.click();
        String authorNameVerify=authorName.getText();
        String authorDesc=authorDescription.getText();
        System.out.println(authorDesc);
        Select select=new Select(dropDown);
        select.selectByIndex(1);
        bestSellerBookOfAuthor.click();
        return authorNameVerify;
    }
    public String assertionOne(){
        String bookName=bestSellerBookTitle.getText();
        Assert.assertEquals(bookName,"The Prelude and Selected Poems: York Notes Advanced");
        return bookName;
    }

}

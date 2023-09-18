package com.selenium.pages;

import com.selenium.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import java.util.List;

@Listeners(TestListener.class)
public class NewArrivals {
    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//li[@id='ctl00_linewrelease']//a[contains(text(),'New Arrivals')]")
    WebElement newArrivalsSection;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ctl00_phBody_lblHeading']")
    WebElement newArrivalVerify;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='booktitle font-weight-bold'])[3]")
    WebElement thirdBookClick;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='201 Diet Tips For Heart Patients']")
    WebElement bookLink;
    @CacheLookup
    @FindBy(xpath = "//label[@id='ctl00_phBody_ProductDetail_lblourPrice']")
    WebElement priceOfABook;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline m-0 signreflink position-relative']//li[@class='list-inline-item position-relative']//a")
    WebElement cartButton;
    @CacheLookup
    @FindBy(xpath = "    //label[@id='ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle']")
    WebElement bookName;

    public NewArrivals(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public Boolean newArrivalsOfBooks() {
        newArrivalsSection.click();
        Boolean flag = newArrivalVerify.isDisplayed();
        List<WebElement> listOfNewArrivals = driver.findElements(By.xpath("//span[@class='booktitle font-weight-bold']"));
        System.out.println(listOfNewArrivals.size());
        for (WebElement webElement : listOfNewArrivals) {
            String name = webElement.getText();
            System.out.println(name);
        }
        thirdBookClick.click();
        bookLink.click();
        return flag;
    }
    public String assertionOne() {
        String price = priceOfABook.getText();
        buyNow.click();
        cartButton.click();
        return price;
    }
    public String assertionTwo(){
        String book=bookName.getText();
        return book;
    }
}
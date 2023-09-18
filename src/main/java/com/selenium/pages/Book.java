package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {
    WebDriver driver;


    @FindBy(xpath = "//a[@class='desktopdropdowninit dropdown-toggle']")
    WebElement bookSection;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Art & Photography']")
    WebElement artAndPhotography;
    @CacheLookup
    @FindBy(xpath = " //h1[normalize-space()='Art & Photography']")
    WebElement headerVerify;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Biographies & Memoirs']")
    WebElement biographiesAndMemoirs;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Biographies & Memoirs']")
    WebElement biographiesAndMemoirsHeader;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Dictionaries & Language']")
    WebElement dictionariesAndLanguage;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Dictionaries & Language']")
    WebElement dictionariesAndLanguageHeader;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Literature & literary studies']")
    WebElement literatureAndLiteraryStudies;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Literature & literary studies']")
    WebElement literatureAndLiteraryStudiesHeader;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='English Language Teaching']")
    WebElement englishLanguageTeaching;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='English Language Teaching']")
    WebElement englishLanguageTeachingHeader;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Fiction']")
    WebElement fiction;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Fiction']")
    WebElement fictionHeader;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='References & Encyclopedias']")
    WebElement referencesAndEncyclopedias;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='References & Encyclopedias']")
    WebElement referencesAndEncyclopediasHeader;

    public Book(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String bookSectionVerify() {
        bookSection.click();
        artAndPhotography.click();
        String header = headerVerify.getText();
        return header;
    }
    public String biographiesAndMemoirsVerify() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        biographiesAndMemoirs.click();
        String headerOne = biographiesAndMemoirsHeader.getText();
        return headerOne;
    }
    public String dictionariesAndLanguageVerify() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        dictionariesAndLanguage.click();
        String headerTwo = dictionariesAndLanguageHeader.getText();
        return headerTwo;
    }
    public String literatureAndLiteraryStudiesVerify() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        literatureAndLiteraryStudies.click();
        String headerThree = literatureAndLiteraryStudiesHeader.getText();
        return headerThree;
    }
    public String englishLanguageTeachingVerify() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        englishLanguageTeaching.click();
        String headerFour = englishLanguageTeachingHeader.getText();
        return headerFour;
    }
    public String fictionVerify() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        fiction.click();
        String headerFive = fictionHeader.getText();
        return headerFive;
    }
    public String referencesAndEncyclopedias() throws InterruptedException {
        Thread.sleep(2000);
        bookSection.click();
        referencesAndEncyclopedias.click();
        String headerSix = referencesAndEncyclopediasHeader.getText();
        return headerSix;
    }
}

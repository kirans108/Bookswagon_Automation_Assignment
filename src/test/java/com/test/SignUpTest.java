package com.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.SignUp;
import com.selenium.utility.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SignUpTest extends BaseClass {
    SignUp signUp;

    @BeforeMethod
    public void init(){
        setUp();
        signUp =new SignUp(driver);
    }
    @Test
    public void successfulRegistration() throws InterruptedException {
        signUp.registration();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

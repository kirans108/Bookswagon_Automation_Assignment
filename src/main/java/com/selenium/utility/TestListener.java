package com.selenium.utility;

import com.selenium.base.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("onTestStart");
        String testCaseExecute = result.getMethod().getMethodName();
        System.out.println("on Test Start Method Name : " + testCaseExecute);
        try {
            takeScreenShot(testCaseExecute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("onTestSuccess");
        String testCaseExecute = result.getMethod().getMethodName();
        System.out.println("on Test Success Method Name : " + testCaseExecute);
        System.out.println(result.getStatus());
        try {
            takeScreenShot(testCaseExecute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("onTestFailure");
        String testCaseExecute = result.getMethod().getMethodName();
        System.out.println("on Test Success Method Name : " + testCaseExecute);
        System.out.println(result.getStatus());
        try {
            takeScreenShot(testCaseExecute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("onTestSkipped");
        String testCaseExecute = result.getMethod().getMethodName();
        System.out.println("on Test Success Method Name : " + testCaseExecute);
        System.out.println(result.getStatus());
        try {
            takeScreenShot(testCaseExecute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println(context.getFailedTests().getAllResults().size());
    }
}

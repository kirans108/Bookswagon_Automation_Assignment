package com.selenium.utility;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class ReporterListener implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
        for (ISuite suite:suites){
            String suiteName=suite.getName();
            System.out.println("Suite Name"+"="+suiteName);
            Map<String, ISuiteResult> suiteResults =suite.getResults();
            for(ISuiteResult sr:suiteResults.values()){
                ITestContext testContext= sr.getTestContext();
                System.out.println("Passed tests for suites :"+suiteName+"is:"+testContext.getPassedTests().getAllResults().size());
                System.out.println("Date : "+testContext.getEndDate());
                System.out.println(testContext.getPassedTests().getClass().getName());
            }
            for (ISuiteResult sr : suiteResults.values()){
                ITestContext tc = sr.getTestContext();
                System.out.println("Failed tests for suites :"+suiteName+"is:"+tc.getFailedTests().getAllResults().size());
                System.out.println("Date : "+tc.getEndDate());
                System.out.println(tc.getPassedTests().getClass().getName());
            }
            for (ISuiteResult sr : suiteResults.values()){
                ITestContext tc = sr.getTestContext();
                System.out.println("Skipped tests for suites :"+suiteName+"is:"+tc.getSkippedTests().getAllResults().size());
                System.out.println("Date : "+tc.getEndDate());
                System.out.println(tc.getPassedTests().getClass().getName());
            }
        }
    }
}

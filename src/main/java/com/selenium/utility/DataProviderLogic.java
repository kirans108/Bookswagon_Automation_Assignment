package com.selenium.utility;

import org.testng.annotations.DataProvider;

public class DataProviderLogic {
    @DataProvider(name = "testData")
    public Object[][] getData() {
        ReadExcelData readExcelData = new ReadExcelData();
        int rows = readExcelData.getRowCount();

        Object[][] credentials = new Object[rows][2];

        for (int i = 0; i < rows; ++i) {//1
            for (int j = 0; j < 2; j++) {
                credentials[i][0] = readExcelData.getData(i, 0);
                credentials[i][1] = readExcelData.getData(i, 1);
            }
        }
        return credentials;
    }
}

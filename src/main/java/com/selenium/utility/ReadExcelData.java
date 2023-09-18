package com.selenium.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    File file = new File("C:\\Users\\kiran\\IdeaProjects\\Bookswagon_Automation\\src\\main\\resources\\DataDrivenBookswagon.xlsx");
    public ReadExcelData()  {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            this.workbook = new XSSFWorkbook(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getData(int row, int column){
        this.sheet = this.workbook.getSheetAt(0);
        Cell cell = this.sheet.getRow(row).getCell(column);
        DataFormatter dataFormatter = new DataFormatter();
        return dataFormatter.formatCellValue(cell) + "\t\t\t";
        //Cell cell = this.sheet.getRow(row).getCell(column);
        //double data = cell.getNumericCellValue();
        //return data;
    }

    public int getRowCount(){
        int rowNum =this.workbook.getSheet("Sheet1").getLastRowNum();
        ++rowNum;
        return rowNum;
    }
}

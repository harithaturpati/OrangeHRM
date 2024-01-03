package com.ExcelOperators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_read_SingleTestData {
	

	public static void main(String[] args) throws IOException {
	
		FileInputStream excelTestDatafile=new FileInputStream("./src/com/ExcelOperatorsTest/selenium excel.xlsx");
		//identify the workbook in the excel file
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDatafile);
       //identify the particular sheet in the workbook
   XSSFSheet testDataSheet=workBook.getSheet("sheet1");
   //identify a particular row in the sheet
  Row  testDataSheet_Row=testDataSheet.getRow(0);
  //identify a particular row of a cell
  Cell testDataSheet_rowofcell=testDataSheet_Row.getCell(0);
  //get the test data from the Row of the cell
 String testData =testDataSheet_rowofcell.getStringCellValue();
  
 System.out.println("The test data in the excel file is:-"+testData);
	}
}

	
	
	
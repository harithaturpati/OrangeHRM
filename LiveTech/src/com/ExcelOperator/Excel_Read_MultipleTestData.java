package com.ExcelOperator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream excelTestDatafile=new FileInputStream("./src/com/ExcelOperatorsTest/selenium excel.xlsx");
		//identify the workbook in the excel file
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDatafile);
	XSSFSheet testDataSheet=workBook.getSheet("sheet1");
	//In the sheet identify the number of active rows with the data
	int RowsCount=testDataSheet.getLastRowNum();
	
	for(int rowIndex=0;rowIndex<=RowsCount;rowIndex++)
	{
		Row row=testDataSheet.getRow(rowIndex);
		int rowofCellCount=row.getLastCellNum();
		
		for(int rowofCellIndex=0;rowofCellIndex<rowofCellCount;rowofCellIndex++)
		{
			Cell rowofCell=row.getCell(rowofCellIndex);
			String data=rowofCell.getStringCellValue();
			System.out.println(data+"|");
		}
	}
	
	}

}

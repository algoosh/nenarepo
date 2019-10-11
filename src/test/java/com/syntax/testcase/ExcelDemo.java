package com.syntax.testcase;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {

	@Test
	public void readExcel() throws IOException {

		// we must to bring FileInputStream

		String xlPath = "src/test/resources/excelData/Data.xlsm";
		FileInputStream fis = new FileInputStream(xlPath);

		//A class that helps to read Excel called XSSFWorkbook
		//This class works with any excel file ends with .xlsm
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet=workbook.getSheet("EmpDetails");
		//accessing 2 row and 4 column
		sheet.getRow(1).getCell(3).toString();
		//System.out.println(value);
	}

}

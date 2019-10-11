package com.syntaxPractices;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReview {
	
	@Test
	public void readExcel() throws Exception {
		String xlPath="src/test/resources/excelData/Data.xlsx";
	
		FileInputStream fis=new FileInputStream(xlPath);
	
	//open workbook
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	//open specified sheet
	XSSFSheet sheet = workbook.getSheet("EmpDetails");//this will return one sheet
	
	//access value of a specific cell
	String value=sheet.getRow(6).getCell(0).toString();
	
	System.out.println(value);//prints only one cell
	
	//get number of rows and cols
	int rows=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println("Numbere of rows and cols: "+rows+","+cols);//returns a Number, not value
	
	//get value from each cell 1 by 1
	//we need a loop: outer loop (Rows) , inner loop(Columns)
	for (int a=0; a<rows; a++) {
		for (int b=0; b<cols;b++) {
			
			String cellVal=sheet.getRow(a).getCell(b).toString();
			System.out.println(cellVal);//prints all data from Excel 1 by 1 INCLUDING HEADERS
			//NO NEADERS ------> change to "int a=1"
		}
	}
	
	//close the workbook and stream
	workbook.close();
	fis.close();
	}
}

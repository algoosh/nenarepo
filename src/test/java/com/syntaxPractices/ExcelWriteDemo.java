package com.syntaxPractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriteDemo {
	@Test
	public void writeExcel() throws Exception {
		String xlPath = "src/test/resources/excelData/Data.xlsx";

		FileInputStream fis = new FileInputStream(xlPath);

//open workbook
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbook.getSheet("EmpDetails");//creating local variable
		//now we can do many operations with Excel workbook "EmpDetails"
		//lets write values to the excel using cell of the excel spreadsheet
		//First we need to create a row unless we have it
		sheet.getRow(0).createCell(4).setCellValue("Result");
		sheet.getRow(0).createCell(5).setCellValue("Age");
		//sheet.getRow(1).getCell(4).setCellValue("Pass");
		//sheet.getRow(1).getCell(4).setCellValue("Fail");
		sheet.createRow(11).createCell(0).setCellValue("Nina");
		sheet.createRow(12).createCell(0).setCellValue("Jessica");
		
		//DOES NOT PRINT VALUES???? It is slow!
		
		//in order to write in Excel,first we need to open it for OutPutStream
		FileOutputStream fos= new FileOutputStream(xlPath);//we open the OutputStream, now lets write it
		wbook.write(fos);
		
		//now lets close file and stream
		fos.close();
		wbook.close();
		fis.close();
	}
}

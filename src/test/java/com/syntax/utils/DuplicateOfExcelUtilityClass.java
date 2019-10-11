package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DuplicateOfExcelUtilityClass
 {
	//3. making Global variables, with null values
	
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	/**
	 * method that will open specified excel File and sheet
	 * @param excelFilePath
	 * @param sheetName
	 * returns nothing
	 */
     //1.
	//lets develop a function that will help to open a Workbook
	//below is a method where we pass parameters=excel file path
	public void openExcel(String excelFilePath,String sheetName) 
 {
		try {
			//4.
			// below are Local variables, they are empty.They will be initializes as soon as method will be executed, right after they will die 
			 fis=new FileInputStream(excelFilePath);//excelFilePath is whatever we specify.
			 workbook=new XSSFWorkbook(fis);
			//2.
			//the line below: to get a sheet, its dynamic so no hard coding
			sheet=workbook.getSheet(sheetName);
			
			
			} catch (FileNotFoundException e) {//this catch for:if file is not found
			
			e.printStackTrace();
		} catch (IOException e) {//this catch: if INPUT or OUTPUT streams are closed
		
		e.printStackTrace();
	}
		
	}
	/**
	 * method will return String value of specific cell
	 * @param rowIndex
	 * @param cellIndex
	 * @return String
	 */
	//2.
	//it is method where we getting a value from specific Row and Cell
	//sheet.getRow gives a mistake coz sheet on lone 22 is Local, lets make Global
	 public String getCellData(int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}
	 /**
	  * method that will return number of actual used row
	  * @return int
	  */
	 public int getRowNum() {
		return sheet.getPhysicalNumberOfRows();
		 
	 }
	 /**
	  * method will return number of last column 
	  * @return int
	  */
	 public int getColNum() {
		return 0;
		 
	 }
}

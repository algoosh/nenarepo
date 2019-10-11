package com.syntax.testcase;

import org.testng.annotations.Test;

import com.syntax.utils.Constants;
import com.syntax.utils.DuplicateOfExcelUtilityClass;

public class ExcelFunctionsTest {
	
    @Test
	public void excelText() {
    	DuplicateOfExcelUtilityClass obj=new DuplicateOfExcelUtilityClass();
    	
	obj.openExcel(Constants.XL_FILEPATH,"EmpDetails");
	
//	String value=obj.getCellData(5, 2);
//	System.out.println(value);//prints the value from specific row and cell
	
	//retrieve all values from excel and store intoDataProvider (2D Object array)
	
	int row=obj.getRowNum();//11
	int cell=obj.getColNum();//4
	
	Object[][] data=new Object [row][cell]; //we created dimensional array we store Rows and Columns
	
	//to retrieve all Data we will Loop through each row & cell
	
	for (int i=0;i<row;i++) {//outer loop ---rows
		for(int y=0;y<cell;y++) {//inner loop--columns
			
			String value=obj.getCellData(i, y);//retrieve value from excel
			data[i][y]=value;//store inside 2D array
			
		}
	}
	System.out.println(data.length);//number of Rows--13 including "Jessica & 
}
	
}

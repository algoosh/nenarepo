//package com.syntax.testcase;
//
//    import org.testng.Assert;
//
//	import org.testng.annotations.DataProvider;
//
//	import org.testng.annotations.Test;
//
//	import org.testng.annotations.Test;
//
//	import java.util.List;
//
//    import org.openqa.selenium.By;
//
//	import org.openqa.selenium.WebElement;
//
//	import org.testng.annotations.Test;
//
//    import com.syntax.pages.HomeList;
//import com.syntax.pages.LoginPage;
//
//	import com.syntax.utils.BaseClass;
//
//	import com.syntax.utils.CommonMethods;
//
//	import com.syntax.utils.ConfigsReader;
//import com.syntax.utils.Constants;
//import com.syntax.utils.ExcelUtility;
//
//
//	public class AddEmployeePageTest extends BaseClass {
//
//
//
//		@Test(dataProvider="employee details",groups="regression")
//
//		public void addEmployee(String fName, String mName,String lName, String location) throws InterruptedException {
//
//
//
//			LoginPage login = new LoginPage();
//
//			HomeList home =new HomeList();
//
//			AddEmployeePage addEmp=new AddEmployeePage();
//
//			//login to the OrangeHRM
//
//			login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
//
//			//navigate to add Employee
//
//			CommonMethods.click(home.pim);
//
//			CommonMethods.click(home.addEmp);
//
//			//enter employee details
//
//			CommonMethods.sendText(addEmp.firstName, fName);
//
//			CommonMethods.sendText(addEmp.middleName, mName);
//
//			CommonMethods.sendText(addEmp.lastName, lName);
//
//			CommonMethods.click(addEmp.location);
//
//			CommonMethods.selectList(addEmp.locationList, location);
//
//			CommonMethods.click(addEmp.saveBtn);
//
//			//verify employee is added
//
//			CommonMethods.waitForElementBeClickable(addEmp.empCheck, 20);
//
//			String verifText=addEmp.empCheck.getText();
//
//			System.out.println(verifText);
//
//			Assert.assertEquals(verifText, fName+" "+lName);
//
//		}
//		@DataProvider(name="Employee Data")
//		public Object[][] getEmpData() {
//			ExcelUtility obj=new ExcelUtility();
//			obj.openExcel(Constants.XL_FILEPATH, "EmployeeDetails");
//			int rows=obj.getRowNum();
//			int cols=obj.getColNum(0);
//			
//		Object[][] data=new Object[rows-1][cols];
//		for (int i=1; i<rows; i++) {
//			for (int j=1;j<cols; j++ ) {
//				String value=obj.getCellData(i, j);
//				data[i-1][j]=value;
//				
//			}
//		}
//		return data;
//		}
//
//
//	@DataProvider(name = "employee details")
//
//	public Object[][] getData() {
//
//		
//
//		Object[][] data=new Object[3][4];
//
//		//1 set
//
//		data[0][0]="John";
//
//		data[0][1]="Snow";
//
//		data[0][2]="White";
//
//		data[0][3]="HQ";
//
//		//2 set
//
//		data[1][0]="Jane";
//
//		data[1][1]="Rain";
//
//		data[1][2]="Yellow";
//
//		data[1][3]="West Office";
//
//		//3 set
//
//		data[2][0]="Arya";
//
//		data[2][1]="Sunny";
//
//		data[2][2]="Blue";
//
//		data[2][3]="North Office";
//
//		return data;
//	}}
//
//
//

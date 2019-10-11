package com.syntax.testcase;


import org.testng.Assert; 
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.HomeList;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;
import com.syntax.utils.DuplicateOfExcelUtilityClass;

public class HomeListTest extends BaseClass {

	@Test(dataProvider="employee details")//after adding DP chance all hard coding to non hard coding places
	public void addEmployee(String fN, String mN, String lN, String locations) throws InterruptedException {//first we need to login/already have login method that belongs LoginPage 
		
		LoginPage log=new LoginPage();
		HomeList home=new HomeList();//now I have access to All elements
		 
		//lets log into OrangeHRM
		//use variable "log" to use method ".login"
		log.login(ConfigsReader.getProperty("userName"), ConfigsReader.getProperty("password"));//done with logging in
		 
		//after we logged in let Click on PIM 
		//navigate to add Employee
		CommonMethods.click(home.pim);
		CommonMethods.click(home.addEmp);//once we click on AddEmp we will be passing fN,lN,location ITIS TEST DATA
		CommonMethods.waitForElementBeClickable(home.fN, 20);
		//lets hard coding for now
		// test data is dummy data (not storing in properties file---> its for personal info)
  
		//Before
//		CommonMethods.sendText(home.fN,"Anna");
//		CommonMethods.sendText(home.mN, "A");
//		CommonMethods.sendText(home.lN,"White");
		
		//After DataProvider change value to variable reference
		//enter employee details
		CommonMethods.sendText(home.fN,fN);
		CommonMethods.sendText(home.mN, mN);
		CommonMethods.sendText(home.lN,lN);	
		
		CommonMethods.click(home.locations);//this is where we click on Select of location dropdown
		
		
		
		//next steps:
		//1.identify list
		//2.get all children will "li" tags
		//3.loop through each "li" tag and get expected text
		//4.if text is matching then click on it
		//5.break
		//watch video FM #2 03:04:42 (end of the video)
		
	
	
		
//		//home.dropdownListLocations.findElements(By.tagName("li"));//take that element though which findElements with "li" tags
//		//it will return List of WebElements. LETS NAME IT-->"listLocations"
//		List<WebElement>listLocations=home.dropdownListLocations.findElements(By.tagName("li"));
//		//once we have List lets bring the Loop
//		//here is a shortcut for advanced loop: type "foreach" then "ctr+space"
//		for (WebElement li : listLocations) {
//			String liText=li.getAttribute("innerHTM").trim();
//			//String liText=li.getText().trim();//make sure .trim();
//			if (liText.equals(locations)) {//after DP changing to "locations"
//				li.click();
//				break;
//			}
//		}
		//CommonMethods.waitForElementBeClickable(home.locations,20);
		CommonMethods.selectList(home.dropdownListLocations,locations);
		
		
		CommonMethods.click(home.saveBtn);
		
		//verify employee is added
		CommonMethods.waitForElementBeClickable(home.mikeSmith,20);//wait for the element
		
			String varifText=home.mikeSmith.getText();	
			
			Assert.assertEquals(varifText, fN+" "+lN);
			
		Thread.sleep(9000);
	}
	
	@DataProvider(name="employee details")
	public Object[][]getData(){
		
		Object[][] data=new Object[3][4]; 
		
		//first set
		data[0][0]="John";
		data[0][1]="Snow";
		data[0][2]="White";
		data[0][3]="Manegment";
		
		//second set
		data[1][0]="John1";
		data[1][1]="Snow1";
		data[1][2]="White1";
		data[1][3]="HQ";
		
		//third set
		data[2][0]="John1";
		data[2][1]="Snow2";
		data[2][2]="White2";
		data[2][3]="Star";
		
		
		
		return data;
	}	
		
	@DataProvider(name="Employee Data")
			public Object[][] getEmpData() {
		
		DuplicateOfExcelUtilityClass obj=new DuplicateOfExcelUtilityClass();
		obj.openExcel(Constants.XL_FILEPATH, "EmpDetails");
		
		//get numbers of Rows and Cells then loop though them
		
		int rows=obj.getRowNum();//13
		int cols=obj.getColNum();//4  ???[0]                VIDEO FW #4 03:30:15 Asel
		
		Object[][] data=new Object[rows-1][cols];//new Object , removing Headers line become 12 instead 13
		
		for (int i=1; i<rows;i++) {//skipping index  0--->Headers
			for (int j=0;j<cols;j++) {
				
				String value=obj.getCellData(i, j);
				//at first iteration data[1][0]
				
				//at last iteration data[12][3]
				data[i-1][j]=value;//data [0][0];
			}
		}
		return data;
		//DOES NOT RIN 12 TIMES?????
	}
}

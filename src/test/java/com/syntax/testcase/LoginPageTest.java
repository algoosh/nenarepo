package com.syntax.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.syntax.pages.HomeList;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass {

	@Test(enabled=false)  //(groups = "smoke")
	public void loginToOrangeHRM() {
		//logger = report.createTest("positive loggin");
		LoginPageWithoutPageFactory login = new LoginPageWithoutPageFactory();
		//logger.info("Loggin with valid credentials");
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "z5tAtWD5G@");
		CommonMethods.click(login.clickLoginBtn);//use Thread
		//logger.info("Verifying dashboard text is displayed");
		HomeList home=new HomeList();
	boolean isDisplayed=home.dashboardText.isDisplayed();
	 
	Assert.assertTrue(isDisplayed); 
}  
	
	//Another test to verify if user is unable to login with Wrong credentials
	@Test
	public void negativeLogin() {
		LoginPage login=new LoginPage();
		login.login("bluh","bluh");// we passing wrong values
		String error=login.message.getText();
//System.out.println(error);//make sure to print out to see if message prints in console"Invalid Credentials"
	//then erased line "System.out.println(error)"
		//next step is Assert
		Assert.assertEquals(error,"Invalid Credentials");//id it is String then go with expected and 
	}
	
	
	//@Test(groups = "smoke")
	@Test(enabled=false)
	public void doLogin() {
		//logger=report.createTest("Positive LOGIN");
		
		LoginPage login = new LoginPage();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("userName"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);
		
		
		
//		/*/*US24548: Add Employee Details
//
//TestCase: Add Employee Verification
//Step 1: Login to the OrangeHRM
//Step 2: Click on PIM
//Step 3: Click on Add Employee
//Step 4: Enter fName, lName, select Location
//Step 5 Click Save
//Step 6: Verify employee is added*/
//		
//		driver.findElement(By.xpath("//span[text()='PIM']")).click();
//		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
//		driver.findElement(By.cssSelector("input#emp_search_lst_employee_name_filter_value")).sendKeys("Ken");
//		driver.findElement(By.cssSelector("input#emp_search_lst_employee_name_filter_value")).sendKeys("Ken");
//		driver.findElement(By.cssSelector("input#emp_search_lst_employee_name_filter_value")).sendKeys("Ken");
//		driver.findElement(By.cssSelector("input#emp_search_lst_employee_name_filter_value")).sendKeys("Ken");
//		driver.findElement(By.cssSelector("input#emp_search_lst_employee_name_filter_value")).sendKeys("Ken");
//	}
//	
//}

	}

	/*
	 * @Test
	 *  public void negativeLogin() {
	 *   LoginPage login = new LoginPage();
	 * 
	 * login.login("admins", "test");
	 *  String errorText = login.message.getText();
	 * 
	 * Assert.assertEquals(errorText, "Invalid Credentials"); }
	 */

}

package com.syntax.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTestPracticeTwo extends BaseClass {

	//@Test
	public void logginIn() {
		LoginPageWithoutPageFactory login = new LoginPageWithoutPageFactory();
		
		CommonMethods.sendText(login.username,"Admin");
		CommonMethods.sendText(login.password,"z5tAtWD5G@");
		CommonMethods.click(login.clickLoginBtn);
		
		HomePage home=new HomePage();
		 boolean isDisplayed = home.dashboardText.isDisplayed();//this method returns boolean
			Assert.assertEquals(isDisplayed, true);
			
			Assert.assertTrue(isDisplayed);//with above code of lines verify is we successfully logged in
	}
	
	@Test   
	public void doLogIn() {
		LoginPage login=new LoginPage();
		
		CommonMethods.sendText(login.userName,ConfigsReader.getProperty("userName"));
		CommonMethods.sendText(login.password,ConfigsReader.getProperty("password")); 
		CommonMethods.click(login.loginBtn);   
	} 
	//Now we need validate if we logged in successfully
	 
}  
	 


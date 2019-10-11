package com.syntax.testcase;

//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.syntax.pages.HomePage;
//import com.syntax.pages.LoginPagePractice;
//import com.syntax.utils.BaseClass;
//import com.syntax.utils.ConfigsReader;
//
//public class LoginPageTestPractice extends BaseClass{
//	
//	//SOHIL version
//	
//	public LoginPagePractice getLP;
//	
//	//validate login functionality with valid credentials
//	@Test(enabled=false)
//	public void login() {
//		getLP=new LoginPagePractice();//to have this object getLP we have access to all methods
//		getLP.enterUserName(ConfigsReader.getProperty("userName"));
//		getLP.enterPassword(ConfigsReader.getProperty("password"));
//		getLP.clickLoginBtn();
//		BaseClass.tearDown();
//	}
//	//validate login functionality with Invalid credentials
//	
//	@Test
//	public void loginInvalid() {
//		getLP=new LoginPagePractice();
//		getLP.enterUserName("testMe1");
//		getLP.enterPassword("0000");
//		getLP.clickLoginBtn();
//		
//
//	
//	
//}}

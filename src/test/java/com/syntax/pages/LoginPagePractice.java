package com.syntax.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

  //login page is page #1
public class LoginPagePractice extends BaseClass {//each page class will be extending  BaseClass, the class that have Driver

	@FindBy(css="input#txtUsername")
	public WebElement userName;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(css="span#spanMessage")  //message Invalid Credentials
	public WebElement message;
	
//	@FindBy(xpath="//div[@class='toast-message']")//message Invalid Credentials
//	public WebElement message;
//	
	
	//we need a constructor of LoginPage to initialize all objects 
	//(Constructor is a type of method that initialize the object as soon as object was created 
	
	public LoginPagePractice() { // a Constuctor:needs to be parameterized since we created it
		PageFactory.initElements(driver, this);//word driver got bold and italic Only after this class was extends with BC
	}
	 
	//BELOW LINES OF CODE IS strictly action by elements
//		public void enterUserName(String uName) {   // a method
//			userName.sendKeys(uName);
//		}
//		public void enterPassword(String pass) {   // a method
//			password.sendKeys(pass);
//		}
//		public void clickLoginBtn() {   // a method
//			loginBtn.click();
//		}
	
	
}

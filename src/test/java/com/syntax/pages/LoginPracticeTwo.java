package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPracticeTwo extends BaseClass{
	
	//locate all elements and store them all here
	@FindBy(css="input[name='txtUsername']")
			public WebElement userName;
	
	@FindBy(css="input[name='txtPassword']")
	public WebElement password;
	
	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;
	 
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	//initialize it through contractor
	public void LoginPracticeTwo() {
		PageFactory.initElements(driver, this);
	}
}

package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginInvalid extends BaseClass {

	@FindBy(css="div[class='toast toast-error']")
	public WebElement invalid;
	
	public void LoginInvalid() {                //initialize through Contractor
		PageFactory.initElements(driver, this);//PageFacroty is a class
	}
	
	
	
}

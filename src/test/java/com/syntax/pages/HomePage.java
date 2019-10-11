package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
//POM 


public class HomePage extends BaseClass{
	
	@FindBy(css="img[class='circle account-photo']")//locate element
	public WebElement accountPhoto;
	

	
//	@FindBy(css="li[class='page-title']")
//	public WebElement dashboardText;

	
	@FindBy(xpath="//li[text()='Dashboard']")
	public WebElement dashboardText;
	
	@FindBy(partialLinkText="PIM")
    public WebElement PIM;
	
    @FindBy(partialLinkText="Add Employee")
    public WebElement addEmployee;
	
	public HomePage() { 
		PageFactory.initElements(driver, this); 
	}
}  
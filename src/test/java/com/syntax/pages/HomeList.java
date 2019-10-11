package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HomeList extends BaseClass {

	//this page includes:DashBoard el, PIM el, AddEmployeePage
	
	@FindBy(xpath = "//li[text()='Dashboard']")//Dashboard
	public WebElement dashboardText;

	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pim;

	@FindBy(xpath="//span[text()='Add Employee']")
	public WebElement addEmp;

	@FindBy(xpath="//input[@id='firstName']")
 public WebElement fN;
  
  @FindBy(id="middleName")
  public WebElement mN;
  
  @FindBy(id="lastName")
  public WebElement lN;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//input")
	public WebElement locations;//location box
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
	public WebElement dropdownListLocations; //location drop down list where we need to click
 
	@FindBy(id="systemUserSaveBtn") 
	public WebElement saveBtn; 
	
	
	@FindBy(xpath="//span[@id='pim.navbar.employeeName']") 
	public WebElement mikeSmith;
	public HomeList() { 
		PageFactory.initElements(driver, this);
	}
} 

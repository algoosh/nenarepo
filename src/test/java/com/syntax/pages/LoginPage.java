
package com.syntax.pages;
//in this page there is  1 method will be REUSED in many TC:ADDEmployee, FinLocation-->this method is precondition
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPage extends BaseClass {
	
    //storing all elements in one class, they are ALL INSTANCE VARIABLES
	// locating WebElement using @FindBy annotation
	//cssSelector is the best, faster
	
	@FindBy(id = "txtUsername")
	public WebElement userName;
 
	@FindBy(name = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(css = "img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']")
    public WebElement message;

	// CONSTRACTOR initialize all of our variables----
	public LoginPage() {                             //  it is a contractor-initialize variables
		PageFactory.initElements(driver, this);      // "this" means this page
		                                             //MUST to "extends BaseClass"
	}  
	 
	//in this lines of code we strictly performing Actions---> enter, enter, click
//below is 1 method used to loGin with Valid or Invalid creds.,its Dynamic so that we need parameters 
	//METHOD
	public void login(String uname, String pwd) {
		CommonMethods.sendText(userName, uname);//they are ALL INSTANCE VARIABLES so that I have eccsee to them in this class
		CommonMethods.sendText(password, pwd); 
		CommonMethods.click(loginBtn); 

	}

}
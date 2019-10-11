package com.syntax.testcase;

import org.testng.annotations.Test;

import com.syntax.pages.LoginPageWithoutPageFactory;

public class LoginTestWithoutPageFactory {
	
	@Test
	public void loginWithoutPF() {
		
	
	LoginPageWithoutPageFactory getLogin=new LoginPageWithoutPageFactory();
	getLogin.username.sendKeys("Admin");
	getLogin.password.sendKeys("z5tAtWD5G@");
	getLogin.clickLoginBtn.click();                    
}
}

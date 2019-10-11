package com.syntaxPractices;

import org.testng.annotations.DataProvider;

public class DataTest {

	@DataProvider(name="inputs")
	public Object[][] getData(){
		return new Object[][]{
			{"white","black"},
			{"low","high"},
			{"thin","thick"},
	};
}
}

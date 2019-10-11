package com.syntaxPractices;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPtacticePartTwo {

	//#1
	//here we have only one test. Lets say we have more test cases within same class
	//we need to separate data from test cases into separate class of same OR different package
	//#2
	//create a separate class "Data Test" and move this data to that class
	
	//#3 if you run test it will give an error saying "Provide Data names"
	//Since it is in different class we need to give a DataProvide'location
	
//	@DataProvider(name="inputs")
//	public Object[][] getData(){
//		return new Object[][]{
//			{"white","black"},
//			{"low","high"},
//			{"thin","thick"},
//	};
//}
	//#4
	//@Test(dataProvider="inputs")//before
	@Test(dataProvider="inputs", dataProviderClass=DataTest.class)//after
	//if both classes belongs different package then we need to import that package-?
	public void testMethodOne(String input1, String input2) {
		System.out.println(input1);
		System.out.println(input2);
	}

}

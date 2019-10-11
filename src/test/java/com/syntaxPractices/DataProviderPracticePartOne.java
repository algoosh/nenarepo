package com.syntaxPractices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPracticePartOne {
	
	//#2
	@DataProvider (name="inputs")              //needed an Annotation and a Name(any)
	// type as object
	public Object[][]getData(){
		return new Object [][] {
			{"white","black"},
			{"low","high"},
			{"thin","thick"},//test will run 3 times
		};
	}
	//#3 after creating DataProvider: how @Test knows to use DataProvider I created?
	// inside @Test annotation,using () we provide name of DataProvider, then run the test
	
	//@Test  before
	@Test(dataProvider="inputs")//after
	public void testMthod1(String input1, String input2) {
		//#1
		//we don't hard coding so that this method takes two parameters from xml file
		//what if we have multiple data? we want to use one method and check functionality of app. using multiple data
		//an example: login for multiple users who have different inputs
		//we need DataProvider , before this test I create a method "getData"(look above #2)
		System.out.println("Input 1 is "+input1);
		System.out.println("Input 2 is "+input2);
	}

}

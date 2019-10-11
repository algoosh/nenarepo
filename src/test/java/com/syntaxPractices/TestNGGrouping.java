package com.syntaxPractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//UDEMY
public class TestNGGrouping {

	@BeforeClass(alwaysRun=true)
	public void bC() {
		System.out.println("before class");
	}

	@Test//(groups= {"cars","suv"})
	public void nissan() {
		System.out.println("test for nissan");
	}
	@Test(groups= {"bikes"})
	public void toyata() {
		System.out.println("test for toyata");
	}
	@Test//(groups= {"cars","sedan"})
	public void honda() {
		System.out.println("test for honda");
	}
	@Test(groups= {"bikes"})
	public void ford() {
		System.out.println("test for ford");
	}
	@AfterClass(alwaysRun=true)
	public void aC() {
		System.out.println("after class");
	}
}

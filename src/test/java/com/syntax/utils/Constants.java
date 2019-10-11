package com.syntax.utils;

public class Constants {

	//// final variable, blue coz its it is Not inside the method-->it is
	//// global,italic-Static, bold-Final
	public static final String CREDENTIALS_FILEPATH = "src/test/resources/configs/credentials.properties";

	public static final String WEB_DRIVER_PATH_CHROME = "src/test/resources/drivers/chromedriver.exe";//chrome
	
	public static final String WEB_DRIVER_PATH_FIREFOX = "src/test/resources/drivers/geckodriver.exe";//firefox


	//public static final String XL_FILEPATH = "src/test/resources/Data/Data.xlsx";
	public static final String XL_FILEPATH = "src/test/resources/excelData/Data.xlsx";
	
	
	public static final String REPORT_FILEPATH = "target/report/orangeHrm.html";

	public static final String OS_NAME = System.getProperty("os.name");

	public static final String USER_NAME = System.getProperty("user.name");

} 

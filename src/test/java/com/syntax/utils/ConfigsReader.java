package com.syntax.utils;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;//we will remove unused inports
import java.io.IOException;
import java.util.Properties;
//above close expends and remove unused imports

public class ConfigsReader { // though this class we will read Congfigs(browser,url,uN,pass)

	// lets remove the main method and create another one
	public static String getProperty(String key) {// whatever I called this method I will pass a one key (becomes
													// dynamic)
//pass the key and will give us value from properties ("Admin",...)
		Properties pro = new Properties();// i want the dynamic.Now we will pass parameters and avoid hard coding value

		// we created an object of Properties
		// through the object we want to load this property but it must to come through
		// InputStream
		// with the help of object of FileInputStream accessing the file
		// Credentials_Filepath
		try {
			pro.load(new FileInputStream(Constants.CREDENTIALS_FILEPATH));

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return pro.getProperty(key);
//this class is ready, whatever we need it we will call it and it will do the job for instance
		// in BaseClass when we pass the key and returns the value
	}
}

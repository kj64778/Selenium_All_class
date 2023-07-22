package com.java.Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FileWrite {

	@Test
	public void fileRead() throws IOException {

		System.getProperty("user.dir");

		String path = System.getProperty("user.dir");

		Properties prop = new Properties();
		
		
		File file = new File(path+"\\\\Excel\\\\Note1.txt");
		
		
		
		FileOutputStream output = new FileOutputStream(file);
		
		System.out.println(output.getClass());
		
		prop.setProperty("username", "kiran.jadhav");
		
		
		
		
		
		
		
		
		
		

	}
}

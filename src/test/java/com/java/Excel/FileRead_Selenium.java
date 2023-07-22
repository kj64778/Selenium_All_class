package com.java.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileRead_Selenium {

	@Test
	public void fileRead() throws IOException {

		System.getProperty("user.dir");

		String path = System.getProperty("user.dir");

		Properties prop = new Properties();

		File file = new File(path + "\\Excel\\Note.txt");

		InputStream input = new FileInputStream(file);

//		

//		InputStream input = new FileInputStream("D:\\Java workspace\\TestNG\\Excel\\Note.txt");

//		File input = new File(path+"\\Excel\\Note.txt");

		prop.load(input);
//		prop.load(output);

		prop.setProperty("KJ", "1021");

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.get("url"));

	}

}

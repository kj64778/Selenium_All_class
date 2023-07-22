package com.java.screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
				

		try {
			FileUtils.copyFile(file, new File("D:\\Java workspace\\SeleniumDemo\\TakeScreenShotFolder\\facebookImage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			System.out.println("File not found exception");
		}

		driver.close();

	}

}

package com.java.Screenshot_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_getScreenShot {

	@Test
	public void test1() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		driver.get("https://www.facebook.com/");

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File file = screenShot.getScreenshotAs(OutputType.FILE);
		
		try {
			String path = System.getProperty("user.dir");
			
			FileUtils.copyFile(file, new File(path+"\\TakeScreenShotFolder\\facebookImage2.jpg"));
			
//			FileUtils.copyFile(file, new File("D:\\Java workspace\\SeleniumDemo\\TakeScreenShotFolder\\facebookImage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			System.out.println("File not found exception");
		}



	
	

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}

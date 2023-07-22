package com.java.Screenshot_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_site_MultipleScreenshot_with_Pass_TestCase {

	WebDriver driver;

	@Test
	public void amazonHomePageTest1() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

	}

	@Test
	public void amazonHomePageTest2() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();

	}

	@AfterMethod
	public void takeScreenshotFortestCase(ITestResult result) {

		String name = result.getName();

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File file = screenShot.getScreenshotAs(OutputType.FILE);

		try {
			String path = System.getProperty("user.dir");

			FileUtils.copyFile(file, new File(path + "\\TakeScreenShotFolder\\" + name+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			System.out.println("Input output Exception");
		}
		driver.close();

	}

}

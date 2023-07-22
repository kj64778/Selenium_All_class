package com.java.Screenshot_1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Demo_qa_site_FailTest_SS {

	WebDriver driver;

	Actions action;

	WebDriverWait wait;

	WebElement element;

	@Test
	public void demoqaSiteHomePage_test1() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/");

		Assert.assertTrue(false);
		

	}

	@Test
	public void demoqaSiteElementPage_test2() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/");

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Elements')]/parent::div/parent::div")));

		action = new Actions(driver);

		action.click(element).build().perform();

//		driver.findElement(By.xpath("//h5[contains(text(),'Elements')]/parent::div/parent::div")).click();
		Assert.assertTrue(false);
	}

	@Test
	public void demoqaSiteFormsPage_test3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/");

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Forms')]/parent::div/parent::div")));

		action = new Actions(driver);

		action.click(element).build().perform();

//		driver.findElement(By.xpath("//h5[contains(text(),'Forms')]/parent::div/parent::div")).click();
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void takeScreenShot(ITestResult result) {
		
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		
		String dateTime = formatter.format(date);

		String name = result.getName();

		if (result.getStatus() == result.FAILURE) {

			TakesScreenshot screenShot = (TakesScreenshot) driver;

			File file = screenShot.getScreenshotAs(OutputType.FILE);

			try {
				String path = System.getProperty("user.dir");
				FileUtils.copyFile(file, new File(path + "\\TakeScreenShotFolder\\"+ dateTime+ " : "+name + ".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);

			}
		}
		driver.close();

	}

}

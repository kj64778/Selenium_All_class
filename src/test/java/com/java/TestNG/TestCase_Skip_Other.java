package com.java.TestNG;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_Skip_Other {
	
//	@Test(skipFailedInvocations = false)
//	public void Test1() {
//		System.out.println("This is Test case 1");
//		
//		assertFalse(true);
//	}
	
//	@Test(groups = {"Sanity"},enabled = true)
//	public void Test2() {
//		System.out.println("This is Test case 2");
//	}
	
//	@Test(invocationCount = 5,skipFailedInvocations = true)
//			public void testCase_invocationCount() {
//		System.out.println("This is Test case 2");
//		Assert.assertTrue(false);
//	}
	
	@Test (timeOut = 5000) 
	public void testTimeout() {
		
		System.out.println("This is time out test case");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.close();
		
	}
	
	
	
//	@Test(enabled = false)
//	public void Test3() {
//		System.out.println("This is Test case 3");
//	}
//	
//	@Test(enabled = true)
//	public void Test4() {
//		System.out.println("This is Test case 4");
//	}
	
	
	
	
	

}

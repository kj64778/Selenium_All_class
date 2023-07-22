package com.java.ListneR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({ Listner_FailTestCase_take_screeshot.class })
public class Listner_Pass_Fail_TestCase {

public static WebDriver driver;

//	@Test
//	public void testCase_1() {
//		System.out.println("This is 1st Test Case");
//	}
//
//	@Test
//	public void testCase_2() {
//		System.out.println("This is 2nd Test Case");
//	}
//
//	@Test
//	public void testCase_3() {
//		System.out.println("This is 3rd Test Case");
//	}

	@Test
	public void testCase_4() {
		System.out.println("This is 4th Test Case");
	}

	@Test
	public void testCase_5() {
		System.out.println("This is 5th Test Case");
		throw new SkipException("This Test Case 5th is skip");
	}

	@Test
	public void youtubeHomePageSS() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.findElement(By.xpath("//label[contains(text(),'First Name ')]//following-sibling::input[1]"))
				.sendKeys("Kiran");

//		Assert.assertTrue(false);
		Assert.assertTrue(false);

		driver.close();

	}

}

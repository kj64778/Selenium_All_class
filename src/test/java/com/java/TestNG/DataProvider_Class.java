package com.java.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider_Class {

	@Test(dataProvider = "data provider")
	public void Test1(String a, String b) {
//		System.out.println("Hello");
//		System.out.println(a);
//		System.out.println(b);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("a");

		driver.findElement(By.id("pass")).sendKeys("b");

		driver.findElement(By.name("login")).click();
		
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

	@DataProvider(name="data provider")
	public Object[][] data() {
		Object[][] dataobj = new Object[2][2];

		dataobj[0][0] = "Kiran";
		dataobj[0][1] = "123";

		dataobj[1][0] = "Jadhav";
		dataobj[1][1] = "321";

		return dataobj;

	}

}

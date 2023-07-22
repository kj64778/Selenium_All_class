package com.java.xpath;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Element_FaceBook {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		

//		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("123456");
//
//		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Test");
//
//		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("adbd");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("1245");

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567890");

		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]]")).sendKeys("123@121");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
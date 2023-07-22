package com.java.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag_LabsWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("asdf");
		
		driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
		}
		catch(Exception e) {
			System.out.println("No such element");
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

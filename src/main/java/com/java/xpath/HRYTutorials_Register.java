package com.java.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRYTutorials_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.findElement(By.xpath("//label[contains(text(),'First Name ')]/following-sibling::input[1]")).sendKeys("123");
		
		driver.findElement(By.xpath("//label[contains(text(),'Repeat Password')]/parent::div/child::input[2]")).sendKeys("12345");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}

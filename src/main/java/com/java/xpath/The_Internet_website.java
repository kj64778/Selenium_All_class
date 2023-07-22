package com.java.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class The_Internet_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//h2[contains(text(),'Available Examples')]"));
//		
//		driver.findElement(By.xpath("//h1[contains(text(),'Welcome to the-internet')]"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}

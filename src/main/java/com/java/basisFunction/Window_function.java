package com.java.basisFunction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_function {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");

		Thread.sleep(3000);

		driver.manage().window().minimize();

		Thread.sleep(3000);

		driver.manage().window().getPosition();

		Thread.sleep(3000);
 
		driver.navigate().refresh();

		Thread.sleep(3000);
		
		

		driver.close();

	}

}

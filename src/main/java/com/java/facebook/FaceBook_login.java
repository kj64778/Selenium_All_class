package com.java.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		
	

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("7774820145");

		driver.findElement(By.id("pass")).sendKeys("kj64778@gmail.com");

		driver.findElement(By.name("login")).click();
//		driver.navigate().refresh();

//				driver.findElement(By)


		driver.navigate().refresh();

		Thread.sleep(3000);
		
		driver.close();

//				driver.findElement(By.id("loginbutton")).click();

	}

}

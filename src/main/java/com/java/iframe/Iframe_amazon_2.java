package com.java.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_amazon_2 {

//	@Test
//  public void getUserDetailsTest()throws InterruptedException {
//	  
//	  System.out.println("Hi...");
//       
//	 
//	  driver.get("https://www.amazon.in/");
//	  driver.findElement(By.xpath("//div[@cel_widget_id='gw-desktop-hero-right-cel']//a//i")).click();
//	  
//	  Thread.sleep(3000);
//	  WebElement ele = driver.findElement(By.xpath("(//img[@alt='Amazon fashion'])[2]"));
//	  Actions action = new Actions(driver);
//	  action.moveToElement(ele).build().perform();
//	  action.click().build().perform();
//	 
//	  Thread.sleep(3000);
//	  driver.close();
//	  
//    }
	@Test
	public void getTest() {

		WebDriverManager.chromedriver().setup();

//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//div[@cel_widget_id='gw-desktop-hero-right-cel']//a//i")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='Amazon fashion'])[2]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).build().perform();
		action.click().build().perform();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}

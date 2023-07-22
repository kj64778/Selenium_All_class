package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		 WebElement drag = driver.findElement(By.xpath("//h3[contains(text(),'Labels')]/parent::div/parent::div/../child::div[1]/child::div/child::ul/child::li[1]"));

		 WebElement drop = driver.findElement(By.xpath("//h3[contains(text(),'Labels')]/parent::div/parent::div/../child::div[1]/child::div/child::ul/child::li[2]"));
		 
		 Actions actions = new Actions(driver);
		 
		 actions.dragAndDrop(drag, drop).build().perform();
		 
		 try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 driver.close();
	}

}

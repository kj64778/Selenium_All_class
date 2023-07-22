package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		Actions actions = new Actions(driver);

		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

		driver.manage().window().maximize();
		
		

		WebElement drag =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		WebElement drop =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		actions.dragAndDrop(drag, drop).perform();
		
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}

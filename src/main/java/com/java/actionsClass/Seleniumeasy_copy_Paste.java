package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumeasy_copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions actions = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

		driver.findElement(By.xpath("//label[contains(text(),'Enter message')]/following-sibling::input"))
				.sendKeys("5000");
		
//		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);

		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);

		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB);

		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);//.build().perform();

		actions.sendKeys(Keys.TAB);

		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();

//		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
//		driver.manage().window().maximize();

//		WebElement drag = driver.findElement(By.xpath("//span[contains(text(),'Draggable 2')]"));
//		WebElement drop = driver.findElement(By.xpath("//h2[contains(text(),'Drop here')]/following-sibling::div"));
//
//		actions.dragAndDrop(drag, drop).build().perform();
		
		

		Thread.sleep(5000);

		driver.close();

	}

}

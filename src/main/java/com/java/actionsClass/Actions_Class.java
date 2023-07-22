package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.facebook.com/");

		Actions actions = new Actions(driver);

		driver.findElement(By.id("email")).sendKeys("7774820145");

		driver.findElement(By.id("pass")).sendKeys("kj64778@gmail.com");

		driver.findElement(By.name("login")).click();

		driver.manage().window().minimize();
		driver.manage().window().getPosition();
		driver.navigate().refresh();
		driver.navigate();

//		actions.click();

//				driver.findElement(By)

//		driver.navigate().refresh();

//		Thread.sleep(3000);

//		driver.close();

	}

}

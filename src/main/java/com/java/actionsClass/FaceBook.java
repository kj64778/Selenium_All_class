package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions actions = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

//		driver.findElement(By.xpath(
//				"//div[contains(text(),'Mobile number or email address')]/parent::div/parent::div/parent::div/preceding-sibling::div/descendant::div[1]/child::div[1]/child::div/child::input"))
//				.sendKeys("Kiran");
//		driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).isSelected();

//		driver.findElement(By.xpath(
//				"//div[contains(text(),'Mobile number or email address')]/parent::div/parent::div/parent::div/preceding-sibling::div/child::div[1]/child::div[2]/child::div/child::div[1]/child::input"))
//				.sendKeys("Jadhav");
//
//		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]")).sendKeys("123456789");
//
//		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input"))
//				.sendKeys("Kiran@123");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}

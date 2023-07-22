package com.java.AlertClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_with_Oky_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath(
				"//button[contains(text(),'Sub Menu [Hover On Me]')]/parent::div/parent::div/preceding-sibling::div[2]/child::input[1]"))
				.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}

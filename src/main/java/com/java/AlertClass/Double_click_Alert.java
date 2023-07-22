package com.java.AlertClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click_Alert {

	public static void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getCurrentUrl());

		WebElement doubleClick = driver.findElement(By.xpath(
				"//button[contains(text(),'Sub Menu [Hover On Me]')]/parent::div/parent::div/following-sibling::div/child::input"));

//		actions.contextClick(doubleClick).perform();

		actions.doubleClick(doubleClick).perform();

		Alert alert = driver.switchTo().alert();

		sleep();

		alert.accept();

		sleep();

	}

}

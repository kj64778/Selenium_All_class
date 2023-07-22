package com.java.AlertClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Image_PDF_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath(
				"//button[contains(text(),'Sub Menu [Hover On Me]')]/parent::div/parent::div/preceding-sibling::div[1]/child::input[2]"))
				.sendKeys("C:\\Users\\kj647\\OneDrive\\Desktop\\Marathi and Hindi question paper.pdf");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}

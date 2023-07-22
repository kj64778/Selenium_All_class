package com.java.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TextValidationOnFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		
		String actualText =element.getText();
		
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		
		if(actualText.contentEquals(expectedText)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case fail");
		}
		
		Assert.assertEquals(expectedText, actualText);
		
		driver.close();
	}

}

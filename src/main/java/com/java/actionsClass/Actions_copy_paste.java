package com.java.actionsClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Actions_copy_paste {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");

		Actions actions = new Actions(driver);

//		 WebElement fullName = driver.findElement(By.id("userName"));
//	        fullName.sendKeys("Mr.Peter Haynes");
//	        
//	        //Enter the Email
//	        WebElement email=driver.findElement(By.id("userEmail"));
//	        email.sendKeys("PeterHaynes@toolsqa.com");

		WebElement currentAddress = driver.findElement(By.xpath(
				"//button[contains(text(),'Submit')]/parent::div/parent::div/preceding-sibling::div[2]/child::div[2]/child::textarea"));

		currentAddress.sendKeys("Kiran Jadhav");

		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		actions.sendKeys(Keys.TAB).build().perform();

		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//		assertEquals(currentAddress.getAttribute("value"), permanentAddress.getAttribute("value"));

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}

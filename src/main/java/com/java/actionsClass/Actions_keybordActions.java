package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_keybordActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
//		driver.get("https://demoqa.com/text-box");

		Actions actions = new Actions(driver);

		WebElement element = driver.findElement(
				By.xpath("//button[contains(text(),'Log in')]/ancestor::form/child::div/child::div/child::input"));
		element.sendKeys("12345");

		// copy the text
//		actions.sendKeys(Keys.CONTROL);
//		actions.sendKeys("A");
//		actions.sendKeys(Keys.CONTROL);
//		actions.sendKeys("C");
//		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		// Press tab key switch the element

//		WebElement paste = driver.findElement(By.xpath(
//				"//button[contains(text(),'Log in')]/ancestor::form/child::div/child::div[2]/child::div/child::input"));

		actions.sendKeys(Keys.TAB).build().perform();
		
//		actions.sendKeys(Keys.CONTROL);
//		actions.sendKeys("V");
//		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//		WebElement fullName = driver.findElement(By.id("userName"));
//		fullName.sendKeys("Mr.Peter Haynes");
//
//		// Enter the Email
//		WebElement email = driver.findElement(By.id("userEmail"));
//		email.sendKeys("PeterHaynes@toolsqa.com");
//
//		// Enter the Current Address
//		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//
//		currentAddress.sendKeys("43 School Lane London EC71 9GO");
//
//		// Select the Current Address using CTRL + A
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("a");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//
//		// Copy the Current Address using CTRL + C
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("c");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//
//		// Press the TAB Key to Switch Focus to Permanent Address
//		actions.sendKeys(Keys.TAB);
//		actions.build().perform();
//
//		// Paste the Address in the Permanent Address field using CTRL + V
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("v");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}

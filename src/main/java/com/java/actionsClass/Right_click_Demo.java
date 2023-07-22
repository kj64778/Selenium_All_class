package com.java.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click_Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		actions.contextClick(element).build().perform();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}

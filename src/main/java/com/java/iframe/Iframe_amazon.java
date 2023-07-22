package com.java.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");

//		WebDriverWait wait=new WebDriverWait(driver, 20);

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//		WebElement element = wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jYaykeB69ArXNiWjpgU8Fw\"]/a/img")));
//
//		Actions action = new Actions(driver);
//
//		action.click(element).build().perform();
//		element.click();
		
		String scr =driver.findElement(By.xpath("//ol[@role='list']//li[1]//div//div//a")).getAttribute("href");

		
		System.out.println(scr);
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	

}

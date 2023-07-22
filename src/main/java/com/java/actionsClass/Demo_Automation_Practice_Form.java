package com.java.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Automation_Practice_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions actions = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[contains(text(),'First name:')]/following-sibling::input"))
				.sendKeys("Kiran");

		driver.findElement(By.xpath("//span[contains(text(),'Last name')]/following-sibling::input"))
				.sendKeys("Jadhav");

		driver.findElement(By.xpath("//b[contains(text(),'Gender')]/following-sibling::input[1]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Years of Experience')]/following-sibling::input[5]"))
				.click();

		driver.findElement(By.xpath("//div[contains(text(),'Date:')]/child::input")).sendKeys("22-06-1999");

//		driver.findElement(By.xpath("//label[contains(text(),'Automation Tester')]/preceding-sibling::input[1]"))
//				.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//label[contains(text(),'Automation Tester')]/preceding-sibling::input[1]")));

		driver.findElement(By.xpath("//span[contains(text(),'Automation Tools')]/following-sibling::input[1]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Automation Tools')]/following-sibling::input[2]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Automation Tools')]/following-sibling::input[3]")).click();

		driver.findElement(By.xpath("//option[contains(text(),'Asia')]/parent::select")).click();

		WebElement dropdown = driver.findElement(By.xpath("//option[contains(text(),'Asia')]/parent::select"));

		dropdown.findElement(By.xpath("//option[contains(text(),'Asia')]/following-sibling::option[6]")).click();

		driver.findElement(By.xpath("//option[contains(text(),'Browser Commands')]/parent::select"));
		dropdown.findElement(By.xpath("//option[contains(text(),'Browser Commands')]/following-sibling::option[4]"))
				.click();

//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
		driver.findElement(By.xpath("(//span[contains(text(),'Upload Image')])[1]/..//input"))
				.sendKeys("C:\\Users\\kj647\\OneDrive\\Desktop\\KJpassbook.jpg");

//		driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]")).click();

//		js.executeScript("window.scrollTo(0,675.5555419921875)");

//		driver.findElement(By.xpath("//button[contains(text(),'Button')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.close();

	}

}

package com.java.AlertClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_with_OKy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

//		WebDriver driver = new ChromeDriver();

		WebDriver driver = new FirefoxDriver();

		Actions actions = new Actions(driver);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement alertXpath = driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert Box')]"));

		actions.click(alertXpath).perform();

		Alert alert = driver.switchTo().alert();

//		alert.accept();

		alert.dismiss();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}

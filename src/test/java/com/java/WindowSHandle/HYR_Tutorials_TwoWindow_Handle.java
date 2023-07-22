package com.java.WindowSHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYR_Tutorials_TwoWindow_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String mainURL = driver.getCurrentUrl();
		System.out.println("This is main URL : " + mainURL);

		String mainWindowID = driver.getWindowHandle();

		System.out.println("This is main Window ID : " + mainWindowID);

		WebElement newWindows = driver.findElement(By.xpath("//button[contains(text(),' Open New Window')]"));

		action.click(newWindows).build().perform();

		Set<String> multipleWindow = driver.getWindowHandles();

		Iterator<String> itr = multipleWindow.iterator();

		while (itr.hasNext()) {
			String openNewWindowID = itr.next();

			if (!mainWindowID.equals(openNewWindowID)) {
				System.out.println("This is Open new window ID : " + openNewWindowID);

				driver.switchTo().window(openNewWindowID);

				String opennewWindowURL = driver.getCurrentUrl();
				System.out.println("This is one new window URL : " + opennewWindowURL);

				driver.manage().window().maximize();

				driver.findElement(
						By.xpath("//b[contains(text(),'First Name')]//parent::label//following-sibling::input[1]"))
						.sendKeys("Kiran");
				driver.findElement(
						By.xpath("//b[contains(text(),'Last Name')]//parent::label//following-sibling::input[1]"))
						.sendKeys("Jadhav");

				driver.findElement(
						By.xpath("//b[contains(text(),'Gender')]//parent::label//following-sibling::input[1]")).click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[1]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[2]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[3]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[4]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[5]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Languages known')]//parent::label//following-sibling::input[6]"))
						.click();

				driver.findElement(
						By.xpath("//b[contains(text(),'Email')]//parent::label//following-sibling::input[1]"))
						.sendKeys("Automation123@gmail.com");

				driver.findElement(
						By.xpath("//b[contains(text(),'Email')]//parent::label//following-sibling::input[2]"))
						.sendKeys("987654");

				driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

				boolean sumitSuccessfully = driver
						.findElement(By.xpath("//label[contains(text(),'Registration is Successful')]")).isDisplayed();

				System.out.println("Registration is Successful : " + sumitSuccessfully);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();

			}

		}

		driver.switchTo().window(mainWindowID);

		driver.findElement(By.xpath(
				"//p[contains(text(),'This textbox is used for entering the text after switching back from child windows to parent window.')]//following-sibling::input"))
				.sendKeys("Open new Window open successfully");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//button[contains(text(),'Open New Tab')]")).click();

		multipleWindow = driver.getWindowHandles();

		itr = multipleWindow.iterator();

		while (itr.hasNext()) {
			String OpenNewTabID = itr.next();
			if (!mainWindowID.equals(OpenNewTabID)) {
				System.out.println("This is open new Tab ID : " + OpenNewTabID);

				driver.switchTo().window(OpenNewTabID);

				WebElement alterBoxOk = driver.findElement(By.xpath(
						"//h1[contains(text(),'Pop up boxes in HTML')]//following-sibling::div[1]//child::button"));

				action.click(alterBoxOk).build().perform();

				Alert alert = driver.switchTo().alert();

				alert.accept();

				WebElement alterConfirmationBox = driver.findElement(By.xpath(
						"//h1[contains(text(),'Pop up boxes in HTML')]//following-sibling::div[2]//child::button"));

				action.click(alterConfirmationBox).build().perform();

				alert = driver.switchTo().alert();

				alert.accept();

				WebElement promptBox = driver.findElement(By.xpath(
						"//h1[contains(text(),'Pop up boxes in HTML')]//following-sibling::div[3]//child::button"));

				action.click(promptBox).build().perform();

				alert = driver.switchTo().alert();

				System.out.println("Alert Get Text : " + alert.getText());
				alert.accept();

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Open New Tab automation successfull done ");

				driver.close();

			}
		}

		driver.switchTo().window(mainWindowID);

		driver.findElement(By.xpath(
				"//p[contains(text(),'This textbox is used for entering the text after switching back from child windows to parent window.')]//following-sibling::input"))
				.sendKeys("Open New Tab automated");

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thank Your Automation successfull Run!!!!!");

		driver.close();

	}

}

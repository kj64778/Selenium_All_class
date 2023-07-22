package com.java.WindowSHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		String homePageWindowID = driver.getWindowHandle();

		System.out.println("This is my Hope page window ID : " + homePageWindowID);

		WebElement newBrowserWindow = driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]"));

		action.click(newBrowserWindow).build().perform();

		Set<String> multipleWindows = driver.getWindowHandles();

		Iterator<String> itr = multipleWindows.iterator();

		while (itr.hasNext()) {
			String newBrowserWindowID = itr.next();

			if (!homePageWindowID.equals(newBrowserWindowID)) {
				System.out.println("This is new browser Window ID : " + newBrowserWindowID);
				driver.switchTo().window(newBrowserWindowID);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();
			}
		}

		driver.switchTo().window(homePageWindowID);

		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

}

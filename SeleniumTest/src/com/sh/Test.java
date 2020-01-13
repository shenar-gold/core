package com.sh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/shynarjeleunova/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.quintrixsolutions.com/");
		WebElement link;
		link = driver.findElement(By.partialLinkText("BLOG"));
		link.click();
		Thread.sleep(1000);

		driver.quit();
	}

}

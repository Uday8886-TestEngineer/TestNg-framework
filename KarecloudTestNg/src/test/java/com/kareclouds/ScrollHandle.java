package com.kareclouds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollHandle {
	@Test
	public void scrollHandle() throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.awwwards.com/mubien/");
		driver.manage().window().maximize();
		WebElement btn= driver.findElement(By.xpath("//a[@href='/pro']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",btn );
		 js.executeScript("window.scrollBy(0,5000);");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,10000);");

		 
		 
		
		
		
	}

}

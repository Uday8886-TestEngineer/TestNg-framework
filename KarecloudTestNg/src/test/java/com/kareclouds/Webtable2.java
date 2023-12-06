package com.kareclouds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable2 {
    	@Test
    	public void webtable() {
    		ChromeDriver driver=new ChromeDriver();
    		driver.get(null);
    		driver.manage().window().maximize();
    		List<WebElement>totalcolumns=driver.findElements(By.xpath("//table@id='table1'/thead/tr/th"));
    		System.out.println("number of columns in table is "+totalcolumns.size());
    		List<WebElement>totalrowcount=driver.findElements(By.xpath("//table@id='table1'/tbody/tr"));
    		System.out.println("number of rows in table is "+totalrowcount.size());
    		List<WebElement>name=driver.findElements(By.xpath("//table@id='table1'/thead//span"));
    		System.out.println();
    		System.out.println();
    		for (int i = 0; i <names.size(); i++) {
    			System.out.println(names.get(i).getText()+" ");
    		}
    		System.out.println();
    		for (int i=0; i <=totalrowcount.size();i++) {
    			for (int j = 0; j <=totalcolumns.size(); j++) {
    				WebElement data=driver.findElement(By.)
    			}
    			
    		}

    		
    	}
    	
 
}

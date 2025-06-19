package com.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {

	public WebElement verifyHP(WebDriver driver, String productName) {
		
		return driver.findElement(By.xpath("//a[text()='"+productName+"']"));
		
	}
	
	public WebElement addToCT1(WebDriver driver, String productName) {
		
		return driver.findElement(By.xpath("//a[text()='"+productName+"']"));
			
	}
	
	public WebElement addToCT2(WebDriver driver, String productName) {
		
		return driver.findElement(By.xpath("//h2[text()='"+productName+"']//parent::div//descendant::a"));
	}
	
	
	public void captureScreenshot(WebDriver driver) {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		long time = System.currentTimeMillis();
		File dest  = new File("Screenshots/"+time+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	}
	
	
		
	
	
	
	


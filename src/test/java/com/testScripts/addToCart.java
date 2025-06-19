package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.genericLib.CommonUtils;
import com.listeners.EventList;
import com.objectRepo.Homepage;

@Listeners(EventList.class)
public class addToCart extends Base {

	CommonUtils cu = new CommonUtils();
	Homepage hp = PageFactory.initElements(driver, Homepage.class);

	@Test
	public void addToCartTest() {
		//eTest= extent.createTest("Product Added To the Cart ..");
		cu.addToCT1(driver, "Nokia lumia 1520").click();
		cu.addToCT2(driver, "Nokia lumia 1520").click();
		
		
		

		// driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		// driver.findElement(By.xpath("//h2[text()='Nokia lumia
		// 1520']//parent::div//descendant::a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//Assert.fail();

		//cu.captureScreenshot(driver);

		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		try {
			driver.findElement(By.xpath("//td[text()='Nokia lumia 1520']"));

			System.out.println("AddToCart TestCase is Passed");
		} catch (NoSuchElementException e) {

			System.out.println("AddToCart TestCase is Failed...");
			System.out.println("Webelement is Not Found...");
		}

	}

}

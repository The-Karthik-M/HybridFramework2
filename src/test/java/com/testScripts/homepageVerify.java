package com.testScripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.genericLib.CommonUtils;
import com.listeners.EventList;

@Listeners(EventList.class)


public class homepageVerify extends Base {
	CommonUtils cu = new CommonUtils();

	@Test
	public void verifyHomepageTest() {
		
		//eTest= extent.createTest("Homepage Verification...");
		cu.verifyHP(driver, "Nokia lumia 1520").click();

		// driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		
		cu.captureScreenshot(driver);
		
		driver.navigate().back();
		Reporter.getCurrentTestResult().getName();
		System.out.println("Test Case Passed");

	}



}



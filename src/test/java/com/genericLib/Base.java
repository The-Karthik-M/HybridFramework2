package com.genericLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.objectRepo.Homepage;

public class Base {
 
	public static WebDriver driver;
	WebDriverWait wait;
	Homepage hp;
	public static ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extentReport.html");
	public static ExtentTest eTest;
	
	
	/*
	public static ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extentReport.html");
	public static ExtentTest eTest;
	*/

	
	
@BeforeTest
public void configBT() {
	extent.attachReporter(spark);
	//driver= new ChromeDriver();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demoblaze.com/");
			
}

@BeforeMethod
public void configBM() {
	hp = PageFactory.initElements(driver, Homepage.class);
	hp.getLoginDM().click();
	hp.getUserNameBox().sendKeys("karthikm");
	hp.getPasswordBox().sendKeys("Karthik@123");
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(hp.getLoginButton()));
	hp.getLoginButton().click();
	
	/*
	driver.findElement(By.xpath("//a[@id='login2']")).click();
	driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("karthikm");
	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Karthik@123");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	*/ 
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



@AfterMethod
public void configAM() {
	hp.getLogoutButton().click();
	
	//driver.findElement(By.xpath("//a[@id='logout2']")).click();
	
}




@AfterTest
	public void ConfigAT() {
	
	//extent.flush();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.quit();
}
}

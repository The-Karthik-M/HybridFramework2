package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericLib.Base;

public class Homepage {

	
	/*
	WebElement loginDM = driver.findElement(By.xpath("//a[@id='login2']"));
	WebElement userNameBox =driver.findElement(By.xpath("//input[@id='loginusername']"));
	WebElement passwordBox  =driver.findElement(By.xpath("//input[@id='loginpassword']"));
	WebElement loginButton =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	WebElement logoutDM =driver.findElement(By.xpath("//a[@id='logout2']")); 
*/
	
	@FindBy(xpath = "//a[@id='login2']")
	private WebElement loginDM;
	
	@FindBy(id="loginusername")
	private WebElement userNameBox;
	
	@FindBy(id="loginpassword")
	private WebElement passwordBox;
	
	@FindBy(xpath ="//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='logout2']")
	private WebElement logoutButton;

	public WebElement getLoginDM() {
		return loginDM;
	}

	public WebElement getUserNameBox() {
		return userNameBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}


	
	
	
	
}
	


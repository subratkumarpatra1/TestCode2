package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");

	public void typeEmail(String data) {
		driver.findElement(email).sendKeys(data);
	}

	public void typePwd(String data) {
		driver.findElement(pwd).sendKeys(data);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}

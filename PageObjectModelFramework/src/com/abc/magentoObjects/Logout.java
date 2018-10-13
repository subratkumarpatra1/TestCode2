package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	By logout=By.id("Log Out");

	public Logout(WebDriver driver) {
		this.driver=driver;
	}

	public void clickOnLogout() {
		driver.findElement(logout).click();
	}

}

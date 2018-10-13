package com.abc.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObjects.Login;
import com.abc.magentoObjects.Logout;
import com.abc.magentoObjects.Main;

public class MagentoApp {

	public static void main(String[] args) throws Exception{
		
		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
		
		Main m = new Main(driver);
		m.clickOnMyacc();
		Thread.sleep(3000);
		
		Login l = new Login(driver);
		l.typeEmail("subramanyaraj87@gmail.com");
		l.typePwd("Welcome123");
		l.clickOnLogin();
		Thread.sleep(3000);
		
		Logout l1 = new Logout(driver);
		l1.clickOnLogout();

		Thread.sleep(3000);

		driver.quit();
	}
}

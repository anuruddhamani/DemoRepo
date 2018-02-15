package com.fbLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	 void browser(){
		 System.setProperty("webdriver.firefox.marionette", "D:/Selenium/software_jha/Browser-server/firefox-path/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("anuruddhamani@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("9651723922",Keys.ENTER);
			driver.findElement(By.id("userNavigationLabel")).click();
			
	}

}

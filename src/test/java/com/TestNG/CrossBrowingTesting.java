package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowingTesting {
	
	WebDriver w;
	@Test
	@Parameters("browser")
	
	public void GoogleSearch(String browser) throws Exception {
		
		switch (browser) {
		case "firefox":
			w= new FirefoxDriver();
			break;
			
		case "chrome":
			w= new ChromeDriver();
			break;
		default:
			break;
		}	
		w.get("https://www.google.com");
		w.findElement(By.id("APjFqb")).sendKeys("JObs");
		Thread.sleep(2000);
		w.quit();
		
	}
	

}

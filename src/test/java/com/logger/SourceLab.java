package com.logger;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceLab {

	public static void main(String[] args) {
		 
		
		Logger log = LogManager.getLogger();
		
		
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		log.info("Chrome browser ha sbeen launch");
		w.get("https://www.saucedemo.com/");
		log.info("user has open saurce demo site");
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		log.info("User enter the user name  as'standard_user' in the filed");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		log.info("User enter the Password  as'secret_sauce' in the filed");
		w.findElement(By.id("login-button")).click();
		log.info("User click on login button");
		
		
		
		
		try {
			w.findElement(By.id("react-burger-menu-btn")).click();
			log.info(" click on menu button");
			w.findElement(By.linkText("Logout")).click();
			log.info(" click on logout button");
			
		} catch (Exception e) {
			log.info("user unable to Login");
	}

	}
}
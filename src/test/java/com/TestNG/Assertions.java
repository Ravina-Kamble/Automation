package com.TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	
	@Test
	
	public void Google() {
		
		WebDriver w =new ChromeDriver();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("mobile",Keys.ENTER);
		
		String exp = " mobile- Google search";
		String act = w.getTitle();
		
	//Hard Assertion
	//	Assert.assertEquals(act, exp);		
	
	//Soft Assertion
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(act, exp);
		
		w.quit();
		
		soft.assertAll();
		
		
	}

}

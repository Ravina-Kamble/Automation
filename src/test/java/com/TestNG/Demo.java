package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo {
//WebDriver w =new ChromeDriver();
@Test (priority = 1) //,invocationCount = 3)
public void GoogleSearch() throws Exception{
	WebDriver w =new ChromeDriver();
	w.get("https://www.google.com/");
	Thread.sleep(5000);
	w.quit();
}	
	@Test(priority = 2)
	public void Facebook() throws Exception {
		WebDriver w = new EdgeDriver(); 
		w.get("https://www.facebook.com/");
		Thread.sleep(5000);
		w.quit();
	}
	




	
	
}

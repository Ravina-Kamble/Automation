package com.TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	WebDriver w;
	
	@BeforeClass
	public void LaunchBrowsr() {
	  w =new ChromeDriver();
	}
	@BeforeMethod //pre condition --->> search ->> shose & mobile	
	public void openbrowser() {
		
			w.get("https://www.flipkart.com/");
	}
	@Test //test condition for shose	
	public void shose() {		
		w.findElement(By.name("q")).sendKeys("shose",Keys.ENTER);
		w.findElement(By.partialLinkText("MIKE (N) Running Shoes For Men")).click();
		
	}	
	@Test //test condition for mobile	
	public void mobile() {
		w.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		w.findElement(By.partialLinkText("Apple iPhone 15 (Black, 128 GB)")).click();;
	}
 	@AfterClass
	public void quit() throws Exception {
		Thread.sleep(2000);
		w.quit();
		
	}
	
}

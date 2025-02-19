package HybridFW;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemo {

	public static void main(String[] args) throws Exception {

		WebDriver w =new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://www.saucedemo.com/");
		SaurceDemoRepo r =new SaurceDemoRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\Demouser.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i = 1; i <=6; i++) {
			XSSFRow row =sheet.getRow(i);
			XSSFCell username =row.getCell(0);
			XSSFCell password =sheet.getRow(1).getCell(1);
			System.out.println(username.toString());
			for(int j=1 ; j<=3 ;j++) {
				XSSFRow row1 =sheet.getRow(j);
				XSSFCell teststep =row1.getCell(2);

				String convert =teststep.toString();
				try {
					if (convert.equals("Login")) {
						Thread.sleep(2000);
						r.login(username.toString(),password.toString()); 
					}else if (convert.equals("Add to Cart")) {
						Thread.sleep(2000);
						r.addToCart();
					}else if (convert.equals("Logout")) {
						r.logout();
						Thread.sleep(2000);
					}

				} catch (Exception e) {
					TakesScreenshot tss =(TakesScreenshot)w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new
							File("C:\\Users\\user\\eclipse-workspace\\Akshay_G\\"+ username.toString()+" "+password.toString()+".png"));
				}


			}



		}




	}

}

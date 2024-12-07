package HybridFW;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountig {

	public static void main(String[] args) {


		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("");

	}

}

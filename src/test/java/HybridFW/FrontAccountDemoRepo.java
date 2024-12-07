package HybridFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountDemoRepo { 
	
	public FrontAccountDemoRepo(WebDriver wd) {
		PageFactory.initElements(wd,this);
			
	}
	
	@FindBy (css ="input[name=\"user_name_entry_field\"]")
	WebElement username;
	@FindBy (css= "input[name=\"password\"]")
	WebElement password;
	@FindBy (css= "input[type=\"submit\"]")
	WebElement loginbtn;
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	
	public void login (String user,String pass) {
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}

}

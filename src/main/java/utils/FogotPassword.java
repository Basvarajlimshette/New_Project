package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FogotPassword {
       
       
	By username= By.name("username");
	
	By Resetpassbutton=By.xpath("//button[@type='submit']");
	
	WebDriver driver;
	
	public FogotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterresetpassword() {
		driver.findElement(Resetpassbutton).click();
	}
	
	
	
	
	
	
	
	
	
	
}

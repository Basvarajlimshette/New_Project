package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

	By username=By.name("username");
	
	By password=By.name("password");
	
	By LoginButton=By.tagName("button");
	
	By Resetpassword=By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]");
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys("user");;
	}
	
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys("pass");
	}
	
	public void loginbutton() {
		driver.findElement(LoginButton).click();
	}
	
	public void dologin(String user,String pass) {
		
		
		enterusername("user");
		enterpassword("pass");
		loginbutton();
	}
	
	public FogotPassword Resetpassword() {
		driver.findElement(Resetpassword).click();
		return new FogotPassword(driver);
	}
}

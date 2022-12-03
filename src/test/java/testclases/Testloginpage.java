package testclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testbase.Testlogreset;
import utils.LoginPage;

public class Testloginpage extends Testlogreset{

	@Test
	public void LoginTest() throws InterruptedException {
		
		LoginPage page=new LoginPage(driver);
		
		page.enterusername("admin");
		page.enterpassword("admin123");
		Thread.sleep(5000);
		page.loginbutton();
		
	}
	
	@Test
	public void Invalidcredentials() throws InterruptedException {
		
		LoginPage page1=new LoginPage(driver);
		page1.enterpassword("abcd");
		page1.enterpassword("abc123");
		Thread.sleep(5000);
		page1.loginbutton();
		
	}
	
	
}

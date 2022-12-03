package testclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testbase.Testlogreset;
import utils.FogotPassword;
import utils.LoginPage;

public class Resetforgotpassword extends Testlogreset{
	
	
	
	
	@Test
	public void Resetpassword() throws InterruptedException {
		
//		LoginPage page=new LoginPage(driver);
//		
//		page.
		LoginPage page1=new LoginPage(driver);
		FogotPassword page=page1.Resetpassword();
		page.enterusername("ABC123");
		page.enterresetpassword();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	

}

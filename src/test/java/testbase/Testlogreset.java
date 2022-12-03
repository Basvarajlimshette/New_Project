package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogreset {
	
	protected WebDriver driver;
	@BeforeMethod
	public void beforemethod() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void Aftermethod() {
		driver.quit();
	}
	
	

}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenFirstProgram {
	
	public static void main(String[]args) {
	
	
  // uses this approach instead of system.setproperty.
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/browser-windows");
	
	
	
	
	
	}
	
	
	
	
	
	
}

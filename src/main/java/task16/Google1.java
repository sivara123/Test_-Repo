package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google1 {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\laksh\\eclipse-workspace\\MavenLearning\\Driver\\geckodriver.exe"); 
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("The Current URL = "+currentUrl);
		
		driver.navigate().refresh();
		
		driver.close();
		
	}
  }

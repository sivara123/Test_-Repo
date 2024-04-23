package task15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
// First we need to set the property for the browser based on your wish like chrome,Firefox etc.
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		// Then we need to call the web driver to launch
		WebDriver driver = new ChromeDriver();
		
		// maximum the browser 
		driver.manage().window().maximize();
		System.out.println("Chrome lanuced successfully");
		
		// by keyword using get we call the URL to launch in browser
		driver.get("https://www.google.co.in/");
		
		// Then wait for some to hold
		Thread.sleep(2000);
		
		// Then close the application
		driver.close();
	}

}

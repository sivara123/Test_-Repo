package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome lanuced successfully");
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		WebElement p = driver.findElement(By.name("q"));
		p.sendKeys("Selenium Browser Driver");
		p.submit()	;	
		
		Thread.sleep(10000);
		
		driver.close();
	}

}

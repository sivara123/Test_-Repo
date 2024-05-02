package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "./Driver.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("amazon india");
		element.submit();
		driver.findElement(Bycssslector("div[class='CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf'] span")).click();
	
		
		
		
		
		
		
		
		
	}

	private static By Bycssslector(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By Byrelativexpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By BypartialLinkText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By Byclass(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By ByLinkText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

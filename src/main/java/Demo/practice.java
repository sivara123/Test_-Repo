package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "./Driver.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement element = driver.findElement(By.id("j_idt88:j_idt104"));
		element.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Hi");
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://practicetestautomation.com/practice-test-login/"); 
		
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='form']/div[1]/input[1]")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

}

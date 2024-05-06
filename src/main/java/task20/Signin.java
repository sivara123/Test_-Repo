package task20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.guvi.in/"); 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.findElement(By.xpath("//*[@id='accountGroup']/ul/li[2]/a")).click();
		
		driver.findElement(By.id("name")).sendKeys("siva");
		driver.findElement(By.id("email")).sendKeys("siva1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Siva123");
		driver.findElement(By.id("mobileNumber")).sendKeys("7894561230");
		driver.findElement(By.id("signup-btn")).click();
		
		Thread.sleep(5000);
		
		driver.get("https://www.guvi.in/");
		
		driver.findElement(By.xpath("//*[@id='accountGroup']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//form[@id='login-form']/div/input")).sendKeys("siva1@gmail");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Siva123");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}

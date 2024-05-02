package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.guvi.in/register");
		
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("siva");
		driver.findElement(By.cssSelector("input#name")).sendKeys("siva");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("siva");
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[1]/input")).sendKeys("siva");
		
		driver.findElement(By.id("email")).sendKeys("iva@gmail.com");
		driver.findElement(By.className("email")).sendKeys("siv@gmail.com"); 
		driver.findElement(By.cssSelector("input#email")).sendKeys("si@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sia@gmail.com");
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[2]/input")).sendKeys("iva@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Siva123");
		driver.findElement(By.className("password")).sendKeys("Siva123"); 
		driver.findElement(By.cssSelector("input#password")).sendKeys("Siva123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Siva123");
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[3]/input")).sendKeys("Siva123");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("123456789");
		driver.findElement(By.className("form-control countrycode-left")).sendKeys("123456789"); 
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[4]/div[1]/input")).sendKeys("123456789");
		
	}

}

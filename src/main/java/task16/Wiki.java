package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.wikipedia.org/");
		
		WebElement element = driver.findElement(By.id("searchInput"));
		element.sendKeys("Artificial intelligence");
		element.submit();
		
	     driver.findElement(By.id("ca-history")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The Title of page = "+title);
	}

}

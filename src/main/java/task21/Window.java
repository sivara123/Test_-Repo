package task21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/windows"); 
		String window = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> child = driver.getWindowHandles();
		for (String newwindow : child) {
			driver.switchTo().window(newwindow);
		}
	System.out.println(driver.getTitle());	
	driver.close();
	driver.switchTo().window(window);
	System.out.println(driver.getTitle());	
	driver.close();
	}

}

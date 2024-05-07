package task21;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/iframe"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Hello People"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
	}

}

package task21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://the-internet.herokuapp.com/nested_frames"); 
		
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		System.out.println("No of the Frames = "+ frame.size());
		
		driver.switchTo().frame(0);
		WebDriver left = driver.switchTo().frame("//*[@name='frame-left']");
	    System.out.println(left);
	
		
	}

}

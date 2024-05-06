package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webcomponent {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
		
	System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://jqueryui.com/datepicker/");
	
	WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(frame); 
	
	driver.findElement(By.className("hasDatepicker")).click(); 
	//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")).click();
	
	driver.findElement(By.xpath("//span[text()='Next']")).click(); 
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]/a")).click();
	
	String Date = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]/a")).getText();
	
	System.out.println("The Selectedd date is  "+ Date);
	driver.close();
  }
}

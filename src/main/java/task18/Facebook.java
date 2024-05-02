package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		element.click(); 
		
		Thread.sleep(5000);
		
	    driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");  
		driver.findElement(By.name("reg_passwd__")).sendKeys("987654321");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select myday = new Select(day);
		myday.selectByValue("11");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select bmonth  = new Select(month);
		bmonth.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select byear  = new Select(year);
		byear.selectByVisibleText("1985");
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='2']"));
		System.out.println(radiobtn.isEnabled());
		radiobtn.click();		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
			
  }


}


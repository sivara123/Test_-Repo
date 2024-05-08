package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://phptravels.com/demo");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div/input")));
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div/input"));
		fn.sendKeys("Siva");
		
		driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/div/input")).sendKeys("M");
		driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/input")).sendKeys("Siva M");
		driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/input")).sendKeys("siva12@gmail.com");
		
		WebElement num1 = driver.findElement(By.xpath("//*[@id=\"numb1\"]"));
		String Value1 = num1.getText();
		Integer n1 = Integer.valueOf(Value1);
		
		WebElement num2 = driver.findElement(By.xpath("//*[@id=\"numb2\"]"));
		String value2 = num2.getText();
		Integer n2 = Integer.valueOf(value2);
		
		int add =n1+n2;
		
		String Result = String.valueOf(add);
		
	    driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys(Result);
		driver.findElement(By.xpath("//*[@id=\"demo\"]")).click();
		
		Thread.sleep(5000);
		
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desk = new File("./Snap/img.png");
		FileHandler.copy(file, desk);
		
		driver.close();
		
		
		
		
	}

}

package task24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ExecutePage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		PageFactory.initElements(driver,SignInPage.class);
		PageFactory.initElements(driver,LoginPage.class);
		
		/*SignInPage.signinclick.click();
		SignInPage.usernname.sendKeys("siva1");
		SignInPage.password.sendKeys("siva123");
		SignInPage.Signupbutton.click();*/
		
		LoginPage.loginClick.click();
		LoginPage.username.sendKeys("siva1");
		LoginPage.password.sendKeys("siva123");
		LoginPage.loginsubmit.click();
	}

}

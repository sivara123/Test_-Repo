package Demo;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DataPage {

	public static void main(String[] args, SearchContext Pagefactor) {
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://practicetestautomation.com/"); 
		PageFactory.initElements(Pagefactor, driver);
		
		Pagefactor pf = new Pagefactor(driver);
		pf.praticetab.click();
		pf.testlogin.clear();
		pf.username.sendKeys("student");
		pf.password.sendKeys("Password123");
		pf.submit.click();
		pf.logout.click();
		
		
		
		/* lp = new LoginPage();
		
		lp.practicetab(driver).click();
		lp.Testloginpagelink(driver).click();
		lp.username(driver).sendKeys("student");
		lp.password(driver).sendKeys("Password123");
		lp.submitbtn(driver).click();
		lp.logoutbtn(driver).click();*/
	}

}

package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.demoblaze.com/");
		String actualtitle = driver.getTitle();
		String excptedtitle = "STORE";
		System.out.println("Actual Title = "+actualtitle);
		
		
		if(actualtitle.equals(excptedtitle)) {
			System.out.println("Page Landed on correct website  " + actualtitle);
		}else {
			System.out.println("Page Not Landed on correct website");
		}
		
		driver.close();
	}

}

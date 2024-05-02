package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		driver.findElement(By.cssSelector("div#droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		
		System.out.println(drop.getCssValue("background"));
		
		System.out.println(drop.getCssValue("color"));
		
		String text = drop.getText();
		
		System.out.println("The Text is "+ text );
		
		driver.close();
		
	}

}

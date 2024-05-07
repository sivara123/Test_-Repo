package task21;

import java.time.Duration;
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
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
				
		        WebElement topFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		        driver.switchTo().frame(topFrame);

		        int frameCount = driver.findElements(By.cssSelector("frame")).size();
		        if (frameCount == 3) {
		            System.out.println("There are three frames on the page.");
		        } else {
		            System.out.println("There are not three frames on the page.");
		        }

		        WebElement leftFrame = driver.findElement(By.cssSelector("frame[name='frame-left']"));
		        driver.switchTo().frame(leftFrame);

		        String leftFrameText = driver.findElement(By.tagName("body")).getText();
		        if (leftFrameText.contains("LEFT")) {
		            System.out.println("Text 'LEFT' found in the left frame.");
		        } else {
		            System.out.println("Text 'LEFT' not found in the left frame.");
		        }

		        driver.switchTo().defaultContent();
		        driver.switchTo().frame(topFrame);
	         
		        WebElement middleFrame = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		        driver.switchTo().frame(middleFrame);

		        String middleFrameText = driver.findElement(By.tagName("body")).getText();
		        if (middleFrameText.contains("MIDDLE")) {
		            System.out.println("Text 'MIDDLE' found in the middle frame.");
		        } else {
		            System.out.println("Text 'MIDDLE' not found in the middle frame.");
		        }
		        
		        driver.switchTo().defaultContent();
		        driver.switchTo().frame(topFrame);

		        WebElement rightFrame = driver.findElement(By.cssSelector("frame[name='frame-right']"));
		        driver.switchTo().frame(rightFrame);

		        // Verify that the right frame has a text "RIGHT"
		        String rightFrameText = driver.findElement(By.tagName("body")).getText();
		        if (rightFrameText.contains("RIGHT")) {
		            System.out.println("Text 'RIGHT' found in the right frame.");
		        } else {
		            System.out.println("Text 'RIGHT' not found in the right frame.");
		        }

		        driver.switchTo().defaultContent();

		        WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		        driver.switchTo().frame(bottomFrame);

		        String bottomFrameText = driver.findElement(By.tagName("body")).getText();
		        if (bottomFrameText.contains("BOTTOM")) {
		            System.out.println("Text 'BOTTOM' found in the bottom frame.");
		        } else {
		            System.out.println("Text 'BOTTOM' not found in the bottom frame.");
		        }
			
		        driver.switchTo().defaultContent();

		        String pageTitle = driver.getTitle();
		        if (pageTitle.equals("Frames")) {
		            System.out.println("Page title is 'Frames'.");
		        } else {
		            System.out.println("Page title is not 'Frames'.");
		        }
		    
		        driver.quit();
			
	}

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebElement practicetab(WebDriver driver) {
	
	return driver.findElement(By.id("menu-item-20"));

  }
public WebElement Testloginpagelink(WebDriver driver) {
	return driver.findElement(By.xpath("//*[text()='Test Login Page']"));
	
 }
public WebElement username(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id='form']/div[1]/input[1]"));
 }
public WebElement password(WebDriver driver) {
	return driver.findElement(By.id("password"));
	}
public WebElement submitbtn(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
}
public WebElement logoutbtn(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
}
}

package task24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends ProjectSpecification {


	public Login(WebDriver driver) {
		
	    this.driver = driver;
		PageFactory.initElements(driver,this);
		
}
	@FindBy(id="login2") public static WebElement loginClick;
	@FindBy(id="loginusername") public static WebElement username;
	@FindBy(id="loginpassword") public static WebElement password;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]") public static WebElement loginsubmit;


public Login login() {
	loginClick.click();
	return this;
	
}

public Login loginusername() {
	username.sendKeys("SivaM");
	return this;
}
public Login loginpassword() {
	password.sendKeys("Siva@123");
	return this;
}
public Login loginsubmit() {
	loginsubmit.click();
	return this;
 } 
}

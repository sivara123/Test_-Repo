package task24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin extends ProjectSpecification{

	@FindBy(id ="signin2") public static WebElement signinclick;
   	@FindBy(id="sign-username")public static WebElement username;
   	@FindBy(id="sign-password")public static WebElement password;
   	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")public static WebElement Signupbutton;

   	public Signin (WebDriver driver) {
		
	    this.driver=driver;
		PageFactory.initElements(driver,this);
}
   	
   	public Signin pagesignin() {
   		signinclick.click();
		return this;
   		
   	}
   	public Signin entername() {
   	username.sendKeys("SivaM");
		return this;
   		
   	}
	public Signin enterpassword() {
		password.sendKeys("Siva@123");
			return this;
	   		
	   	}
	public Signin signinbutton() {
		Signupbutton.click();
		return this;
   	
  }
		
}

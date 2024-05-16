package task24;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="login2") public static WebElement loginClick;
	@FindBy(id="loginusername") public static WebElement username;
	@FindBy(id="loginpassword") public static WebElement password;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]") public static WebElement loginsubmit;
	

}

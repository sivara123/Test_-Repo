package task24;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	@FindBy(id ="signin2") public static WebElement signinclick;
	@FindBy(id="sign-username")public static WebElement usernname;
	@FindBy(id="sign-password")public static WebElement password;
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")public static WebElement Signupbutton;
	
}

package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactor {
	
	WebDriver driver;
	
	public Pagefactor(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	      @FindBy(id="menu-item-2") WebElement praticetab;
	      @FindBy(xpath="//*[text()='Test Login Page']") WebElement testlogin;
          @FindBy(xpath="//*[@id='form']/div[1]/input[1]") WebElement username;
          @FindBy(id="password") WebElement password;
          @FindBy(xpath="//*[@id='submit']") WebElement submit;
          @FindBy(xpath="//*[@id=\"loop-container\\\"]/div/article/div[2]/div/div/div/a") WebElement logout;
         
}

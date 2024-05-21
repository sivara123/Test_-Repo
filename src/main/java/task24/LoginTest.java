package task24;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ProjectSpecification {
	
	@BeforeTest
	public void setdata() {
		
		
		desc = "LoginTest01";
		author = "Siva M";
		catagory = "unit test";
		
	}
	
	
@Test
public void loginexecute() {
	
	Login obj1 = new Login(driver);
		
	obj1.login().loginusername().loginpassword().loginsubmit();
	
	
	}
}

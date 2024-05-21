package task24;

import org.testng.annotations.Test;

public class SigninTest extends ProjectSpecification {

	@Test
	public void executesignin() {
		
		Signin obj = new Signin(driver);
		
		obj.pagesignin().entername().enterpassword().signinbutton();
	
		
     }
  }

package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginProcess {
	
	static void loginMethod(WebDriver driverX){
		driverX.get(OldStaticVariable.baseURL);
		driverX.findElement(By.name("userName")).sendKeys(OldStaticVariable.adminID);
		driverX.findElement(By.name("password")).sendKeys(OldStaticVariable.adminPWD);
		
		driverX.findElement(By.cssSelector(OldStaticVariable.loginButton)).click();
		
	}

}

package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOperation {
		
	static void Loginmethod(WebDriver driverA){	
		driverA.get("http://118.67.220.50/unifiedeagro/user/list");
		
		driverA.findElement(By.name("userName")).sendKeys(OldStaticVariable.adminID);
		driverA.findElement(By.name("password")).sendKeys(OldStaticVariable.adminPWD);
		driverA.findElement(By.xpath("//*[@id='frmUserLogin']/div/div[4]/button")).click();
		
	}
		
	
	
}

package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartReg {

	@Test
	public void userRegistration(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/shop/");
		
		//click on My Account menu
		driver.findElement(By.linkText("My Account")).click();
		//Click on Register link
		driver.findElement(By.linkText("Register")).click();
		
		//Verify registration page
		String expectedRegPageHeader= "Register Account";
		String appRegPageHeader = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText();
		
//		System.out.println(appRegPageHeader +" found from the application");
		Assert.assertEquals(appRegPageHeader, expectedRegPageHeader, "\n WRONG PAGE HEADER FOUND!!");
		
		//Registration process starts from here
		
//		driver.findElement(By.id("input-firstname")).sendKeys(StaticVariable.firstName);
//		driver.findElement(By.id("input-lastname")).sendKeys(StaticVariable.lastName);
		
		driver.findElement(By.id("input-email")).sendKeys(OldStaticVariable.custEmail);
		driver.findElement(By.id("input-telephone")).sendKeys(OldStaticVariable.custPhoneNo);
		
		//password info
		driver.findElement(By.id("input-password")).sendKeys(OldStaticVariable.adminPWD);
		driver.findElement(By.id("input-confirm")).sendKeys(OldStaticVariable.custPassword);
		
		//Privacy policy
		driver.findElement(By.name("agree")).click();
		
		// Click on continue button
		driver.findElement(By.cssSelector("input.btn")).click();
		
		//Verify Account creation
		String verifyAccount = driver.findElement(By.id("content")).getText();
		System.out.println(verifyAccount);
//		Assert.assertEquals(verifyAccount, "Your Account Has Been Created!", "\n WRONG MESSAGE FOUND");
		
		// CONTINUE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
		
		
		// VERIFY LOGIN
		String verifyLogin = driver.findElement(By.id("content")).getText();
		Assert.assertEquals(verifyLogin, "My Account", "WRONG MESSAGE FOUND ON LOGIN");
		
//		driver.close();
		
		
		
		
		
	}
	
}

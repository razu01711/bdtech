package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TCAddNewCustomer2 {
	WebDriver driver = new ChromeDriver();
		
	////Click to Create button
	public void clickToCreate(){
		try{
			
		StaticMethods.createButtonClick(driver);
						
	} catch (Exception e){
		e.printStackTrace();
	}	
	}
	
	///Button functions check
	
//	@Test
//	public void buttonFunctionTest(){
//		try{
//		StaticMethods.saveButton(driver);
//		Thread.sleep(3000);
//		StaticMethods.savenCloseButton(driver);
//		Thread.sleep(3000);
//	} catch(Exception e){
//		e.printStackTrace();
//	}
//	}
//	
	
	
	
	
	////////Data entry///////////
	@Test (priority =5)
	public void addCustomer(){
		try{
		StaticMethods.loginProcess(driver);
		StaticMethods.loginVerify(driver);
		clickToCreate();	
		StaticMethods.saveButton(driver);
		Thread.sleep(3000);
		StaticMethods.savenCloseButton(driver);
		Thread.sleep(3000);
						
		
			driver.findElement(By.cssSelector("div[title='Please Select..']")).click();
			Thread.sleep(3000);
						
			driver.findElement(By.cssSelector("div[title='&nbsp;...Customer']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.name("firstName")).sendKeys(StaticVariable2.firstName);
			driver.findElement(By.name("lastName")).sendKeys(StaticVariable2.lastName);
			
			driver.findElement(By.name("email")).sendKeys(StaticVariable2.email);
			driver.findElement(By.name("userName")).sendKeys(StaticVariable2.userName);
			driver.findElement(By.id("password")).sendKeys(StaticVariable2.password);
			driver.findElement(By.name("rePassword")).sendKeys(StaticVariable2.password);		
			
			///Upload photo
			driver.findElement(By.name("userPhoto")).sendKeys("D:\\java.jpg");
			Thread.sleep(3000);
			
			StaticMethods.resetButton(driver);
			Thread.sleep(3000);
			StaticMethods.closeButton(driver);
			Thread.sleep(3000);
			
			 
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
}

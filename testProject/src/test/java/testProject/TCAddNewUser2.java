package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.testng.annotations.Test;

public class TCAddNewUser2 {
	WebDriver driver = new FirefoxDriver();


	@Test (priority = 0)
	public void homepage(){
		StaticMethods.loginProcess(driver);

	}	
	
	
	@Test (priority = 1)
	public void createUser(){
		try{
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/user/list");
		//Click on create button
//		((WebElement) StaticVariable2.createButton).click();
		driver.findElement(By.className("create")).click();
		
		System.out.println("method createuser");
		
		
	//==========================Scroll Starts=========//
		//Scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//scroll the main web page till end.		
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//page scroll
			Thread.sleep(3000);


			WebElement elementForm = driver.findElement(By.id("frmCreate"));	//form scroll

			Coordinates cor=((Locatable)elementForm).getCoordinates();
			cor.inViewPort();
			
			Thread.sleep(3000);
			
		///Scroll done/Finished

		
		
		//method call for saveButton from AllButtonAction.java class
			AllButtonAction2.saveButton(driver);
			driver.findElement(By.id("address1")).sendKeys("Address1, Dhaka Bangladesh");
			Thread.sleep(3000);
			AllButtonAction2.resetButton(driver);
			
			AllButtonAction2.savenCloseButton(driver);			
			AllButtonAction2.closeButton(driver);
			
			
			
			System.out.println("TCAddNewUser2 executed==========");

	}	catch (Exception e){
		e.printStackTrace();
	}
	}
}

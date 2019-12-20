package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Locatable;

public class AddCustomer {
	WebDriver driver = new FirefoxDriver();
//	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 0)
	public void addfertilizerStock(){
		try{

		LoginOperation.Loginmethod(driver);		
		
		driver.get(OldStaticVariable.customerRegUrl);
		
		driver.findElement(By.cssSelector("#body-container > div.common-radius > div.toolPanel.button-toolbar > div > div > a")).click();
		Thread.sleep(3000);
//		;
		
		
		
		//=====Scroll========
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll the main web page till end.		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//page scroll
		Thread.sleep(3000);
		
		
		WebElement elementForm = driver.findElement(By.id("frmCreate"));	//form scroll
		
		Coordinates cor=((Locatable)elementForm).getCoordinates();
		cor.inViewPort();
		Thread.sleep(3000);
		//=============Scroll End===========
		
		
		driver.findElement(By.name("userPhoto")).sendKeys("E:\\image\\java003.jpg");
		
		driver.findElement(By.className("btnSaveClose")).click();

			
		}catch (Exception e){
			e.printStackTrace();
		}
		

		
	
	
	
}

	private void loginasAdmin() {
		// TODO Auto-generated method stub
		
	}
}

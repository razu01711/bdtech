package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TCButtonActions2 {
	WebDriver driver = new FirefoxDriver();


	@Test (priority = 0)
	public void homepage(){
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
				
		//provide login credentials
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatomi04");
		
		//Click on login button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		
		System.out.println("method homepage");
	
	}	
	
	///page= Configuration> Administration > City
	
	@Test (priority = 1)
	public void saveButton(){
		try{
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/city/list");
		//Click on create button
		driver.findElement(By.className("create")).click();
		Thread.sleep(3000);
		
		WebElement saveButton = driver.findElement(By.cssSelector("#frmCreate > "
				+ "div.form-row.marL155 > button.btnSubmit"));
				saveButton.click();	
		System.out.println("method saveButton works fine");
		

	} catch (Exception e){
		e.printStackTrace();
	}
	}
		
	
	@Test (priority = 2)
	public void savenCloseButton(){
	try{
		
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/city/list");
		//Click on create button
		driver.findElement(By.className("create")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("btnSaveClose")).click();	
		System.out.println("method saveButton works fine");
		
	}catch(Exception e){
		e.printStackTrace();	
	}
	}
	

	@Test (priority = 3)
	public void resetButton(){
		try{
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/city/list");
		//Click on create button
		driver.findElement(By.className("create")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("values");
		Thread.sleep(3000);
		
		driver.findElement(By.className("btnReset")).click();	
		System.out.println("method saveButton works fine");
		
	}catch (Exception e){
		e.printStackTrace();
	}
	}
	

	@Test (priority = 4)
	public void closeButton(){
		try{
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/city/list");
		//Click on create button
		driver.findElement(By.className("create")).click();
		Thread.sleep(3000);	
		
		driver.findElement(By.className("btnClose")).click();	
		System.out.println("method saveButton works fine");
		
		System.out.println("TCButtonAction2 executed==========");
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	

}

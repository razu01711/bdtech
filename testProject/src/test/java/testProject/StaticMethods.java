package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class StaticMethods {
	
	
	////////////////LOGIN Process//////////////////
	static void loginProcess(WebDriver driverx){
		try{

//			driver.get("http://118.67.220.50/unifiedeagro/auth/login");
			driverx.get(StaticVariable2.baseURL);
					
			//provide login credentials
			driverx.findElement(By.id("userName")).sendKeys(StaticVariable2.loginUserID);
			driverx.findElement(By.id("password")).sendKeys(StaticVariable2.loginPassword);
			
			//Click on login button
			driverx.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
						
						
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	/////////////////LOGIN Verify//////////////
	static void loginVerify(WebDriver driverx){
		try{
			
			String adminProfile =driverx.findElement(By.className("profileLink")).getText();
			
			Assert.assertEquals(adminProfile, StaticVariable2.adminProfile, "Profile not match so login FAILED!");
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	//////////////Create Button Click event////////
	
	static void createButtonClick(WebDriver driverx){
		try{
			driverx.findElement(By.className("create")).click();			
			Thread.sleep(3000);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}



/////Save Button
static void saveButton(WebDriver driverx){
	try{
	
	//MOve to user list page
//	driverx.get("http://agroportal.grameen-intel.com/unifiedeagro/city/list");
//	//Click on create button
//	driverx.findElement(By.className("create")).click();
//	Thread.sleep(3000);
	
	WebElement saveButton = driverx.findElement(By.cssSelector("#frmCreate > "
			+ "div.form-row.marL155 > button.btnSubmit"));
			saveButton.click();	
	System.out.println("method saveButton works fine");
	

} catch (Exception e){
	e.printStackTrace();
}
}
	
////Save and Close Button
static void savenCloseButton(WebDriver driverx){
try{

	driverx.findElement(By.className("btnSaveClose")).click();	
	System.out.println("method saveButton works fine");
	
}catch(Exception e){
	e.printStackTrace();	
}
}

///////Reset Button
static void resetButton(WebDriver driverx){
	try{
	
	driverx.findElement(By.className("btnReset")).click();	
	System.out.println("method saveButton works fine");
	
}catch (Exception e){
	e.printStackTrace();
}
}


////Close Button
static void closeButton(WebDriver driverx){
	try{
		
	driverx.findElement(By.className("btnClose")).click();	
	System.out.println("method saveButton works fine");
	
}catch(Exception e){
	e.printStackTrace();
}
}

}


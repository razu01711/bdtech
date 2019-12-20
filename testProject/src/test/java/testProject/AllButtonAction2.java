package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllButtonAction2 {

	static void saveButton(WebDriver driverx){
		try{
	
		//Click on create button		
		WebElement saveButton = driverx.findElement(By.cssSelector("#frmCreate > "
				+ "div.form-row.marL155 > button.btnSubmit"));
				saveButton.click();	

	} catch (Exception e){
		e.printStackTrace();
	}

}



	static void savenCloseButton(WebDriver driverx){
		try{
	
		//Click on create button		
		WebElement savenCloseBtn = driverx.findElement(By.className("btnSaveClose"));	

				savenCloseBtn.click();	

	} catch (Exception e){
		e.printStackTrace();
	}


}
	
	

	static void resetButton(WebDriver driverx){
		try{
	
		//Click on create button		
		WebElement savenResetBtn = driverx.findElement(By.className("btnReset"));	

				savenResetBtn.click();	

	} catch (Exception e){
		e.printStackTrace();
	}


}
	
	

	static void closeButton(WebDriver driverx){
		try{
	
		//Click on create button		
		WebElement closeBtn = driverx.findElement(By.className("btnClose"));	

				closeBtn.click();	

	} catch (Exception e){
		e.printStackTrace();
	}


}
}


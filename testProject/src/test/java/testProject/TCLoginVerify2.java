package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCLoginVerify2 {

	@Test
	public void homepage(){
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
		
		String title = driver.getTitle(); //Store title of the page
		System.out.println("Title found = "+title);	//Print title of the page
		
		//provide login credentials
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatomi04");
		
		//Click on login button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		
		//**********Start login verify*******//
		String actualTitle = "Admin iDashboard";
		
		String foundTitle = driver.getTitle();
		System.out.println(foundTitle +" title found");
		
		Assert.assertEquals(foundTitle, actualTitle, "\"title not matched with actual....\"");

		
		//Verify profile
		String receivedProfile = driver.findElement(By.className("profileLink")).getText();
		Assert.assertEquals(receivedProfile, "gisb sqa", "profile not found");
		
		//click on profile link
		driver.findElement(By.cssSelector("#header-container > div.inner-header > div > span > a")).click();
		
		//Enter User profile page
		String title2 = driver.getTitle();
		Assert.assertEquals(title2, "Profile of gisb");
		System.out.println(title2);
		
//		System.out.println(receivedProfile);
		
		
		
		System.out.println("TCLoginVerify2 executed==========");

		
		
		
		driver.close();
		
	}
	
	
	
}

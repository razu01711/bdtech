package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TCLogin2 {
	
	@Test
	public void homepage(){
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
		
		String title = driver.getTitle();		
		System.out.println("Title found = "+title);
		
		driver.findElement(By.id("userName")).sendKeys("bangladesh");
		driver.findElement(By.id("password")).sendKeys("bangladesh");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
	}
	
	@Test
	public void validIDPwd(){
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
		String title = driver.getTitle();		
		System.out.println("Title found = "+title);
		
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatomi04e");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/buttons")).click();
	}
	
	@Test
	public void invalidIDvalidPwd(){
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
		String title = driver.getTitle();		
		System.out.println("Title found = "+title);
		
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatomi04");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
	}
	
	@Test
	public void validIDinvalidPwd(){
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
		String title = driver.getTitle();		
		System.out.println("Title found = "+title);
		
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatasdfomi04");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
	}
	
	
	

}

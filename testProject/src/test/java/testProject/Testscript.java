package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testscript {
	@Test
	public void tesngtest(){
		
	WebDriver driver = new ChromeDriver();

//		WebDriver driver = new FirefoxDriver();
		
		
		
//		driver.get("http://localhost/shop/");
////		driver.findElement(By.className("hidden-xs hidden-sm hidden-md")).click();
//		driver.findElement(By.linkText("My Account")).click();
//		
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.cssSelector("#wishlist-total")).click();
//		driver.findElement(By.cssSelector("/html/body/nav/div/div[2]/ul/li[3]/a/span")).click();
//		

		
		
		driver.findElement(By.id("uh-signin")).click();
		driver.findElement(By.id("login-username")).sendKeys("abcdef");
		driver.findElement(By.name("signin")).click();
		
	}
	

}

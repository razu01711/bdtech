package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooHomePage2 {
	@Test
	public void homePage(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.findElement(By.id("uh-signin")).click();
		
		driver.findElement(By.xpath("//input[@class = ‘gNO89b’]")).sendKeys("abcd");
		
		
		
		//LOGIN Try
//		driver.findElement(By.name("username")).sendKeys("abcd");
		
	}
	

}

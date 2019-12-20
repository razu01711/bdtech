package testProject;

import org.openqa.selenium.WebDriver;

public class StaticVariable2 {
	static WebDriver driver;
	
	/////========login credentials========/
	public static String baseURL ="http://agroportal.grameen-intel.com/unifiedeagro/";
	public static String loginUserID = "gisb_sqa@grameen-intel.com";
	public static String loginPassword = "Yatomi04";
	
	/////========Login Verify========/
	public static String adminProfile= "gisb sqa";
	
	
	
	//=====Personal Info=======//
	public static String userListPage = "http://agroportal.grameen-intel.com/unifiedeagro/user/list";
	public static String firstName ="sajib";
	public static String lastName ="abc";
	public static String email ="sajib@gmail.com";
	public static String userName ="sajib";
	public static String password ="123456";
	public static String phone ="1234567890";
	public static String address ="Dhaka, Bangladesh";
//	public static String firstName ="sajib";
	
// static WebElement createButton = driver.findElement(By.className("create"));	
	
	

}

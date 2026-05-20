package Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project1 
{
	@Test
 public void login()
 {
	System.out.println("launching a chrome browser");
	
	//Test 1---Launch chrome browser
	WebDriver driver=new ChromeDriver();
	
	//website launch
	//driver.get("https://www.google.com");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//to max window
	driver.manage().window().maximize();
	
	
	//get the title of webpage
	String title=driver.getTitle();
	System.out.println("Title of page is---->"+title);
	
	//wait for 5 seconds then close browser
			//Thread.sleep(5000);
			
			//to close browser
			driver.close();		
			
	
}
}

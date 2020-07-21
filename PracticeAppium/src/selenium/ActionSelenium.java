package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionSelenium {
	
	
	public static WebDriver driver;
	
	public static void DriverInitialize() {

	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromeDriver/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	 driver.get("http://inedgetest.peopledesk.in/retail/distributor/manage_distributor");

	driver.manage().window().maximize();
	
	}
	
	public static int Framecount(By by) {
		
		int i;

		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		
		for(i=0;i<framecount;i++) {
			
			driver.switchTo().frame(i);
			
			int count = driver.findElements(by).size();
			
			if(count>0) {
				
				break;
			}
			else
			{
				System.out.println("continue loop");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}

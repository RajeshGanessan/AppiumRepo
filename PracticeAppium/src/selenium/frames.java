package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames extends ActionSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DriverInitialize();
		
	
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int number=Framecount(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		//	driver.switchTo().defaultContent();
		
		
		int verify = Framecount(By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(verify);
		System.out.println(driver.findElement(By.className("rc-imageselect-payload")).isEnabled());
		//driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
			

			
		}
		
		
	}



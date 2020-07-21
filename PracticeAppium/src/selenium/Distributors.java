package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Distributors extends ActionSelenium {

	public static void main(String[] args) {
		
		
		
		
	   DriverInitialize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("narmadhaasenthil@gmail.com");
	   
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
	   
	   driver.findElement(By.id("sign_in_button")).click();
	   
	   driver.findElement(By.xpath("//button[@class='btn blue_btn']")).click();
	   
	   Select list = new Select(driver.findElement(By.xpath("//select[@id='channel_structure']")));
	   
	   System.out.println(list);
	   
	   list.selectByValue("Level 1");

		}

}

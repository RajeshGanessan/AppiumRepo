package WebApps;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import DeviceApps.Action;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Mob extends ActionChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.get("http://m.cricbuzz.com/");

		
		driver.findElement(By.xpath("//span[contains(text(),'Menu')]")).click();
		
		driver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
	
		Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Top Stories')]")).getAttribute("class").contains("header"));
	}
}

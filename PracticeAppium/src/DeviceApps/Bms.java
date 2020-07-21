package DeviceApps;

import java.awt.List;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Bms extends Action{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		
		 AndroidDriver<AndroidElement> driver = DriverCapabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 TouchAction action = new TouchAction(driver);
			//action.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		 
		 driver.findElementByAndroidUIAutomator("text(\"LET'S GET STARTED\")").click();
		 
		// action.tap(905,72).perform();
		 
		 
		 wait(10000);
	 driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
	 wait(1000);
	// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Coimbatore\"));").getText();
	// driver.findElementByXPath("//android.widget.FrameLayout[@index='0']").sendKeys("coimbatore");
//	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Coimbatore\").instance(0))");
//	 wait(1000);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Coimbatore\")").click();
//	 driver.findElementByAndroidUIAutomator("text(\"Coimbatore\")").click();
     //driver.findElementByXPath("//android.widget.TextView[@text='Chennai']").click();
	//action.tap(592,1038).perform();	
	 // driver.findElementByXPath("//android.widget.TextView[@text='Coimbatore']").click();


	driver.findElementByXPath("//android.widget.FrameLayout[@index='4']").click();
	//System.out.println(driver.findElementByClassName("android.support.v7.widget.LinearLayoutCompat").getSize());
		
	}

}

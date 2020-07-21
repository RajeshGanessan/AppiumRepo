
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends Action{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();	
				
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait(1000);
		
			TouchAction action = new TouchAction(driver);
			//action.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
			wait(1000);
			driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
			wait(1000);
			//action.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofMillis(3000)).release().perform();
			wait(1000);
			System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").getText());
	}

}

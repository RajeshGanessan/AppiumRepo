import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Home extends Action {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		TouchAction action = new TouchAction(driver);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		wait(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		wait(1000);
		driver.findElementById("android:id/checkbox").click();
		wait(1000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		wait(1000);
		driver.findElementByXPath("//android.widget.FrameLayout[@index='0']").sendKeys("this is my appium");
		wait(1000);
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
	}

}

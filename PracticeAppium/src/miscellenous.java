import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscellenous extends Action {
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver = capabilities();	
		
		String context = driver.getContext();
		System.out.println(context);
		String Activity = driver.currentActivity();
		System.out.println(Activity);
		
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.navigate().back();
	}

}

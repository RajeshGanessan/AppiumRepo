package HybridApps;

import java.net.MalformedURLException;

import DeviceApps.Action;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridRun extends Hybridtest{

	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Action();
		
		TouchAction action = new TouchAction(driver);
		
		
	}
}

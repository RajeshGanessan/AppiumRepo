package HybridApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybridtest {
	
	public static AndroidDriver<AndroidElement> Action() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		
		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.inedgenxt.tobetest");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.heptagon.peopledesk.dashboard.DashboardActivity");
		dc.setCapability("autoGrantPermissions", "true");
		dc.setCapability("autoAcceptAlerts", "true");
		
		 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;

		
	}
	
	

}

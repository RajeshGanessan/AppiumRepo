import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Action {
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver;
		
		File fl = new File("apks");
		File app = new File(fl,"InEDGE.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel2");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("autoAcceptAlerts", "true");
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		}
	
	public static void wait(int Time) throws InterruptedException {
		Thread.sleep(Time);
	}
	}


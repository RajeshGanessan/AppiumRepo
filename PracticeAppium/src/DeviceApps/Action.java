package DeviceApps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Field;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Action {

	public static AndroidDriver<AndroidElement> DriverCapabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		
		File appdir = new File("src");
		File app = new File(appdir,"InEDGENXT_Test.apk");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,120);
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("autoAcceptAlerts", "true");
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, value);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage
		return driver;
		
	}
	
	
	public static void wait(int timeout) throws InterruptedException {
		Thread.sleep(timeout);
	}

}

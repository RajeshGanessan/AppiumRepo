package DeviceApps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Inedge extends Action {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
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
		
		TouchAction action = new TouchAction(driver);
		
		
        wait(4000);		
		driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("inedgetest");
		wait(2000);
		//Tap(driver.findElementByXPath("//android.widget.TextView[@text='Next']"));
	
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		
		wait(2000);
		
		driver.findElementById("com.inedgenxt.tobetest:id/tiet_user_name").sendKeys("5002");
		wait(2000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.inedgenxt.tobetest:id/tiet_password\"));");
		driver.navigate().back();
		wait(1000);
		driver.findElementById("com.inedgenxt.tobetest:id/tiet_password").sendKeys("Admin@123");
		wait(1000);
		System.out.println(driver.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.inedgenxt.tobetest:id/tv_login')]").isDisplayed());
		driver.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.inedgenxt.tobetest:id/tv_login')]").click();
		wait(2000);
		driver.findElementById("com.inedgenxt.tobetest:id/tv_you").click();
		//System.out.println(driver.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.inedgenxt.tobetest:id/tv_you')]").isDisplayed());
		AndroidElement you = driver.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.inedgenxt.tobetest:id/tv_you");
		action.tap(tapOptions().withElement(element(you)));
		
	}
}

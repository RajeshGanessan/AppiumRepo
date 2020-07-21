import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InEdgeTest extends Action {

public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		TouchAction action = new TouchAction(driver);
		
		wait(4000);		
		driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("inedgetest");
		
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
}
}
		\\\


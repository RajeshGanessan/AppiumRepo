import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends Action {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();	
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait(1000);
        System.out.println(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").getText());
	}

}

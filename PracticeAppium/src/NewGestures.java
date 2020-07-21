import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class NewGestures extends Action {

	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();	
		//TouchAction
		
				TouchAction action = new TouchAction(driver);
				
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait(1000);
		WebElement exp_list = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		action.tap(tapOptions().withElement(element(exp_list))).perform();
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		WebElement names = driver.findElementByXPath("//android.widget.TextView[@text='Fish Names']");
		action.longPress(longPressOptions().withElement(element(names)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
		}
	
}

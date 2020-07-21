import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



public class swipe extends Action {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();	
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();	
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		wait(1000);
		TouchAction action = new TouchAction(driver);
		//preforming the swipe action
		//action.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(3000)).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
        WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
		action.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	}
	
}	
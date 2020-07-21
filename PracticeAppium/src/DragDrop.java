import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



public class DragDrop extends Action{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();	
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait(1000);
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction action = new TouchAction(driver);
	
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		action.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	}

}

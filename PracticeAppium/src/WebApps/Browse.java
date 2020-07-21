package WebApps;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browse extends ActionChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver = capabilities();
	
		driver.get("http://inedgetest.peopledesk.in/login");
		driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("chetan@heptagon.in");
		driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("Admin@123");
		driver.findElementByXPath("//*[@id=\"sign_in_button\"]").click();
	}

}

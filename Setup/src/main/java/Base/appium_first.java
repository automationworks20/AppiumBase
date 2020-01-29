package Base;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appium_first extends baseappium {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Alarm']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Alarm Controller']").click();
//		List<MobileElement> mobileElements = <MobileElement>driver.findElementsByClassName("");

//		String selector = "new UiSelector().className(\"ScrollView\").getChildByText(new UiSelector().className(\"android.widget.TextView\"), \"Voice Recognition\")";
//		driver.findElement(MobileBy.AndroidUIAutomator(selector));
//		
	}

}

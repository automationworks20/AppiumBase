package Pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.support.PageFactory;

import Base.baseappium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ButtonPage extends baseappium {

	public static AndroidDriver driver;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='App]")
	AndroidElement views;
	

	
	public ButtonPage() throws MalformedURLException {
//		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//	public ViewsPage ClickOnViewsButton() {
//		views.click();
//		return new ViewsPage();
//	}
	
	public void ClickOnViewsButton() {
		views.click();
		
	}
}

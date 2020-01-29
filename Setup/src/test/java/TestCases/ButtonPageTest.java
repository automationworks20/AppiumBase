package TestCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseappium;
import Pages.ButtonPage;
import Pages.ViewsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ButtonPageTest extends baseappium {

	ButtonPage buttonPage;
	ViewsPage viewsPage;
	
	public ButtonPageTest(){
		super();
		
	}
	
	@BeforeClass
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Alarm']").click();


	}
//	@BeforeClass
//	public void setUp() throws MalformedURLException {
//		Capabilities();
//		buttonPage = new ButtonPage();
//		viewsPage = new ViewsPage();
//		}

	@Test
	public void viewsButtonTest() {
		buttonPage.ClickOnViewsButton();
	}
	

}

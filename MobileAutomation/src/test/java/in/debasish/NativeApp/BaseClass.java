package in.debasish.NativeApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {
	
	public AndroidDriver driver;
	
	AppiumDriverLocalService service;
	
	@BeforeClass
	public void configuration() throws MalformedURLException {

	File app = new File("C:\\Users\\debasish\\Downloads", "appium-api-demos-3-3-1.apk");

	File js = new File("C:\\Users\\Debasish\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
	service = new AppiumServiceBuilder().withAppiumJS(js).withIPAddress("0.0.0.0")
			.withArgument(GeneralServerFlag.BASEPATH, "wd/hub").usingPort(4723).build();
	service.start();

	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability("app", app.getAbsolutePath());
	cap.setCapability("deviceName", "emulator-5554");
	cap.setCapability("platformName", "Android");
	cap.setCapability("automationName", "UiAutomator2");

	driver = new AndroidDriver(new URL("http://192.168.0.100:4723/wd/hub"), cap);
	
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}

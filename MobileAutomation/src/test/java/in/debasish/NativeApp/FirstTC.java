package in.debasish.NativeApp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class FirstTC {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		File app = new File("C:\\Users\\debasish\\Downloads", "appium-api-demos-3-3-1.apk");

		File js = new File("C:\\Users\\Debasish\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(js).withIPAddress("0.0.0.0")
				.withArgument(GeneralServerFlag.BASEPATH, "wd/hub").usingPort(4723).build();
		service.start();

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("deviceName", "10BD3125E10009C");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName", "UiAutomator2");

		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.1.5:4723/wd/hub"), cap);

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]")).click();

	}
}

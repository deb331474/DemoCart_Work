package in.debasish.NativeApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class LongPressEvent extends BaseClass{

	

	@Test
	public void longPressonPPlLink() throws InterruptedException{
		
		WebElement viewBtn = driver.findElement(AppiumBy.accessibilityId("Views"));

		viewBtn.click();

		WebElement expandLists = driver
				.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Expandable Lists\")"));
		expandLists.click();

		WebElement customAdapter = driver
				.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"1. Custom Adapter\")"));

		customAdapter.click();

		WebElement pplNameslink = driver
				.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")"));

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) pplNameslink).getId(), "duration", 2000));
		Thread.sleep(2000);

	}

}

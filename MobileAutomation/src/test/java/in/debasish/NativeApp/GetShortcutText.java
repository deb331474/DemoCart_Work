package in.debasish.NativeApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class GetShortcutText {

	public static void main(String[] args) throws MalformedURLException {

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

		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.103:4723/wd/hub"), cap);
		
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Menu")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement inflateBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/text1")));
		
		inflateBtn.click();
		
		WebElement titleDropdown=wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/text1")));
		
		titleDropdown.click();
		
		//WebElement dropdownItem = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submenu\")"));
		
		WebElement dropdownItem = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Submenu\"]"));
		
		dropdownItem.click();
		
		WebElement subMenuTextValidation=driver.findElement(By.xpath("//android.widget.TextView[@text=\"If you want to choose another menu resource, go back and re-run this activity.\"]"));
		
		String text=subMenuTextValidation.getText();
		
		System.out.println(text);
		
		Assert.assertEquals(text, "If you want to choose another menu resource, go back and re-run this activity.");
	
	}

}

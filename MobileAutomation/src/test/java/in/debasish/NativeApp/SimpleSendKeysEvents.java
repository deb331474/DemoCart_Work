package in.debasish.NativeApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class SimpleSendKeysEvents {

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

		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.100:4723/wd/hub"), cap);
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement prefBtn=driver.findElement(AppiumBy.accessibilityId("Preference"));
		
		prefBtn.click();
		
        WebElement prefDep=driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies"));
        
        wait.until(ExpectedConditions.elementToBeClickable(prefDep));
		
        prefDep.click();
        
        WebElement wifiChekBox=driver.findElement(By.id("android:id/checkbox"));
        wifiChekBox.click();
        
        
        WebElement wifiSettingBtn=driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]"));
        
        wait.until(ExpectedConditions.elementToBeClickable(wifiSettingBtn));
        
        wifiSettingBtn.click();
        
        WebElement wifiPassword=driver.findElement(By.id("android:id/edit"));
        wifiPassword.sendKeys("Debasish@123");
        
        
        WebElement okBtn=driver.findElement(By.id("android:id/button1"));
        
        okBtn.click();
        
        
		
	}

}

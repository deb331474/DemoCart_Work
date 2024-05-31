package in.debasish.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import in.debasish.TestBase.BaseTest;
import in.debasish.utilities.TestUtil;

public class AddCustomerTest extends BaseTest {

	@Test(dataProviderClass = TestUtil.class, dataProvider ="dp")
	public void addCustomerTest(Hashtable<String, String> data) throws Exception {

		/*
		 * if (!data.get("runmode").equals("Y")) {
		 * 
		 * throw new
		 * SkipException("Skipping the test case as the Run mode for data set is NO"); }
		 */
		
		 if(!(TestUtil.isTestRunnable("AddCustomerTest", excel))){
				
				throw new SkipException("Skipping the test "+"openAccountTest".toUpperCase()+ "as the Run mode is NO");
			}

		click("addCustBtn_CSS");
		type("firstname_CSS", data.get("firstname"));
		type("lastname_CSS", data.get("lastname"));
		type("postcode_CSS", data.get("postcode"));
		click("addbtn_CSS");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();

		Thread.sleep(2000);
		// driver.findElement(By.cssSelector(OR.getProperty("homeBtn_CSS"))).click();

	}

}

package in.debasish.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.TestBase.BaseTest;

public class BankManagerLoginTest extends BaseTest{
	
	
	@Test
	public void loginAsManager() {
		
		click("bmlBtn_CSS");
		log.debug("inside the bank manager login Test");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login Not Successfull");
		log.debug("The bank manager login Test executed successfully");
		
	}

	
}

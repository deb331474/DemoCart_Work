package in.debasish.testScripts;

import java.util.Properties;
import java.util.Scanner;

import in.debasish.resources.JsonHandle;
import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.JsonParsing;
import in.debasish.utilities.JsonReplacement;
import in.debasish.utilities.PropertiesHandle;
import io.restassured.response.Response;

public class TC3_GetParticularAPIBatch {


	public void TC3_GetParticularTest() throws Exception {

		Properties p=PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		HTTPMethods hm=new HTTPMethods(p);
		hm.getParticularMethod("QA_URI_API", TC2_PostRequestAPIBatchUsingUserInput.returnIdValue);
		
	}

}

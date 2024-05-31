package in.debasish.testScripts;

import java.util.Properties;
import java.util.Scanner;

import in.debasish.resources.JsonHandle;
import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.JsonParsing;
import in.debasish.utilities.JsonReplacement;
import in.debasish.utilities.PropertiesHandle;
import io.restassured.response.Response;

public class TC6_PutRequest {
	
	public void testcase6Put() throws Exception {
		
		Properties p = PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		String requestBody = JsonHandle
				.readJsonData("../ApiAutomation/src/test/java/in/debasish/resources/updaterequestBody.json");
		System.out.println("Please enter id value");
		Scanner s = new Scanner(System.in);
		Integer idValue = s.nextInt();
		requestBody = JsonReplacement.assighnJsonValues(requestBody, "id",TC2_PostRequestAPIBatchUsingUserInput.returnIdValue);
		HTTPMethods hm = new HTTPMethods(p);
		Response res=hm.putMethod(requestBody, "QA_URI_API", TC2_PostRequestAPIBatchUsingUserInput.returnIdValue);
	}

}

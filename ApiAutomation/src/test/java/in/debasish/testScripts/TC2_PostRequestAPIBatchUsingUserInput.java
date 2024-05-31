package in.debasish.testScripts;

import java.util.Properties;
import java.util.Scanner;

import in.debasish.resources.JsonHandle;
import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.JsonParsing;
import in.debasish.utilities.JsonReplacement;
import in.debasish.utilities.PropertiesHandle;
import io.restassured.response.Response;

public class TC2_PostRequestAPIBatchUsingUserInput {

	public static String returnIdValue;

	public void TC2_PostApi() throws Exception {

		Properties p = PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		String requestBody = JsonHandle
				.readJsonData("../ApiAutomation/src/test/java/in/debasish/resources/requestBody.json");
		System.out.println("Please enter id value");
		Scanner s = new Scanner(System.in);
		Integer idValue = s.nextInt();
		requestBody = JsonReplacement.assighnJsonValues(requestBody, "id", idValue.toString());
		HTTPMethods hm = new HTTPMethods(p);
		Response resObj = hm.postMethod(requestBody, "QA_URI_API");
		returnIdValue = JsonParsing.doParsing(resObj, "id");
	}

}

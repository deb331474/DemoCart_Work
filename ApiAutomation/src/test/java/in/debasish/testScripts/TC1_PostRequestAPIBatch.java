package in.debasish.testScripts;

import java.util.Properties;

import in.debasish.resources.JsonHandle;
import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.PropertiesHandle;

public class TC1_PostRequestAPIBatch {
	
	public static void main(String[] args) throws Exception {
		
		Properties p=PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		String requestBody=JsonHandle.readJsonData("../ApiAutomation/src/test/java/in/debasish/resources/requestBody.json");
		HTTPMethods hm=new HTTPMethods(p);
		hm.postMethod(requestBody, "QA_URI_API");
	}

}

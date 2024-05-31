package in.debasish.testScripts;

import java.util.Properties;

import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.PropertiesHandle;

public class TC2_GetAllApiBatchStudents {

	public void getAllApiBatchTest() throws Exception {

		Properties p=PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		HTTPMethods hm=new HTTPMethods(p);
		hm.getMethod("QA_URI_API");
	}

}
